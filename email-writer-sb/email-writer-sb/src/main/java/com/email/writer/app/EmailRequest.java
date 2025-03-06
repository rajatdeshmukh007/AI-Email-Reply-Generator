package com.email.writer.app;

import lombok.Data;
import lombok.Getter;

@Data
public class EmailRequest {
    private String emailContent;
    // Assuming 'tone' is a String variable that holds the tone value.
    @Getter
    private String tone;

}
