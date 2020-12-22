package JsonReader;

public class JsonItemString {

    private static String JsonData = "{\n" +
            " \"recipeList\": [\n" +
            "  {\n" +
            "   \"recipeName\": \"Steaksalat\",\n" +
            "   \"ingredients\": [\"pastinak\", \"gulerod\", \"kartoffel\", \"olivenolie\",\"salt\",\"pebber\",\"entrecote\",\"smør\",\"salat\",\"béarnaise\",\"estragon\"],\n" +
            "   \"ingredientsExact\": \"200 g pastinak,\\n300 g gulerødder,\\n300 g kartofler,\\n2 spsk. olivenolie,\\nSalt og sort peber,\\n2 stk entrecote à ca. 175 g,\\n1 spsk. smør,\\n250 g blandet salat,\\n1 glas béarnaise sauce 330 g,\\n4 spsk frisk estragon\",\n" +
            "   \"instructions\": \"Skrub pastinak, gulerødder og kartofler og skær dem\\ni mundrette bidder. Vend dem med 1 spsk olivenolie\\nog krydr med salt og peber. Fordel dem i ét lag i et\\novnfast fad og steg dem ved 200°C i 20-25 min.\\nKrydr kødet med salt og peber og steg de i en\\nblanding af 1 spsk olie og smør i en varm pande,\\n2-3 min. pr. side. Lad kødet trække i 5 min. og skær\\ndet i skiver. Pluk salaten og anret med de bagte\\nrodfrugter, stykker af kød og kold béarnaise sauce.\\nPynt med estragon.\",\n" +
            "   \"timeNeeded\": \"30\",\n" +
            "   \"image\": \"Steaksalat.jpg\",\n" +
            "   \"description\": \"En salat med diverse rodfrugter og béarnaise sauce\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Pasta med torsk\",\n" +
            "   \"ingredients\": [\"hvidløg\", \"olivenolie\", \"spinat\",\"basilikumblad\",\"salt\",\"peber\",\"cherrytomat\",\"pasta\",\"torskefilet\"],\n" +
            "   \"ingredientsExact\": \"1 fed hvidløg,\\n1 spsk. olivenolie,\\n250 g frisk spinat,\\n1 håndfuld basilikumblade,\\nSalt og sort peber,\\n2 dåser cherrytomater,\\n400 g pasta f.eks. penne eller rigatoni,\\n600 g torskefilet uden skind\",\n" +
            "   \"instructions\": \"Hak hvidløget fint. Varm olivenolie i en gryde, og steg\\nhvidløget i et halvt minut. Tilsæt spinat og basilikum,\\nog vend det rundt, til spinaten falder let sammen.\\nKrydr med salt og peber, og kom cherrytomater i.\\nLad saucen simre, mens du koger pasta og bager fisk.\\nKog pastaen efter pakkens anvisning i letsaltet vand.\\nDel fisken i 4 portionsstykker,\\nog krydr med salt og peber.\\nBag fisken i 12 min. ved 200°C – lidt mindre,\\nhvis torsken ikke er så tyk.\\nVend pastaen sammen med tomatsaucen,\\nog server med fisken oven på og evt.\\nlidt ekstra basilikum.\",\n" +
            "   \"timeNeeded\": \"30\",\n" +
            "   \"image\": \"PastaMedTorsk.jpg\",\n" +
            "   \"description\": \"Pasta med fisk og grønt\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Mørbrad\",\n" +
            "   \"ingredients\": [\"smør\",\"svinemørbrad\",\"peber\",\"timian\",\"serranoskinke\",\"kartoffel\",\"olivenolie\",\"salt\",\"timian\",\"porre\",\"svampemix\",\"brombær\",\"ristet valnød\"],\n" +
            "   \"ingredientsExact\": \"50 g smør,\\n1 stk svinemørbrad,\\nKværnet peber,\\nFrisk timian,\\n80 g serranoskinke i skiver,\\n800 g kartofler,\\n½ dl olivenolie,\\nSalt,\\nFrisk timian,\\n4 porrer,\\n200 g svampemix,\\n150g brombær,\\n75 g ristede valnødder\",\n" +
            "   \"instructions\": \"Afpuds svinemørbrad og fjern sølvsenen. Varm en\\npande op og brun mørbraden i smør,\\ntil den er gylden på alle sider.\\nTag den af varmen og læg den på et skærebræt.\\nKrydr med salt, kværnet peber og friske timiankviste.\\nVikl skiver af serranoskinke omkring mørbraden,\\nog hold det evt. fast med kødnåle.\\nSkær kartofler i grove stykker,\\nog kom dem i et ovnfast fad.\\nVend dem med olivenolie, salt,\\npeber og frisk timian.\\nGiv kartoflerne ca. 30 minutter ved 200°C i almindelig ovn.\\nSkær porrer i skrå skiver.\\nKom herefter mørbraden i fadet med kartofler\\nog stik porrer ned mellem kartoflerne.\\nGiv det hele 15 minutter ved 225°C.\\nTag mørbraden op og hold den varm under et klæde.\\nGiv evt. kartoflerne lidt mere,\\nhvis de ikke er møre.\\nVarm en pande op med smør, til det bruser.\\nSkyl svampene og riv dem fra hinanden.\\nSteg dem på panden, til de er let gyldne,\\nog krydr herefter med salt og peber.\\nAnret skiver af mørbrad i et serveringsfad med\\novnstegte kartofler og porrer og pynt med svampe,\\nfriske brombær, ristede valnødder og friske timiankviste.\",\n" +
            "   \"timeNeeded\": \"30\",\n" +
            "   \"image\": \"moerbrad.jpg\",\n" +
            "   \"description\": \"Mørbrad med rodfrugter og svampe\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Vintergryde\",\n" +
            "   \"ingredients\": [\"smør\",\"paprika\",\"kylling\",\"løg\",\"hvidløg\",\"chili\",\"rosmarin\",\"timian\",\"flået tomat\",\"grønsagsbouillon\",\"laurbærblad\",\"gulerod\",\"pastinak\",\"kikærter\",\"salt\",\"peber\"],\n" +
            "   \"ingredientsExact\": \"25 g smør,\\n2 tsk paprika,\\n4 stk kyllingeoverlår inkl. rygben,\\n2 små løg,\\n3 fed hvidløg,\\n1 lille rød chili,\\n3 stængler rosmarin,\\n3 stængler timian,\\n2 ds flåede tomater,\\n1 tsk grønsagsbouillon,\\n2 laurbærblade,\\n350 g gulerødder,\\n350 g pastinak,\\n1 ds kogte skyllede kikærter,\\nSalt og friskkværnet peber\",\n" +
            "   \"instructions\": \"Varm en stor støbejernsgryde op med smør, til det bruser.\\nTilsæt paprika. Brun kyllingeoverlår på begge sider.\\nLæg kyllingen op på en tallerken.\\nSkær løg i både og hvidløg i skiver og kom begge dele i gryden\\nsammen med rød chili og krydderurter.\\nVend det lidt rundt. Tilsæt kyllingeoverlår igen.\\nKom flåede tomater, grønsagsbouillon og laurbærblade ved.\\nLad retten simre under låg i 25 minutter.\\nSkær imens gulerødder i tykke skiver\\nog pastinak i mundrette stykker.\\nNår de 25 minutter er gået,\\ntilsættes både gulerødder og pastinak.\\nLad retten koge i 15 minutter uden låg, og tilsæt de kogte,\\nskyllede kikærter. Smag til med salt og peber.\",\n" +
            "   \"timeNeeded\": \"30\",\n" +
            "   \"image\": \"vintergryde.jpg\",\n" +
            "   \"description\": \"En krydret gryderet med kylling, tomat, rodfrugter,\\nchili og kikærter\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Flæskesteg\",\n" +
            "   \"ingredients\": [\"svinekam\",\"salt\",\"kartoffel\",\"rødbede\",\"gulerod\",\"timian\",\"olivenolie\",\"peber\",\"grønkål\",\"soltørret tranebær\"],\n" +
            "   \"ingredientsExact\": \"1 kg svinekam med svær uden ben,\\n2 tsk fint salt, 700 g kartofler,\\n400 g rødbeder,\\n300 g gulerødder,\\n4 stængler frisk timian,\\n½ dl olivenolie,\\nSalt og peber,\\n50 g grønkål,\\n100 g soltørrede tranebær\",\n" +
            "   \"instructions\": \"Dup stegen med et rent viskestykke.\\nSnit sværene efter, og kom fint salt imellem sværene.\\nSkær kartofler i både,\\nog skær rødbeder og gulerødder i mindre stykker.\\nKom alle 3 ingredienser i en bradepande sammen med timian,\\nolivenolie, salt og peber.\\nStil flæskestegen på rodfrugterne,\\nog forsøg at få den til at stå så lige, som muligt.\\nSteg det hele i almindelig ovn ved 200°C,\\neller intervalgrill retten ved 190°C i 60 minutter.\\nGiv flæskestegen lidt grill til slut,\\nhvis sværene ikke er er helt sprøde.\\nTag stegen ud af ovnen,\\nstil den på et skærebræt og lade den hvile i 15 minutter.\\n Giv rodfrugterne yderligere 10 minutter i ovnen.\\nHak grønkål groft imens.\\nLige inden servering vendes grofthakket grønkål\\nog tranebær i rodfrugtsblandingen.\\nSkær skiver af flæskestegen, og servér på\\ntoppen af rodfrugterne.\",\n" +
            "   \"timeNeeded\": \"60\",\n" +
            "   \"image\": \"flaeskesteg.png\",\n" +
            "   \"description\": \"Flæskesteg med diverse rodfrugter, grønkål og tørrede\\ntranebær\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Lammeskank\",\n" +
            "   \"ingredients\": [\"fennikel\",\"løg\",\"gulerod\",\"bladselleri\",\"hvidløg\",\"lammeskank\",\"salt\",\"pebber\",\"olivenolie\",\"rosmarin\",\"persille\",\"hvidvin\",\"hønsefond\",\"bønner\",\"linser\"],\n" +
            "   \"ingredientsExact\": \"2 fennikler,\\n1 løg, 2 gulerødder,\\n2 stilke bladselleri,\\n2 fed hvidløg,\\n4 lammeskanke,\\nSalt og sort peber,\\n2 spsk. olivenolie,\\n2 kviste rosmarin,\\n1 håndfuld bredbladet persille \\n     + ekstra til servering,\\n3 dl tør hvidvin,\\n3 dl hønsefond eller vand,\\n150 g grønne bønner,\\n200 g kogte grønne linser\",\n" +
            "   \"instructions\": \"Skær fennikel, løg, gulerødder, bladselleri og hvidløg i skiver.\\nKrydr lammeskankene med salt og peber,\\nog brun dem i olie i en stor gryde.\\n Tag kødet op, og kom fennikel, løg,\\ngulerødder og bladselleri i gryden.\\nSteg det i ca. 5 min.,\\ntil grøntsagerne begynder at tage farve.\\nTilsæt så hvidløg, rosmarinkviste og grofthakket persille.\\nLæg lammeskankene tilbage i gryden,\\nog hæld hvidvin og hønsefond eller vand ved.\\nLæg låg på, og lad skankene simre i 1 ½-2 timer,\\ntil kødet er helt mørt og næsten falder af benet.\\nVend lidt rundt i det undervejs.\\nTilsæt til sidst grønne bønner og linser,\\nog lad det simre færdigt i 5-10 min.\\nSmag til med salt og peber,\\nog drys med den sidste persille ved servering.\",\n" +
            "   \"timeNeeded\": \"120\",\n" +
            "   \"image\": \"lammeskank.jpg\",\n" +
            "   \"description\": \"Lammeskank med bønner og linser\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Gullasch\",\n" +
            "   \"ingredients\": [\"smør\", \"gullaschkød\", \"paprika\", \"røget paprika\", \"spidskommen\", \"tomatkoncentrat\", \"løg\", \"hvidløg\", \"knoldselleri\", \"persillerod\", \"gulerod\", \"bouillon\", \"rødvin\", \"mel\"],\n" +
            "   \"ingredientsExact\": \"25 g smør,\\n800 g gullaschkød af skært okse,\\n1 spsk paprika,\\n1 tsk røget paprika,\\n2 tsk spidskommen,\\n1 ds tomatkoncentrat,\\n2 store hvide løg,\\n5 fed hvidløg,\\n400 g knoldselleri,\\n400 g persillerod,\\n400 g gulerødder,\\n1 liter bouillon,\\n2 dl rødvin,\\n25 g smør,\\n2 spsk mel\",\n" +
            "   \"instructions\": \"Varm smør op i en støbejernsgryde, til det bruser.\\nBrun kødet af på alle sider, gør det lidt ad gangen,\\nså gryden forbliver varm.\\nTilsæt krydderier og rør det hele rundt.\\nKom tomatkoncentrat ved og lad det stege i et par minutter.\\nHak løg, knus hvidløg og\\nskær knoldselleri og persillerod i mundrette stykker.\\nSkær gulerødder i tykke skiver.\\nKom det hele i gryden sammen med 1 liter bouillon\\nog 2 dl rødvin.\\nLad retten simre under låg i 60 minutter.\\nEr kødet ikke helt mørt, skal retten have yderligere 30 minutter.\\nBland blødt smør og hvedemel sammen til en smørbolle.\\nRør det i saucen, så retten bliver jævnet.\\nLad det småkoge lidt.\\nSmag til med salt og sort, kværnet peber.\\nDrys med hakket persille.\",\n" +
            "   \"timeNeeded\": \"60\",\n" +
            "   \"image\": \"gullasch.jpg\",\n" +
            "   \"description\": \"Krydret gryderet med kød og rodfrugter\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Citron Te\",\n" +
            "   \"ingredients\": [\"citron\", \"vand\", \"sukker\", \"Te brev\"],\n" +
            "   \"ingredientsExact\": \"4 skiver citron,\\n1 kop kogt vand,\\n2 tsk sukker,\\n1 te brev med citronsmag\",\n" +
            "   \"instructions\": \"kog noget vand i en keddel,\\nput dit te brev i en kop,\\nhæld det kogende vand i,\\nlad stå i 2min, put de 2 tsk sukker i koppen,\\nrør rund og put derefter citronskiverne i koppen\",\n" +
            "   \"timeNeeded\": \"10\",\n" +
            "   \"image\": \"CitronTe.jpg\",\n" +
            "   \"description\": \"En varm kop te med citronsmag\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"recipeName\": \"Glasur\",\n" +
            "   \"ingredients\": [\"flormelis\", \"vand\"],\n" +
            "   \"ingredientsExact\": \"200g flormelis,\\n1/2 dl kogende vand\",\n" +
            "   \"instructions\": \"kog noget vand i en keddel,\\nput 200g flormelis i en skål,\\nhæld vandet over flormelis og rør rundt\",\n" +
            "   \"timeNeeded\": \"3\",\n" +
            "   \"image\": \"glasur.jpg\",\n" +
            "   \"description\": \"Glasur... gud vide hvorfor du bare vil lave glasur... placebo\\nfor at spise lim?\"\n" +
            "  },\n" +

