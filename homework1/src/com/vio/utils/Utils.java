package com.vio.utils;

import java.util.Optional;

public class Utils {

    public static Optional<Integer> randomOptionalGenerator() {
        return Math.random() >= 0.5 ? Optional.of(1) : Optional.empty();
    }


}
