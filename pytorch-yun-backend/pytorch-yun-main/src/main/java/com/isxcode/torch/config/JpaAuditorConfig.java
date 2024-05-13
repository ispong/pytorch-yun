package com.isxcode.torch.config;

import static com.isxcode.torch.common.config.CommonConfig.USER_ID;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class JpaAuditorConfig implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.ofNullable(USER_ID.get());
    }
}
