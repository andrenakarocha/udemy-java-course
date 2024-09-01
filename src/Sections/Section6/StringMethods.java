package Sections.Section6;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "  hello  ";

        System.out.println(s.length()); // 7
        System.out.println(s.contains("he")); // true
        System.out.println(s.isEmpty()); // false
        System.out.println(s.toUpperCase()); // "  HELLO  "
        System.out.println(s.startsWith("h")); // false
        System.out.println(s.endsWith(" "));// true
        System.out.println(s.replace("ll", "LL")); // "  heLLo  "
        System.out.println(s.trim()); // "hello"
        System.out.println(s.strip()); // "hello" (função mais recente)
        System.out.println(s.substring(0, 3)); // "  h"
        System.out.println(Arrays.toString(s.getBytes())); // [32, 32, 104, 101, 108, 108, 111, 32, 32]
        System.out.println(Arrays.toString(s.toCharArray())); // [ ,  , h, e, l, l, o,  ,  ]
        System.out.println(s.charAt(3)); // "h"
        System.out.println(Arrays.toString(s.split("e"))); // [  h, llo  ]

    }
}
