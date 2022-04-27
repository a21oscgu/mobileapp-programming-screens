
# Rapport

# Assignment 3: Layouts & Views

**Den här appen är forkad från LenaSYS/mobileapp-programming-widgets. Appen har en constraint layout. I appen har tre widgets lagts till. Det finns alltså en TextView, en ImageView, en EditText och en Button. Alla widgets har placerats m.h.a. margins och utseendet har även ändrats, se skärmklipp nedanför. Ifall knappen trycks in kommer meddelandet "We clicked on the button!" upp i konsolen. Appens Appbar har även fått en annan färg (jag är medveten om att det inte är helt anpassat efter material design). Den ImageView som skapades syns även i skärmklippet nedanför.**

**Denna kodsnutt visar den ImageView som har skapats:**

```
<ImageView
        android:id="@+id/imageViewKiwi"
        android:layout_width="300dp"
        android:layout_height="300dp"
        android:layout_marginBottom="185dp"
        android:contentDescription="@string/my_kiwi"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/kiwi" />
```

**Detta skärmklipp visar  i appen:**

<img src="/Screenshot_20220427_160615.png" width="60%">

**Detta skärmklipp visar  i appen:**

<img src="/Screenshot_20220427_160656.png" width="30%">


**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
