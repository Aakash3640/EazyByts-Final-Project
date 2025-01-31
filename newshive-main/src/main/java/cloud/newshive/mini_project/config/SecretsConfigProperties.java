package cloud.newshive.mini_project.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ConfigurationProperties(prefix = "secret")
public class SecretsConfigProperties {

    private String newsApiKey;
    private String mailersendApiKey;
    private String domain;

    // Getter and setter methods
    public String getNewsApiKey() {
        return newsApiKey;
    }

    public void setNewsApiKey(String newsApiKey) {
        this.newsApiKey = newsApiKey;
    }

    public String getMailersendApiKey() {
        return mailersendApiKey;
    }

    public void setMailersendApiKey(String mailersendApiKey) {
        this.mailersendApiKey = mailersendApiKey;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
