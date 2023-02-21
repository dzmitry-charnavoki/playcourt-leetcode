package problems.p0100_0200.p0196_delete_duplicate_emails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.zapodot.junit.db.annotations.EmbeddedDatabase;
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest;
import org.zapodot.junit.db.common.CompatibilityMode;
import problems.utils.WithQuery;

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqlResources = "src/main/java/problems/p0100_0200/p0196_delete_duplicate_emails/sql-schema.sql")
@Execution(ExecutionMode.SAME_THREAD)
class QueryTest {

    @Tag("Database")
    @Test
    @SneakyThrows
    void testScript1(final @EmbeddedDatabase Connection connection,
                     final @WithQuery String script) {
        try (final Statement statement = connection.createStatement();
        ) {
            final int count = statement.executeUpdate(script);
            assertEquals(1, count);
            final ResultSet resultSet = statement.executeQuery("select email from Person");
            assertTrue(resultSet.next());
            assertEquals("john@example.com", resultSet.getNString(1));
            assertTrue(resultSet.next());
            assertEquals("bob@example.com", resultSet.getNString(1));
            assertFalse(resultSet.next());
        }
    }

}