            "  {\n" +
            "   \"recipeName\": \"Dry Martini\",\n" +
            "   \"ingredients\": [\"gin\", \"Vermouth\", \"Isterninger\", \"Grøn Oliven\"],\n" +
            "   \"ingredientsExact\": \"5 cl Bombay Sapphire gin,\\n1 cl Noilly Prat Vermouth Dry,\\nIsterninger,\\n1 grøn oliven \",\n" +
            "   \"instructions\": \"Kom gin og vermouth i en rørekande fyldt med is.\\nRør drinken sammen i et minuts tid.\\nSigt over i et afkølet cocktailglas\\nog kom en oliven i.\\nDu kan også vælge at shake din drink i stedet for\\nDet kommer an på hvor James Bond agtig, du er…\",\n" +
            "   \"timeNeeded\": \"2\",\n" +
            "   \"image\": \"martini.jpg\",\n" +
            "   \"description\": \"Vi har alle set James Bond, behøver ingen forklaring\"\n" +
            "  },\n" +

            "  {\n" +
            "   \"recipeName\": \"Pulled duck sandwich\",\n" +
            "   \"ingredients\": [\"agurk\", \"hvidvinseddike\", \"vand\", \"rørsukker\", \"flagesalt\", \"peber\", \"confit de canard\", \"brioche burgerbolle\", \"syltet rødløg\", \"sennep\", \"rucola\", \"flæskesvær\"],\n" +
            "   \"ingredientsExact\": \"1 agurk,\\n2 spsk. hvidvinseddike,\\n2 spsk. vand,\\n2 tsk. rørsukker,\\n½ tsk. flagesalt,\\nSort peber,\\n1 dåse confit de canard (4 lår),\\n4 brioche burgerboller,\\n1 glas syltede rødløg,\\n4 spsk. sennep,\\nsød eller stærk,\\n½ bakke rucola,\\n1 håndfuld flæskesvær\",\n" +
            "   \"instructions\": \"Til agurkesalat skæres agurk i meget tynde skiver.\\nBland eddike med vand, sukker, salt og lidt peber,\\nog hæld det over agurkeskiverne.\\nLad dem marinere i 15-30 min. (eller længere).\\nTag andelårene op af fedtet, og tør det meste fedt af.\\nLæg dem i en bradepande,\\nog varm dem i ovnen ved 200°C i 20-30 min.\\n(følg dåsens anvisning).\\nBrug to gafler til at tage kødet af benene\\nog rive det i grove stykker.\\nHold kødet lunt i ovnen.\\nLun briochebollerne, og smør dem med sennep på begge sider.\\nLæg et godt lag andekød på underbollen,\\nog top med agurkesalat,\\nsyltede rødløg, knuste flæskesvær og rucola,\\nog læg overbollen på.\",\n" +
            "   \"timeNeeded\": \"60\",\n" +
            "   \"image\": \"PulledDuckSandwich.jpg\",\n" +
            "   \"description\": \"Sandwich med agurksalat og confit de canard\"\n" +
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


