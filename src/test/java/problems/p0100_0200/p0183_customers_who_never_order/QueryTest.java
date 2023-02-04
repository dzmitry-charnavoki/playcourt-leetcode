package problems.p0100_0200.p0183_customers_who_never_order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.zapodot.junit.db.annotations.EmbeddedDatabase;
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest;
import org.zapodot.junit.db.common.CompatibilityMode;
import problems.utils.WithQuery;

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqlResources = "src/main/java/problems/p0100_0200/p0183_customers_who_never_order/sql-schema.sql")
class QueryTest {

    @Test
    @SneakyThrows
    void testScript1(final @EmbeddedDatabase Connection connection,
                     final @WithQuery String script) {
        try (final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery(script)) {
            assertTrue(resultSet.next());
            assertEquals("Henry", resultSet.getNString(1));
            assertTrue(resultSet.next());
            assertEquals("Max", resultSet.getNString(1));
        }
    }

}
