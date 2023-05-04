package com.netflix_clone.eureka;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created on 2023-05-04
 * Project netflix_clone
 */
@Component
public class WakeUp {
    @EventListener(value = {ApplicationReadyEvent.class})
    public void message() {
        System.out.println("" +
                "    ________  ______  ________ __ ___    __\n" +
                "   / ____/ / / / __ \\/ ____/ //_//   |  / /\n" +
                "  / __/ / / / / /_/ / __/ / ,<  / /| | / / \n" +
                " / /___/ /_/ / _, _/ /___/ /| |/ ___ |/_/  \n" +
                "/_____/\\____/_/ |_/_____/_/ |_/_/  |_(_)    is ready");
    }
}
