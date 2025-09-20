package com.example;

import com.example.part1Name.Name;
import com.example.part2Address.Address;
import com.example.part3Email.Email;
import com.example.part4Phone.Phone;

public class Main {
    public static void main(String[] args) {
        Name.main(args);
        Address.main(args);
        Email.main(args);
        Phone.main(args);
    }
}


/*
package com.example;

public class Main {
    public static void main(String[] args) {
        com.example.part1Name.Name.main(args);
        com.example.part2Address.Address.main(args);
        com.example.part3Email.Email.main(args);
        com.example.part4Phone.Phone.main(args);
    }
}
*/