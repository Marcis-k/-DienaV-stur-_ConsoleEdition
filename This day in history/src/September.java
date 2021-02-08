import java.util.Random;

public class September {
	Random ran = new Random();

	September(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Septembra notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] sep1 = { "2006. — Luksemburga kļuva par pirmo valsti, kas pilnībā pārgājusi uz digitālās televīzijas virszemes apraidi.",
					"1985. — ASV un Francijas kopīgā ekspedīcijā tika atrasts nogrimušais Titānika vraks.",
					"1923. — Japānā spēcīga zemestrīce nopostīja Tokijas un Jokohamas pilsētu; bojā gāja aptuveni 140 000 cilvēku." };
			int random1 = ran.nextInt(sep1.length);
			System.out.println(sep1[random1]);

			break;
		case 2:
			String[] sep2 = { "1945. — Otrais pasaules karš beidzās ar Japānas padošanos.",
					"1967. — Sīlendas Hercogiste pasludināja neatkarību no Apvienotās Karalistes.",
					"2004. — Veimārā, Vācijas seno grāmatu krātuvē, hercogienes Annas Amālijas bibliotēkā izcēlās ugunsgrēks, kas iznīcināja aptuveni 50 000 sējumu." };
			int random2 = ran.nextInt(sep2.length);
			System.out.println(sep2[random2]);

			break;
		case 3:
			String[] sep3 = { "1791. — beidza pastāvēt Francijas karaliste.",
					"1917. — Pirmais pasaules karš: Vācijas spēki ieņēma Rīgu.",
					"1994. — Krievija un Ķīna parakstīja vienošanos, pēc kuras raķetes vairs netika notēmētas uz pretējo valstu mērķiem." };
			int random3 = ran.nextInt(sep3.length);
			System.out.println(sep3[random3]);

			break;
		case 4:
			String[] sep4 = {
					"1774. — otrajā kapteiņa Džeimsa Kuka ceļojumā Jaunkaledoniju pirmoreiz apmeklēja eiropieši.",
					"1998. — divi Stenforda Universitātes studenti, Lerijs Peidžs un Sergejs Brins, dibināja kompāniju Google.",
					"1923. — Leikherstā, Ņūdžersijas štatā gaisā pacēlās pirmais ASV būvētais dirižablis." };
			int random4 = ran.nextInt(sep4.length);
			System.out.println(sep4[random4]);

			break;
		case 5:
			String[] sep5 = { "1725. — Francijas karalis Luijs XV apprecējās ar Mariju Leščiņsku.",
					"1944. — Beļģija, Nīderlande un Luksemburga izveidoja Beniluksu.",
					"1936. — tika dots starts pirmajam Latvijas riteņbraucēju vienības braucienam, kurš noslēdzās ar finišu Rīgā nākamajā dienā." };
			int random5 = ran.nextInt(sep5.length);
			System.out.println(sep5[random5]);

			break;
		case 6:
			String[] sep6 = {
					"1803. — angļu zinātnieks Džons Daltons sāka izmantot simbolus, lai attēlotu dažādu elementu atomus.",
					"1955. — Stambulā, Turcijā, notika turku rīkoti grautiņi pret grieķu un armēņu minoritāti.",
					"1975. — 6,7 ballu stipra zemestrīce satricināja Turciju; bojā gāja 2085 cilvēki." };
			int random6 = ran.nextInt(sep6.length);
			System.out.println(sep6[random6]);

			break;
		case 7:
			String[] sep7 = { "1822. — Brazīlija deklarēja neatkarību no Portugāles.",
					"1940. — Otrais pasaules karš: Vācija sāka Londonas bombardēšanu.",
					"2011. — lidmašīnas avārijā Krievijā bojā gāja 43 cilvēki, ieskaitot gandrīz visu Jaroslavļas \"Lokomotiv\" hokeja komandu, arī latviešu hokejists Kārlis Skrastiņš." };
			int random7 = ran.nextInt(sep7.length);
			System.out.println(sep7[random7]);

			break;
		case 8:
			String[] sep8 = { "1636. — dibināta Hārvarda Universitāte.",
					"1991. — Maķedonijas Republika deklarēja neatkarību no Dienvidslāvijas.",
					"1951. — starp Sabiedrotajiem un Japānu parakstīts Sanfrancisko līgums." };
			int random8 = ran.nextInt(sep8.length);
			System.out.println(sep8[random8]);

			break;
		case 9:
			String[] sep9 = { "1839. — Džons Heršels uzņēma pirmo fotogrāfiju uz stikla plates.",
					"1850. — Kalifornija iestājās ASV kā 31. štats.",
					"1948. — Kims Irsens paziņoja par Korejas Tautas Demokrātiskās Republikas dibināšanu." };
			int random9 = ran.nextInt(sep9.length);
			System.out.println(sep9[random9]);

