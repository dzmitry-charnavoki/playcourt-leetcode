package problems.p0100_0200.p0182_duplicate_emails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.zapodot.junit.db.annotations.EmbeddedDatabase;
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest;
import org.zapodot.junit.db.common.CompatibilityMode;
import problems.FileUtil;

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqlResources = "src/main/java/problems/p0100_0200/p0182_duplicate_emails/sql-schema.sql")
class QueryTest {

    @Test
    @SneakyThrows
    void testScript1(final @EmbeddedDatabase Connection connection) {
        String query = FileUtil.script("src/main/java/problems/p0100_0200/p0182_duplicate_emails/",
            "script.sql");
        try (final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery(query)) {
            assertTrue(resultSet.next());
            assertEquals("a@b.com", resultSet.getNString(1));
            assertFalse(resultSet.next());
        }
    }


}
