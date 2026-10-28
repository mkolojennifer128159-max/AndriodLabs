package com.jm.lab7;

import ...

public class MainActivity extends AppCompatActivity {

    // Widget Declaration
    EditText e_name, e_contact;
    Button b_design1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add References
        b_design1 = findViewById(R.id.b_design1);
        e_name = findViewById(R.id.m_e_name);
        e_contact = findViewById(R.id.m_e_contact);

        // Using Listeners

        b_design1.setOnClickListener(v -> {
            String name = e_name.getText().toString();
            String contact = e_contact.getText().toString();

            Intent intent = new Intent packageContext: MainActivity.this, design1.class)
            intent.putExtra name: "name", name);intent.putExtra name: "contact",contact);
            startActivity(intent)
        });
    }
}
