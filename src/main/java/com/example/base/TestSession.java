package com.example.base;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.openqa.selenium.WebDriver;

@Jacksonized
@Builder
@Data
public class TestSession {
    private WebDriver driver;
    private String urlUnderTest;
}
