package ru.gretchen.quadraticequationsolving.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String formula;
    private double D;
    private double x1;
    private double x2;
}
