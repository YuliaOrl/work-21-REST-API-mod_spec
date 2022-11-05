package models.lombok;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSingleResponseLombokModel {
    private UserData data;
    private UserSupport support;
}
