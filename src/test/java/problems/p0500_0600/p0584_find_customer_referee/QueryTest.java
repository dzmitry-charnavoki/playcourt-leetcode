package problems.p0500_0600.p0584_find_customer_referee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    initialSqlResources = "src/main/java/problems/p0500_0600/p0584_find_customer_referee/sql-schema.sql")
@Execution(ExecutionMode.SAME_THREAD)
class QueryTest {

    @Tag("Database")
    @Test
    @SneakyThrows
    void testScript1(final @EmbeddedDatabase Connection connection,
                     final @WithQuery String script) {

        try (final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery(script)) {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            String name = rsmd.getColumnName(1);
            assertEquals("NAME", name);
            assertTrue(resultSet.next());
            assertEquals("Will", resultSet.getString(1));
            assertTrue(resultSet.next());
            assertEquals("Jane", resultSet.getString(1));
            assertTrue(resultSet.next());
            assertEquals("Bill", resultSet.getString(1));
            assertTrue(resultSet.next());
            assertEquals("Zack", resultSet.getString(1));
            assertFalse(resultSet.next());
        }
    }

}
