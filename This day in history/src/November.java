import java.util.Random;

public class November {
	Random ran = new Random();

	November(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Novembra notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] nov1 = { "1993. — stājās spēkā Māstrihtas līgums, formāli dibinot Eiropas Savienību.",
					"1955. — sākās Vjetnamas karš.",
					"1925. — sāka raidīt Rīgas radiofons; Latvijas Radio dzimšanas diena." };
			int random1 = ran.nextInt(nov1.length);
			System.out.println(nov1[random1]);

			break;
		case 2:
			String[] nov2 = { "1899. — sākās Bokseru sacelšanās.",
					"1914. — Pirmais Pasaules karš: Krievija pieteica karu Osmaņu impērijai.",
					"1917. — tika publiskota Balfūra deklarācija, pēc kuras tiktu atbalstīta ebreju apmetņu ierīkošana Palestīnā." };
			int random2 = ran.nextInt(nov2.length);
			System.out.println(nov2[random2]);

			break;
		case 3:
			String[] nov3 = { "1903. — ar ASV atbalstu Panama deklarēja neatkarību no Kolumbijas.",
					"1950. — Argentīnas pilsētā Buenosairesā sākās pirmais Pasaules čempionāts basketbolā.",
					"1919. — Latvijas brīvības cīņas: Latvijas armija sāka pretuzbrukumu bermontiešiem Bolderājā uz ziemeļiem no Rīgas." };
			int random3 = ran.nextInt(nov3.length);
			System.out.println(nov3[random3]);

			break;
		case 4:
			String[] nov4 = {
					"1918. — Pirmais pasaules karš: saskaņā ar panākto pamieru Austroungārija pārtrauca karadarbību.",
					"1995. — Telavivā atentātā tika nogalināts Izraēlas premjerministrs Ichaks Rabins.",
					"1921. — Vācijā izveidota paramilitāra organizācija Sturmabteilung (SA)." };
			int random4 = ran.nextInt(nov4.length);
			System.out.println(nov4[random4]);

			break;
		case 5:
			String[] nov5 = { "1954. — Brazīlijas pilsētā Riodežaneiro beidzās otrais Pasaules čempionāts basketbolā.",
					"1985. — pieņemts pašreizējais Santomes un Prinsipi karogs.",
					"2007. — palaista pirmā Ķīnas Mēness zonde Chang'e-1." };
			int random5 = ran.nextInt(nov5.length);
			System.out.println(nov5[random5]);

			break;
		case 6:
			String[] nov6 = { "1534. — dibināta Kito, Ekvadoras galvaspilsēta.",
					"1954. — Latvijā, Rīgā sāktas regulāras televīzijas pārraides.",
					"1999. — Austrālijas iedzīvotāji referendumā nobalsoja par Apvienotās Karalistes monarha kā valsts galvas statusa saglabāšanu." };
			int random6 = ran.nextInt(nov6.length);
			System.out.println(nov6[random6]);

			break;
		case 7:
			String[] nov7 = { "1922. — spēkā stājās Latvijas Republikas Satversme.",
					"1944. — Franklins Rūzvelts kļuva par pirmo prezidentu ASV vēsturē, kas ticis ievēlēts ceturto reizi pēc kārtas.",
					"1990. — parādes laikā Sarkanajā laukumā, Maskavā, notika atentāta mēģinājums pret PSRS prezidentu Mihailu Gorbačovu." };
			int random7 = ran.nextInt(nov7.length);
			System.out.println(nov7[random7]);

			break;
		case 8:
			String[] nov8 = {
					"1860. — Pēterburgas—Varšavas dzelzceļa līnijas posmā Rītupe—Daugavpils atklāja pirmo dzelzceļa līniju Latvijā.",
					"1917. — Ļeņins kļuva par Padomju Krievijas Tautas Komisāru padomes priekšsēdētāju.",
					"1965. — izveidota Britu Indijas okeāna teritorija." };
			int random8 = ran.nextInt(nov8.length);
			System.out.println(nov8[random8]);

			break;
		case 9:
			String[] nov9 = { "1937. — Japānas spēki ieņēma Šanhaju Ķīnā.",
					"1938. — Kristāla nakts: sākās pirmie masveidīgie pret ebrejiem vērsti grautiņi Vācijā.",
					"2005. — palaista ESA Venēras zonde Venus Express." };
			int random9 = ran.nextInt(nov9.length);
			System.out.println(nov9[random9]);

			break;
		case 10:
			String[] nov10 = { "1994. — Irāka paziņoja par Kuveitas suverenitātes atzīšanu.",
					"1951. — Francija, Lielbritānija, ASV un Turcija pieņēma Tuvo Austrumu drošības programmu.",
					"1933. — krievu literāts Ivans Buņins saņēma Nobela prēmiju literatūrā." };
			int random10 = ran.nextInt(nov10.length);
			System.out.println(nov10[random10]);

			break;
		case 11:
			String[] nov11 = { "1889. — Vašingtona uzņemta ASV kā 42. štats.",
					"2007. — notika filmas \"Rīgas sargi\" pirmizrāde.",
					"1988. — Palestīna deklarēja neatkarību no Izraēlas." };
			int random11 = ran.nextInt(nov11.length);
			System.out.println(nov11[random11]);

