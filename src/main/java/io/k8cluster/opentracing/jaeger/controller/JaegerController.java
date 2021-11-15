package io.k8cluster.opentracing.jaeger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jaeger")
public class JaegerController {
    @GetMapping(path = "/random")
    public String name() {
        return "hello!!!";
    }
}
