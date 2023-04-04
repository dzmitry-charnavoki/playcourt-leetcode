package problems.p0100_0200.p0185_department_top_three_salaries;

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
    initialSqlResources = "src/main/java/problems/p0100_0200/p0185_department_top_three_salaries/sql-schema.sql")
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
            assertEquals("DEPARTMENT", rsmd.getColumnLabel(1));
            assertEquals("EMPLOYEE", rsmd.getColumnLabel(2));
            assertEquals("SALARY", rsmd.getColumnLabel(3));
            assertTrue(resultSet.next());
            assertEquals("IT", resultSet.getString("DEPARTMENT"));
            assertEquals("Max", resultSet.getString("EMPLOYEE"));
            assertEquals(90000, resultSet.getInt("SALARY"));
            assertTrue(resultSet.next());
            assertTrue(resultSet.next());
            assertTrue(resultSet.next());
            assertTrue(resultSet.next());
            assertTrue(resultSet.next());
            assertFalse(resultSet.next());
        }
    }

}