			break;
		case 12:
			String[] nov12 = { "1918. — Austrija kļuva par republiku.",
					"2006. — Dienvidosetijā notika referendums par neatkarību no Gruzijas.",
					"2001. — Taliban spēki atstāja Afganistānas galvaspilsētu Kabulu." };
			int random12 = ran.nextInt(nov12.length);
			System.out.println(nov12[random12]);

			break;
		case 13:
			String[] nov13 = {
					"2002. — tankkuģis Prestige nogrima pie Spānijas Galisijas krasta, izraisot plašu naftas piesārņojumu.",
					"1994. — Zviedrijas iedzīvotāji referendumā nobalsoja par iestāšanos Eiropas Savienībā.",
					"1990. — sāka darboties globālais tīmeklis." };
			int random13 = ran.nextInt(nov13.length);
			System.out.println(nov13[random13]);

			break;
		case 14:
			String[] nov14 = { "1918. — Čehoslovākija kļuva par republiku.",
					"1940. — Otrais pasaules karš: vācu aviācijas uzlidojumā tika sagrauts Koventrijas vēsturiskais centrs Anglijā.",
					"1975. — Spānija atstāja Rietumsahāru." };
			int random14 = ran.nextInt(nov14.length);
			System.out.println(nov14[random14]);

			break;
		case 15:
			String[] nov15 = { "1983. — dibināta Ziemeļu Kipras Turku Republika, kuru atzinusi tikai Turcija.",
					"1969. — Vjetnamas karš: Vašingtonā notika pretkara demonstrācija, kurā piedalījās 250 000—500 000 cilvēku.",
					"1920. — notika Tautu Savienības pirmā asambleja Ženēvā." };
			int random15 = ran.nextInt(nov15.length);
			System.out.println(nov15[random15]);

			break;
		case 16:
			String[] nov16 = { "1810. — Meksika pasludināja neatkarību no Spānijas.",
					"1896. — pirmoreiz tika pārvadīta elektrība no elektrostacijas uz pilsētu (no Niagāras ūdenskrituma HES uz Bufalo, ASV).",
					"2004. — X-43A ar tiešplūsmas reaktīvo dzinēju uzstādīja ātruma rekordu (11 200 km/h jeb 3,11 km/s) lidaparātiem, kuri darbojas ar atmosfēras gaisu kā degvielas oksidētāju." };
			int random16 = ran.nextInt(nov16.length);
			System.out.println(nov16[random16]);

			break;
		case 17:
			String[] nov17 = {
					"1869. — atklāja Suecas kanālu (attēlā) Ēģiptē, kas savienoja Vidusjūru ar Sarkano jūru.",
					"1903. — Krievijas sociāldemokrātiskā strādnieku partija sadalījās boļševikos un meņševikos.",
					"1922. — pēdējais Osmaņu impērijas sultāns Mehmeds VI devās trimdā uz Itāliju." };
			int random17 = ran.nextInt(nov17.length);
			System.out.println(nov17[random17]);

			break;
		case 18:
			String[] nov18 = { "1493. — Kristofors Kolumbs sasniedza Puertoriko krastus.",
					"1925. — Džordžs Bernards Šovs atteicās no naudas prēmijas, kas viņam tika piešķirta kā Nobela prēmijas literatūrā laureātam.",
					"2004. — Krievija ratificēja Kioto protokolu." };
			int random18 = ran.nextInt(nov18.length);
			System.out.println(nov18[random18]);

			break;
		case 19:
			String[] nov19 = {
					"1985. — Ženēvā pirmo reizi tikās ASV prezidents Ronalds Reigans un PSRS vadītājs Mihails Gorbačovs.",
					"1946. — Afganistāna pievienojās ANO.",
					"1942. — Otrais pasaules karš: sākās Sarkanās armijas pretuzbrukums pie Staļingradas." };
			int random19 = ran.nextInt(nov19.length);
			System.out.println(nov19[random19]);

			break;
		case 20:
			String[] nov20 = { "1910. — Meksikā sākās revolūcija.", "1985. — izlaista Microsoft Windows 1.0.",
					"1945. — Nirnbergas prāvas sākums pret 24 nacistiem, apsūdzot viņus kara noziegumos." };
			int random20 = ran.nextInt(nov20.length);
			System.out.println(nov20[random20]);

			break;
		case 21:
			String[] nov21 = { "1919. — Latvijas brīvības cīņas: Latvijas armija atbrīvoja Jelgavu no bermontiešiem.",
					"2008. — internetā pirmo reizi tika pamanīts viens no bīstamākajiem datora tārpiem — Conficker.",
					"2013. — sabrūkot jumtam \"Maxima\" veikala ēkai Rīgā, Zolitūdē, bojā gāja 54 cilvēki, vairāki desmiti tika ievainoti." };
			int random21 = ran.nextInt(nov21.length);
			System.out.println(nov21[random21]);

