package hu.sg.tp.open.banking;

import hu.sg.tp.open.banking.config.AppProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class OpenBankingExampleApplication implements CommandLineRunner {

    private final AppProperties appProperties;

    public static void main(String[] args) {
        SpringApplication.run(OpenBankingExampleApplication.class, args);
    }

    @Override
    public void run(String @NonNull ... args) {
        log.info("=== EXTERNAL CONFIGURATION LOADED ===");
        log.info("{}", appProperties);
        log.info("====================================");
    }
}