			break;
		case 10:
			String[] sep10 = { "1898. — Austrijas imperatori Elizabeti noslepkavoja Luidži Lukeni.",
					"2003. — Igaunijā referendumā tika atbalstīta iestāšanās Eiropas Savienībā.",
					"2002. — Šveice iestājās Apvienoto Nāciju Organizācijā." };
			int random10 = ran.nextInt(sep10.length);
			System.out.println(sep10[random10]);

			break;
		case 11:
			String[] sep11 = { "1918. — Padomju Krievijā ieviesta metriskā sistēma.",
					"1926. — Spānija izstājās no Tautu Savienības.",
					"2007. — Krievijā tika izmēģināta pasaulē jaudīgākā vakuuma bumba." };
			int random11 = ran.nextInt(sep11.length);
			System.out.println(sep11[random11]);

			break;
		case 12:
			String[] sep12 = { "2005. — Izraēla pabeidza bruņoto spēku un kolonistu izvākšanu no Gazas sektora.",
					"1959. — Rīgā notika pirmās Dzejas dienas.",
					"1943. — Otrais pasaules karš: no mājas aresta tika atbrīvots Itālijas diktators Benito Musolīni." };
			int random12 = ran.nextInt(sep12.length);
			System.out.println(sep12[random12]);

			break;
		case 13:
			String[] sep13 = { "1502. — Kauja pie Smoļinas: Livonijas konfederācija sakāva krievu karsapēku.",
					"1994. — Ulysses zonde pārlidoja Saules dienvidpolu.",
					"1959. — Mēnesī ietriecās pirmais cilvēka veidotais objekts Luna-2." };
			int random13 = ran.nextInt(sep13.length);
			System.out.println(sep13[random13]);

			break;
		case 14:
			String[] sep14 = { "2003. — Igaunijā iedzīvotāji referendumā atbalstīja iestāšanos Eiropas Savienībā.",
					"1973. — Latvijas PSR dibināja Gaujas nacionālo parku.",
					"1917. — Krievijas Pagaidu valdība pasludināja Krieviju par republiku, kas pastāvēja līdz Oktobra revolūcijai." };
			int random14 = ran.nextInt(sep14.length);
			System.out.println(sep14[random14]);

			break;
		case 15:
			String[] sep15 = {
					"1821. — Gvatemala, Hondurasa, Kostarika, Nikaragva, Salvadora deklarēja neatkarību no Spānijas.",
					"1959. — Ņikita Hruščovs kā pirmais PSRS vadītājs apmeklēja ASV.",
					"1950. — Korejas karš: ASV izsēdināja desantu Inčhonā (pie Seulas)." };
			int random15 = ran.nextInt(sep15.length);
			System.out.println(sep15[random15]);

			break;
		case 16:
			String[] sep16 = { "1810. — Meksika deklarēja neatkarību no Spānijas.",
					"1908. — tika dibināts ASV autobūves uzņēmums General Motors.",
					"1963. — dibināta Malaizija, apvienojot Malaju, Singapūru, Britu Ziemeļborneo (Sabahu) un Saravaku." };
			int random16 = ran.nextInt(sep16.length);
			System.out.println(sep16[random16]);

			break;
		case 17:
			String[] sep17 = { "1787. — Filadelfijā pieņemta ASV konstitūcija.",
					"1993. — Krievijas karaspēks atstāja Poliju.",
					"1939. — Otrais pasaules karš: Padomju Savienības karaspēks, pamatojoties uz Molotova-Ribentropa paktu, iebruka Polijas austrumu daļā." };
			int random17 = ran.nextInt(sep17.length);
			System.out.println(sep17[random17]);

			break;
		case 18:
			String[] sep18 = { "1947. — tika izveidoti ASV Gaisa spēki kā atsevišķa militāra struktūrvienība.",
					"1910. — pie varas nāca pirmā huntas valdība Čīlē.",
					"1679. — Ņūhempšīra kļuva par Masačūsetsas līča koloniju." };
			int random18 = ran.nextInt(sep18.length);
			System.out.println(sep18[random18]);

			break;
		case 19:
			String[] sep19 = { "2002. — Kotdivuārā sākās pilsoņu karš.",
					"1995. — The Washington Post un The New York Times publicēja Unabombera manifestu.",
					"1944. — Otrais pasaules karš: PSRS un Somija parakstīja pamiera līgumu." };
			int random19 = ran.nextInt(sep19.length);
			System.out.println(sep19[random19]);

			break;
		case 20:
			String[] sep20 = { "1187. — Saladīns sāka Jeruzalemes aplenkumu pret krustnešiem.",
					"2003. — Latvijā referendumā pilsoņi atbalstīja iestāšanos Eiropas Savienībā.",
					"1990. — Dienvidosetijas autonomais apgabals deklarēja Dienvidosetijas Padomju Demokrātisko Republiku ārpus Gruzijas PSR sastāva." };
			int random20 = ran.nextInt(sep20.length);
			System.out.println(sep20[random20]);

