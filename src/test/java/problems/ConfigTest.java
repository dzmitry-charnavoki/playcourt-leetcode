package problems;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.engine.config.JupiterConfiguration.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME;

import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConfigTest {

    Boolean parallelismValue;

    @BeforeEach
    public void init() throws IOException {
        Properties properties = new Properties();
        properties.load(ConfigTest.class.getResourceAsStream("/junit-platform.properties"));
        String prop = properties.getProperty(PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME);
        parallelismValue = Boolean.parseBoolean(prop);
    }

    @DisplayName("test that parallelism is enabled")
    @Test
    public void testConfig() {
        assertTrue(parallelismValue);
    }

}
