package JsonReader;

public class JsonItemString {

    private static String JsonData = "{\n" +
            " \"recipeList\": [\n" +
            "  {\n" +
            "   \"recipeName\": \"Steaksalat\",\n" +
            "   \"ingredients\": [\"pastinak\", \"gulerod\", \"kartoffel\", \"olivenolie\",\"salt\",\"pebber\",\"entrecote\",\"smør\",\"salat\",\"béarnaise\",\"estragon\"],\n" +
            "   \"ingredientsExact\": \"200 g pastinak, 300 g gulerødder, 300 g kartofler, 2 spsk. olivenolie, Salt og sort peber, 2 stk entrecote à ca. 175 g, 1 spsk. smør, 250 g blandet salat, 1 glas béarnaise sauce 330 g, 4 spsk frisk estragon\",\n" +
            "   \"instructions\": \"Skrub pastinak, gulerødder og kartofler og skær dem i mundrette bidder. Vend dem med 1 spsk olivenolie og krydr med salt og peber. Fordel dem i ét lag i et ovnfast fad og steg dem ved 200°C i 20-25 min. Krydr kødet med salt og peber og steg de i en blanding af 1 spsk olie og smør i en varm pande, 2-3 min. pr. side. Lad kødet trække i 5 min. og skær det i skiver. Pluk salaten og anret med de bagte rodfrugter, stykker af kød og kold béarnaise sauce. Pynt med estragon.\",\n" +
            "   \"timeNeeded\": \"30\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Pasta med torsk\",\n" +
            "   \"ingredients\": [\"hvidløg\", \"olivenolie\", \"spinat\",\"basilikumblade\",\"salt\",\"peber\",\"cherrytomater\",\"pasta\",\"torskefilet\"],\n" +
            "   \"ingredientsExact\": \"1 fed hvidløg, 1 spsk. olivenolie, 250 g frisk spinat, 1 håndfuld basilikumblade, Salt og sort peber, 2 dåser cherrytomater, 400 g pasta f.eks. penne eller rigatoni, 600 g torskefilet uden skind\",\n" +
            "   \"instructions\": \"Hak hvidløget fint. Varm olivenolie i en gryde, og steg hvidløget i et halvt minut. Tilsæt spinat og basilikum, og vend det rundt, til spinaten falder let sammen. Krydr med salt og peber, og kom cherrytomater i. Lad saucen simre, mens du koger pasta og bager fisk. Kog pastaen efter pakkens anvisning i letsaltet vand. Del fisken i 4 portionsstykker, og krydr med salt og peber. Bag fisken i 12 min. ved 200°C – lidt mindre, hvis torsken ikke er så tyk. Vend pastaen sammen med tomatsaucen, og server med fisken oven på og evt. lidt ekstra basilikum.\",\n" +
            "   \"timeNeeded\": \"30\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Mørbrad\",\n" +
            "   \"ingredients\": [\"smør\",\"svinemørbrad\",\"peber\",\"timian\",\"serranoskinke\",\"kartofler\",\"olivenolie\",\"salt\",\"timian\",\"porrer\",\"svampemix\",\"brombær\",\"ristede valnødder\"],\n" +
            "   \"ingredientsExact\": \"50 g smør, 1 stk svinemørbrad, Kværnet peber, Frisk timian, 80 g serranoskinke i skiver, 800 g kartofler, ½ dl olivenolie, Salt, Frisk timian, 4 porrer, 200 g svampemix, 150g brombær, 75 g ristede valnødder\",\n" +
            "   \"instructions\": \"Afpuds svinemørbrad og fjern sølvsenen. Varm en pande op og brun mørbraden i smør, til den er gylden på alle sider. Tag den af varmen og læg den på et skærebræt. Krydr med salt, kværnet peber og friske timiankviste. Vikl skiver af serranoskinke omkring mørbraden, og hold det evt. fast med kødnåle. Skær kartofler i grove stykker, og kom dem i et ovnfast fad. Vend dem med olivenolie, salt, peber og frisk timian. Giv kartoflerne ca. 30 minutter ved 200°C i almindelig ovn. Skær porrer i skrå skiver. Kom herefter mørbraden i fadet med kartofler og stik porrer ned mellem kartoflerne. Giv det hele 15 minutter ved 225°C. Tag mørbraden op og hold den varm under et klæde. Giv evt. kartoflerne lidt mere, hvis de ikke er møre.Varm en pande op med smør, til det bruser. Skyl svampene og riv dem fra hinanden. Steg dem på panden, til de er let gyldne, og krydr herefter med salt og peber. Anret skiver af mørbrad i et serveringsfad med ovnstegte kartofler og porrer og pynt med svampe, friske brombær, ristede valnødder og friske timiankviste.\",\n" +
            "   \"timeNeeded\": \"30\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Vintergryde\",\n" +
            "   \"ingredients\": [\"smør\",\"paprika\",\"kylling\",\"løg\",\"hvidløg\",\"chili\",\"rosmarin\",\"timian\",\"flåede tomater\",\"grønsagsbouillon\",\"laurbærblade\",\"gulerødder\",\"pastinak\",\"kikærter\",\"salt\",\"peber\"],\n" +
            "   \"ingredientsExact\": \"25 g smør, 2 tsk paprika, 4 stk kyllingeoverlår inkl. rygben, 2 små løg, 3 fed hvidløg, 1 lille rød chili, 3 stængler rosmarin, 3 stængler timian, 2 ds flåede tomater, 1 tsk grønsagsbouillon, 2 laurbærblade, 350 g gulerødder, 350 g pastinak, 1 ds kogte skyllede kikærter, Salt og friskkværnet peber\",\n" +
            "   \"instructions\": \"Varm en stor støbejernsgryde op med smør, til det bruser. Tilsæt paprika. Brun kyllingeoverlår på begge sider. Læg kyllingen op på en tallerken. Skær løg i både og hvidløg i skiver og kom begge dele i gryden sammen med rød chili og krydderurter. Vend det lidt rundt. Tilsæt kyllingeoverlår igen. Kom flåede tomater, grønsagsbouillon og laurbærblade ved. Lad retten simre under låg i 25 minutter. Skær imens gulerødder i tykke skiver og pastinak i mundrette stykker. Når de 25 minutter er gået, tilsættes både gulerødder og pastinak. Lad retten koge i 15 minutter uden låg, og tilsæt de kogte, skyllede kikærter. Smag til med salt og peber.\",\n" +
            "   \"timeNeeded\": \"30\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Flæskesteg\",\n" +
            "   \"ingredients\": [\"svinekam\",\"salt\",\"kartofler\",\"rødbeder\",\"gulerødder\",\"timian\",\"olivenolie\",\"peber\",\"grønkål\",\"soltørrede tranebær\"],\n" +
            "   \"ingredientsExact\": \"1 kg svinekam med svær uden ben, 2 tsk fint salt, 700 g kartofler, 400 g rødbeder, 300 g gulerødder, 4 stængler frisk timian, ½ dl olivenolie, Salt og peber, 50 g grønkål, 100 g soltørrede tranebær\",\n" +
            "   \"instructions\": \"Dup stegen med et rent viskestykke. Snit sværene efter, og kom fint salt imellem sværene. Skær kartofler i både, og skær rødbeder og gulerødder i mindre stykker. Kom alle 3 ingredienser i en bradepande sammen med timian, olivenolie, salt og peber. Stil flæskestegen på rodfrugterne, og forsøg at få den til at stå så lige, som muligt. Steg det hele i almindelig ovn ved 200°C, eller intervalgrill retten ved 190°C i 60 minutter. Giv flæskestegen lidt grill til slut, hvis sværene ikke er er helt sprøde. Tag stegen ud af ovnen, stil den på et skærebræt og lade den hvile i 15 minutter inden udskæring. Giv rodfrugterne yderligere 10 minutter i ovnen. Hak grønkål groft imens. Lige inden servering vendes grofthakket grønkål og tranebær i rodfrugtsblandingen. Skær skiver af flæskestegen, og servér på toppen af rodfrugterne.\",\n" +
            "   \"timeNeeded\": \"60\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Lammeskank\",\n" +
            "   \"ingredients\": [\"fennikel\",\"løg\",\"gulerødder\",\"bladselleri\",\"hvidløg\",\"lammeskank\",\"salt\",\"pebber\",\"olivenolie\",\"rosmarin\",\"persille\",\"hvidvin\",\"hønsefond\",\"bønner\",\"linser\"],\n" +
            "   \"ingredientsExact\": \"2 fennikler, 1 løg, 2 gulerødder, 2 stilke bladselleri, 2 fed hvidløg, 4 lammeskanke, Salt og sort peber, 2 spsk. olivenolie, 2 kviste rosmarin, 1 håndfuld bredbladet persille + ekstra til servering, 3 dl tør hvidvin, 3 dl hønsefond eller vand, 150 g grønne bønner, 200 g kogte grønne linser\",\n" +
            "   \"instructions\": \"Skær fennikel, løg, gulerødder, bladselleri og hvidløg i skiver. Krydr lammeskankene med salt og peber, og brun dem i olie i en stor gryde. Tag kødet op, og kom fennikel, løg, gulerødder og bladselleri i gryden. Steg det i ca. 5 min., til grøntsagerne begynder at tage farve. Tilsæt så hvidløg, rosmarinkviste og grofthakket persille. Læg lammeskankene tilbage i gryden, og hæld hvidvin og hønsefond eller vand ved. Læg låg på, og lad skankene simre i 1 ½-2 timer, til kødet er helt mørt og næsten falder af benet. Vend lidt rundt i det undervejs. Tilsæt til sidst grønne bønner og linser, og lad det simre færdigt i 5-10 min. Smag til med salt og peber, og drys med den sidste persille ved servering.\",\n" +
            "   \"timeNeeded\": \"120\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Gullasch\",\n" +
            "   \"ingredients\": [\"smør\", \"gullaschkød\", \"paprika\", \"røget paprika\", \"spidskommen\", \"tomatkoncentrat\", \"løg\", \"hvidløg\", \"knoldselleri\", \"persillerod\", \"gulerødder\", \"bouillon\", \"rødvin\", \"mel\"],\n" +
            "   \"ingredientsExact\": \"25 g smør, 800 g gullaschkød af skært okse, 1 spsk paprika, 1 tsk røget paprika, 2 tsk spidskommen, 1 ds tomatkoncentrat, 2 store hvide løg, 5 fed hvidløg, 400 g knoldselleri, 400 g persillerod, 400 g gulerødder, 1 liter bouillon, 2 dl rødvin, 25 g smør, 2 spsk mel\",\n" +
            "   \"instructions\": \"Varm smør op i en støbejernsgryde, til det bruser. Brun kødet af på alle sider, gør det lidt ad gangen, så gryden forbliver varm. Tilsæt krydderier og rør det hele rundt. Kom tomatkoncentrat ved og lad det stege i et par minutter. Hak løg, knus hvidløg og skær knoldselleri og persillerod i mundrette stykker. Skær gulerødder i tykke skiver. Kom det hele i gryden sammen med 1 liter bouillon og 2 dl rødvin. Lad retten simre under låg i 60 minutter. Er kødet ikke helt mørt, skal retten have yderligere 30 minutter. Bland blødt smør og hvedemel sammen til en smørbolle.Rør det i saucen, så retten bliver jævnet. Lad det småkoge lidt. Smag til med salt og sort, kværnet peber. Drys med hakket persille.\",\n" +
            "   \"timeNeeded\": \"60\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Pulled duck sandwich\",\n" +
            "   \"ingredients\": [\"agurk\", \"hvidvinseddike\", \"vand\", \"rørsukker\", \"flagesalt\", \"peber\", \"confit de canard\", \"brioche burgerboller\", \"syltede rødløg\", \"sennep\", \"rucola\", \"flæskesvær\"],\n" +
            "   \"ingredientsExact\": \"1 agurk, 2 spsk. hvidvinseddike, 2 spsk. vand, 2 tsk. rørsukker, ½ tsk. flagesalt, Sort peber, 1 dåse confit de canard (4 lår), 4 brioche burgerboller, 1 glas syltede rødløg, 4 spsk. sennep, sød eller stærk, ½ bakke rucola, 1 håndfuld flæskesvær\",\n" +
            "   \"instructions\": \"Til agurkesalat skæres agurk i meget tynde skiver. Bland eddike med vand, sukker, salt og lidt peber, og hæld det over agurkeskiverne. Lad dem marinere i 15-30 min. (eller længere). Tag andelårene op af fedtet, og tør det meste fedt af. Læg dem i en bradepande, og varm dem i ovnen ved 200°C i 20-30 min. (følg dåsens anvisning). Brug to gafler til at tage kødet af benene og rive det i grove stykker. Hold kødet lunt i ovnen. Lun briochebollerne, og smør dem med sennep på begge sider. Læg et godt lag andekød på underbollen, og top med agurkesalat, syltede rødløg, knuste flæskesvær og rucola, og læg overbollen på.\",\n" +
            "   \"timeNeeded\": \"60\"\n" +
            "  }\n" +
            " ]\n" +
            "}";

    public static String getJsonData() {
        return JsonData;
    }

    public static void setJsonData(String jsonData) {
        JsonData = jsonData;
    }
}


