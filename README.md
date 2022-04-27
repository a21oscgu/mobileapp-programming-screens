
# Rapport

# Assignment 4: Activities & Intents

**Den här appen är forkad från LenaSYS/mobileapp-programming-screens. Appen har två activities, <i>MainActivity</i> och <i>SecondActivity. SecondActivity</i> är satt som start activity (launcher) och liknar en login-activity. I <i>SecondActivity</i> finns det en knapp <i>"Open"</i> som leder användaren till <i>MainActivity</i>. I <i>MainActivity</i> finns det en knapp <i>"Close"</i> som leder användaren tillbaks till <i>SecondActivity</i>. Ifall användaren klickar på knappen kommer en sträng <i>":)"</i> att skickas till <i>MainActivity</i>. Strängen tas emot av <i>MainActivity</i> och visas upp i en TextView ovanför knappen <i>"Close"</i>.**

**Denna kodsnutt visar knappen <i>"Open"</i> som har skapats i <i>SecondActivity</i>:**

```
Button open = findViewById(R.id.open);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SECONDYTA", "Activity starts.");

                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                myIntent.putExtra("name", ":)");
                startActivity(myIntent);
            }
        });
```

**Detta skärmklipp visar upp <i>SecondActivity</i> i appen:**

<img src="/Screenshot_20220427_160615.png" width="40%">

**Detta skärmklipp visar upp <i>MainActivity</i> i appen:**

<img src="/Screenshot_20220427_160656.png" width="40%">