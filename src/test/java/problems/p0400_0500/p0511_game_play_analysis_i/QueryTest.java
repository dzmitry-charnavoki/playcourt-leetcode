package problems.p0400_0500.p0511_game_play_analysis_i;

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
    initialSqlResources = "src/main/java/problems/p0400_0500/p0511_game_play_analysis_i/sql-schema.sql")
@Execution(ExecutionMode.SAME_THREAD)
class QueryTest {

    @Tag("Database")
    @Test
    @SneakyThrows
    void testScript1(final @EmbeddedDatabase Connection connection,
                     final @WithQuery String script) {
        try (final Statement statement = connection.createStatement();
        ) {
            final ResultSet resultSet = statement.executeQuery(script);
            assertTrue(resultSet.next());
            assertEquals(1, resultSet.getInt("PLAYER_ID"));
            assertEquals("2016-03-01", resultSet.getString("FIRST_LOGIN"));
            assertTrue(resultSet.next());
            assertEquals(2, resultSet.getInt("PLAYER_ID"));
            assertEquals("2017-06-25", resultSet.getString("FIRST_LOGIN"));
            assertTrue(resultSet.next());
            assertEquals(3, resultSet.getInt("PLAYER_ID"));
            assertEquals("2016-03-02", resultSet.getString("FIRST_LOGIN"));
            assertFalse(resultSet.next());
        }
    }

}