			break;
		case 22:
			String[] nov22 = { "1858. — dibināta Denvera, ASV pilsēta.",
					"1943. — Libāna ieguva neatkarību no Francijas.",
					"1975. — pēc Fransisko Franko nāves Huans Karloss I kļuva par Spānijas karali." };
			int random22 = ran.nextInt(nov22.length);
			System.out.println(nov22[random22]);

			break;
		case 23:
			String[] nov23 = { "1700. — par Romas pāvestu tika iecelts Klements XI.",
					"1864. — tika nodibināta Ainažu jūrskola.",
					"1963. — Lielbritānijā tika pārraidīta teleseriāla Doctor Who, kas tiek uzņemts vēl mūsdienās, pirmā sērija." };
			int random23 = ran.nextInt(nov23.length);
			System.out.println(nov23[random23]);

			break;
		case 24:
			String[] nov24 = {
					"1227. — Polijas princis Lešeks I Baltais tika nogalināts Pjastu augstmaņu sanāksmē Gonsavā.",
					"1963. — Džeks Rūbijs Dalasas policijas iecirkņa pagrabā nošāva Lī Hārviju Osvaldu. Šaušana notika televīzijas tiešraidē.",
					"1971. — D. B. Kūpers ASV nolaupīja lidmašīnu Boeing 727, saņēma 200 000 ASV dolāru izpirkuma maksu un izlēca ar izpletni no tās, pazūdot bez pēdām." };
			int random24 = ran.nextInt(nov24.length);
			System.out.println(nov24[random24]);

			break;
		case 25:
			String[] nov25 = {
					"1918. — Vācijas pagaidu valdība ģenerālpilnvarotā Baltijas zemēs Augusta Vinniga personā atzina Latvijas neatkarību de facto.",
					"1947. — Jaunzēlande ratificēja Vestminsteras statūtus, tādējādi kļūstot neatkarīgai likumdošanas jomā no Apvienotās Karalistes.",
					"1992. — Čehoslovākijas parlaments nobalsoja par valsts sadalīšanu Čehijas Republikā un Slovākijā, kas notika 1993. gada 1. janvārī." };
			int random25 = ran.nextInt(nov25.length);
			System.out.println(nov25[random25]);

			break;
		case 26:
			String[] nov26 = { "1917. — Monreālā, Kanādā dibināta Nacionālā hokeja līga (NHL).",
					"1950. — Korejas karš: Ziemeļkorejā Ķīnas Tautas Republikas spēki sāka masīvu pretuzbrukumu Dienvidkorejas un ASV spēkiem.",
					"1924. — Mongolijas Republika mainīja valsts nosaukumu uz Mongolijas Tautas Republika un pieņēma jaunu konstitūciju, kļūstot par sociālistisku valsti." };
			int random26 = ran.nextInt(nov26.length);
			System.out.println(nov26[random26]);

			break;
		case 27:
			String[] nov27 = { "1912. — Spānija pasludināja protektorātu pār Marokas ziemeļu piekrasti.",
					"1918. — Sarkanā armija ieņēma Igaunijas pilsētu Narvu.",
					"1971. — Mars-2 nolaižamais aparāts kļuva par pirmo cilvēku darināto objektu, kas sasniedzis Marsa virsmu, lai gan nolaišanās bija neveiksmīga." };
			int random27 = ran.nextInt(nov27.length);
			System.out.println(nov27[random27]);

			break;
		case 28:
			String[] nov28 = {
					"1943. — Otrais pasaules karš: sākās Teherānas konference, Apvienotās Karalistes, ASV un PSRS vadītājiem tiekoties Teherānā.",
					"1964. — palaista NASA starpplanētu zonde Marsa izpētei Mariner 4.",
					"1975. — Portugāļu Timora deklarēja neatkarību no Portugāles un nomainīja nosaukumu uz Austrumtimora." };
			int random28 = ran.nextInt(nov28.length);
			System.out.println(nov28[random28]);

			break;
		case 29:
			String[] nov29 = {
					"1943. — Otrais Pasaules karš: partizāņu kontrolētajā teritorijā dibināta Demokrātiskā Federālā Dienvidslāvija kā sociālistiska valsts.",
					"1945. — dibināta Dienvidslāvijas Federatīvā Tautas Republika.",
					"1947. — ANO Ģenerālā asambleja nobalsoja par Palestīnas sadalīšanu." };
			int random29 = ran.nextInt(nov29.length);
			System.out.println(nov29[random29]);

			break;
		case 30:
			String[] nov30 = { "1966. — Barbadosa ieguva neatkarību no Apvienotās Karalistes.",
					"1954. — Silakaugas pilsētā Alabamas štatā meteorīta šķemba ievainoja sievieti — tas bija pirmais dokumentētais gadījums, kad no ārpuszemes objekta cieš cilvēks.",
					"1872. — Glāzgovā tika izspēlēta pirmā starptautiskā futbola spēle vēsturē. Anglijas izlase ar Skotijas izlasi nospēlēja neizšķirti 0:0." };
			int random30 = ran.nextInt(nov30.length);
			System.out.println(nov30[random30]);

			break;

		default:
			System.out.print("Novembrī šāda datuma nav");
			break;
		}
	}

}