			break;
		case 21:
			String[] sep21 = { "1217. — igauņu cilšu vadonis Lembits tika nogalināts cīņā ar Teitoņu ordeni.",
					"2004. — Latvijā tika novērota neliela zemestrīce, kuras epicentrs atradās Kaļiņingradas apgabalā.",
					"1957. — Ūlavs V kļuva par Norvēģijas karali pēc Hokona VII nāves." };
			int random21 = ran.nextInt(sep21.length);
			System.out.println(sep21[random21]);

			break;
		case 22:
			String[] sep22 = { "1980. — Irānas—Irākas karš: Irāka iebruka Irānā.",
					"1921. — Latvija, Lietuva un Igaunija uzņemtas Tautu Savienībā.",
					"1888. — tika izdots National Geographic žurnāla pirmais numurs." };
			int random22 = ran.nextInt(sep22.length);
			System.out.println(sep22[random22]);

			break;
		case 23:
			String[] sep23 = {
					"2002. — izlaista pirmā publiskā versija pārlūkprogrammai Mozilla Firefox (Phoenix 0.1).",
					"1991. — Armēnija pasludināja savu neatkarību.",
					"1923. — pēdējiem Antantes spēkiem pametot Konstantinopoli, beidzās Konstantinopoles okupācija." };
			int random23 = ran.nextInt(sep23.length);
			System.out.println(sep23[random23]);

			break;
		case 24:
			String[] sep24 = { "1948. — dibināta kompānija Honda Motor Company.",
					"1801. — Rietumgruzija pievienojās Krievijas impērijai.",
					"1968. — Svazilendas karaliste pieņemta ANO." };
			int random24 = ran.nextInt(sep24.length);
			System.out.println(sep24[random24]);

			break;
		case 25:
			String[] sep25 = { "2008. — Ķīna palaida kosmosa kuģi Shenzhou 7.",
					"1990. — ar Latvijas Republikas Augstākās padomes lēmumu Stučkas pilsēta ieguva Aizkraukles vārdu.",
					"1992. — ASV palaista Marsa zonde Mars Observer." };
			int random25 = ran.nextInt(sep25.length);
			System.out.println(sep25[random25]);

			break;
		case 26:
			String[] sep26 = { "1950. — ANO karaspēks atguva Seulu no Ziemeļkorejas.",
					"1961. — uzsāka darbu zinātniski pētnieciskais kodolreaktors Salaspilī.",
					"1997. — zemestrīce satricināja Itālijas reģionus Umbriju un Marki, izraisot Svētā Franciska bazilikas sagrūšanu Asīzē." };
			int random26 = ran.nextInt(sep26.length);
			System.out.println(sep26[random26]);

			break;
		case 27:
			String[] sep27 = { "1996. — Afganistānā Taliban spēki ieņēma galvaspilsētu Kabulu.",
					"1983. — Ričards Stalmans oficiāli paziņoja par GNU projektu.",
					"1981. — Francijā sākta ātrgaitas dzelzceļa līnijas TGV ekspluatācija starp Parīzi un Lionu." };
			int random27 = ran.nextInt(sep27.length);
			System.out.println(sep27[random27]);

			break;
		case 28:
			String[] sep28 = { "2008. — notika pirmās nakts sacīkstes F1 čempionāta vēsturē (Singapūras Grand Prix).",
					"1994. — Baltijas jūrā ceļā no Tallinas uz Stokholmu nogrima kuģis \"Estonia\", bojā gāja 852 cilvēki.",
					"1950. — Indonēzija pievienojās ANO." };
			int random28 = ran.nextInt(sep28.length);
			System.out.println(sep28[random28]);

			break;
		case 29:
			String[] sep29 = {
					"2000. — Latvijas soļotājs Aigars Fadejevs izcīnīja sudraba medaļu 50 km soļošanas distancē Sidnejas olimpiskajās spēlēs.",
					"1991. — militārais apvērsums Haiti.",
					"1918. — Pirmais pasaules karš: Bulgārija parakstīja pamiera līgumu ar Antanti." };
			int random29 = ran.nextInt(sep29.length);
			System.out.println(sep29[random29]);

			break;
		case 30:
			String[] sep30 = { "1399. — Henrijs IV Lankasters tika kronēts par Anglijas karali.",
					"1895. — Madagaskara kļuva par Francijas protektorātu.",
					"1966. — Bečuanalendas protektorāts ieguva neatkarību no Apvienotās Karalistes un tika pārdēvēts par Botsvānu." };
			int random30 = ran.nextInt(sep30.length);
			System.out.println(sep30[random30]);

			break;

		default:
			System.out.print("Septembrī šāda datuma nav");
			break;
		}
	}

}
