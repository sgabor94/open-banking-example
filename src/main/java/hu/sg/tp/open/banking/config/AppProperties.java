package hu.sg.tp.open.banking.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "app.config")
public record AppProperties(
) {
}
