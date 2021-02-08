import java.util.Random;

public class August {
	Random ran = new Random();

	August(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Augusta notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] aug1 = { "1291. — dibināta Šveices Konfederācija.",
					"1902. — ASV nopirka tiesības uz Panamas kanālu no Francijas.",
					"1922. — Lietuvas Republikā pieņēma pirmo konstitūciju." };
			int random1 = ran.nextInt(aug1.length);
			System.out.println(aug1[random1]);

			break;
		case 2:
			String[] aug2 = { "1934. — Ādolfs Hitlers kļuva par Vācijas fīreru.",
					"1945. — noslēdzās Potsdamas konference, kas Eiropas robežas pēc Otrā pasaules kara.",
					"1990. — Līča karš: Irāka iebruka Kuveitā." };
			int random2 = ran.nextInt(aug2.length);
			System.out.println(aug2[random2]);

			break;
		case 3:
			String[] aug3 = { "1914. — Pirmais pasaules karš: Vācija pieteica karu Francijai.",
					"1940. — Lietuvas PSR tika uzņemta PSRS.", "2004. — ASV palaista Merkura zonde MESSENGER." };
			int random3 = ran.nextInt(aug3.length);
			System.out.println(aug3[random3]);

			break;
		case 4:
			String[] aug4 = {
					"1995. — Horvātijas bruņotie spēki sadarbībā ar Bosnijas un Hercegovinas armiju sāka operāciju \"Vētra\" (Operacija Oluja) pret serbu spēkiem.",
					"1993. — beidzās Ruandas pilsoņu karš.",
					"1914. — Pirmais pasaules karš: Vācija iebruka neitrālajā Beļģijā, un Apvienotā Karaliste pieteica karu Vācijai." };
			int random4 = ran.nextInt(aug4.length);
			System.out.println(aug4[random4]);

			break;
		case 5:
			String[] aug5 = { "1772. — sākās pirmā Polijas dalīšana.",
					"1969. — Mariner 7 veica Marsa pārlidojumu (3524 km no planētas virsmas).",
					"1973. — PSRS palaida Marsa zondi Mars-6." };
			int random5 = ran.nextInt(aug5.length);
			System.out.println(aug5[random5]);

			break;
		case 6:
			String[] aug6 = { "1890. — ASV pirmo reizi tika izpildīts nāvessods uz elektriskā krēsla.",
					"1932. — notika pirmais Venēcijas kinofestivāls.",
					"1806. — Svētās Romas pēdējais imperators Francis II dibināja Austrijas impēriju, likvidējot Svētās Romas impēriju." };
			int random6 = ran.nextInt(aug6.length);
			System.out.println(aug6[random6]);

			break;
		case 7:
			String[] aug7 = { "2006. — tika atklāta komēta C/2006 P1.",
					"1976. — ASV zonde Viking 2 iegāja orbītā ap Marsu.",
					"1955. — Tokijas Komunikāciju rūpniecības uzņēmums (tagad zināms kā Sony) pārdeva savus pirmos radioaparātus." };
			int random7 = ran.nextInt(aug7.length);
			System.out.println(aug7[random7]);

			break;
		case 8:
			String[] aug8 = { "1967. — Filipīnas, Indonēzija, Malaizija, Singapūra un Taizeme dibināja ASEAN.",
					"1945. — Otrais pasaules karš: PSRS pieteica karu Japānai, sākot iebrukumu Mandžūrijā.",
					"1919. — Apvienotā Karaliste un Afganistāna noslēdza Rāvalpindi miera līgumu." };
			int random8 = ran.nextInt(aug8.length);
			System.out.println(aug8[random8]);

			break;
		case 9:
			String[] aug9 = { "1704. — Lielais Ziemeļu karš: krievu armija ieņēma Narvas cietoksni.",
					"1810. — Napoleona Bonaparta vadītā Pirmā Franču impērija anektēja Vestfālenu.",
					"1973. — PSRS palaida Marsa zondi Mars-7." };
			int random9 = ran.nextInt(aug9.length);
			System.out.println(aug9[random9]);

			break;
		case 10:
			String[] aug10 = { "1990. — Magellan zonde sasniedza Veneru.",
					"1920. — Pirmais pasaules karš: Sabiedrotie un Osmaņu impērija noslēdza Sevras līgumu.",
					"1675. — lika Karaliskās Griničas observatorijas pamatakmeni." };
			int random10 = ran.nextInt(aug10.length);
			System.out.println(aug10[random10]);

			break;
		case 11:
			String[] aug11 = { "1804. — Francis II Hābsburgs kļuva par Austrijas imperatoru.",
					"1919. — Vācijā pieņēma Veimāras konstitūciju.", "1960. — Čada ieguva neatkarību no Francijas." };
			int random11 = ran.nextInt(aug11.length);
			System.out.println(aug11[random11]);

			break;
		case 12:
			String[] aug12 = {
					"2000. — Krievijas atomzemūdene K-141 Kursk nogrima Barenca jūrā, bojā gāja 118 apkalpes locekļi.",
					"1985. — Japānā nogāzās Japan Airlines lidmašīna, bojā gāja 520 cilvēki; visu laiku traģiskākā vienas lidmašīnas katastrofa.",
					"1960. — palaida pirmo sakaru pavadoni Echo 1." };
			int random12 = ran.nextInt(aug12.length);
			System.out.println(aug12[random12]);

			break;
		case 13:
			String[] aug13 = {
					"1521. — spāņi ieņēma Tenočtitlānu, sagūstīja valdnieku Kuautemoku un viņa augstākos padomdevējus.",
					"1918. — pirmās sievietes pievienojās ASV Jūras kājnieku korpusam.",
					"1960. — Centrālāfrikas Republika ieguva neatkarību no Francijas." };
			int random13 = ran.nextInt(aug13.length);
			System.out.println(aug13[random13]);

			break;
		case 14:
			String[] aug14 = {
					"1385. — Lietuvas lielkņaziste noslēdza Krēvas ūniju ar Polijas karalisti par dinastiju savienību.",
					"1912. — ASV jūras kājnieki iebruka Nikaragvā, lai atbalstītu ASV simpatizējošu valdību.",
					"2008. — Gruzija izstājas no Neatkarīgo Valstu Sadraudzības." };
			int random14 = ran.nextInt(aug14.length);
			System.out.println(aug14[random14]);

			break;
		case 15:
			String[] aug15 = { "1948. — uz dienvidiem no 38. ziemeļu paralēles dibināta Korejas Republika.",
					"1947. — Indija ieguva neatkarību no Apvienotās Karalistes, paliekot Nāciju Sadraudzībā.",
					"1945. — Otrais pasaules karš: pēc Japānas kapitulācijas tika atbrīvota Koreja." };
			int random15 = ran.nextInt(aug15.length);
			System.out.println(aug15[random15]);

			break;
		case 16:
			String[] aug16 = { "1954. — iznāca laikraksta Sports Illustrated pirmais numurs.",
					"1960. — Kipra ieguva neatkarību no Apvienotās Karalistes.",
					"2010. — Ķīna apsteidza Japānu, kļūstot par Pasaules otro lielāko ekonomiku." };
			int random16 = ran.nextInt(aug16.length);
			System.out.println(aug16[random16]);

			break;
		case 17:
			String[] aug17 = { "1999. — Turcijas pilsētu Izmitu skāra 7,4 ballu stiprā Izmitas zemestrīce.",
					"1982. — Vācijā tika publiski izlaists pirmais kompaktdisks (CD).",
					"1903. — Džozefs Pulicers nodibināja Pulicera balvu." };
			int random17 = ran.nextInt(aug17.length);
			System.out.println(aug17[random17]);

			break;
		case 18:
			String[] aug18 = {
					"1990. — gatavojoties valsts apvērsumam, PSRS prezidentam Mihailam Gorbačovam tika piemērots mājas arests.",
					"1968. — Varšavas līguma valstu vadība piekrita karaspēka ievešanai Čehoslovākijā.",
					"1877. — Asafs Hols atklāja Marsa dabisko pavadoni Fobosu." };
			int random18 = ran.nextInt(aug18.length);
			System.out.println(aug18[random18]);

			break;
		case 19:
			String[] aug19 = { "1953. — CIP palīdzēja gāzt Irānas valdību un atjaunot šaha varu.",
					"1919. — Afganistāna ieguva neatkarību no Apvienotās Karalistes.",
					"1903. — notika šķelšanās sestajā cionistu kongresā Bāzelē, apspriežot priekšlikumu dibināt ebreju valsti Ugandā." };
			int random19 = ran.nextInt(aug19.length);
			System.out.println(aug19[random19]);

			break;
		case 20:
			String[] aug20 = { "1896. — tika patentēts telefons ar ciparu ripu.",
					"1991. — reaģējot uz uzsākto valsts apvērsuma mēģinājumu Maskavā Igaunija deklarēja neatkarību no Padomju Savienības.",
					"1914. — Pirmā pasaules kara laikā Vācijas spēki ieņēma Briseli." };
			int random20 = ran.nextInt(aug20.length);
			System.out.println(aug20[random20]);

			break;
		case 21:
			String[] aug21 = { "1959. — Havajas kļuva par ASV 50. štatu.",
					"1986. — no Ņosa ezera Kamerūnā pēkšņi izdalījās 1,6 miljoni tonnu ogļskābās gāzes, 20 km rādiusā izraisot ap 1800 cilvēku nāvi.",
					"1993. — NASA zaudēja kontaktu ar Marsa zondi Mars Observer trīs dienas pirms ieiešanas planētas orbītā." };
			int random21 = ran.nextInt(aug21.length);
			System.out.println(aug21[random21]);

			break;
		case 22:
			String[] aug22 = { "1848. — ASV anektēja Ņūmeksiku.",
					"1864. — 16 Eiropas valstis parakstīja pirmo Ženēvas konvenciju.",
					"1932. — BBC sāka eksperimentālās televīzijas pārraides." };
			int random22 = ran.nextInt(aug22.length);
			System.out.println(aug22[random22]);

			break;
		case 23:
			String[] aug23 = { "1770. — angļu kapteinis Džeimss Kuks pasludināja Austrāliju par Anglijas īpašumu.",
					"1984. — Jeļenai Bonnerei (disidenta fiziķa Andreja Saharova sievai) tika piespriesti pieci gadi izsūtījumā.",
					"1839. — Apvienotā Karaliste ieņēma Honkongu, gatavojoties karam pret Ķīnu." };
			int random23 = ran.nextInt(aug23.length);
			System.out.println(aug23[random23]);

			break;
		case 24:
			String[] aug24 = { "1949. — stājās spēkā līgums par NATO izveidi.",
					"1991. — Rīgā sākta Ļeņina pieminekļa demontāža.",
					"1995. — Microsoft izlaida operētājsistēmu Windows 95." };
			int random24 = ran.nextInt(aug24.length);
			System.out.println(aug24[random24]);

			break;
		case 25:
			String[] aug25 = { "1515. — dibināta Kubas galvaspilsēta Havana.",
					"1817. — Vidzemē sāka atcelt dzimtbūšanu.",
					"1944. — Otrā pasaules kara laikā Sabiedrotie atbrīvoja Parīzi." };
			int random25 = ran.nextInt(aug25.length);
			System.out.println(aug25[random25]);

			break;
		case 26:
			String[] aug26 = { "1921. — Vācijā inflācijas dēļ notika nemieri Minhenē.",
					"1883. — sākās viens no visu laiku spēcīgākajiem vulkāna izvirdumiem Krakatau.",
					"1702. — Lielā Ziemeļu kara laikā Krievijas karaspēks ieņēma Alūksnes cietoksni." };
			int random26 = ran.nextInt(aug26.length);
			System.out.println(aug26[random26]);

			break;
		case 27:
			String[] aug27 = { "1793. — dibināta Toronto pilsēta Kanādā.",
					"1991. — Moldova deklarēja neatkarību no PSRS.",
					"1916. — Pirmā pasaules kara laikā Rumānija pieteica karu Austroungārijai." };
			int random27 = ran.nextInt(aug27.length);
			System.out.println(aug27[random27]);

			break;
		case 28:
			String[] aug28 = { "1867. — ASV okupēja Midveja salas.",
					"1916. — Pirmā pasaules kara laikā Itālija pieteica karu Vācijai.",
					"1988. — Ramšteinas katastrofa: ASV gaisa spēku bāzē Ramšteinā Vācijā aviošova laikā sadūrās trīs lidmašīnas, kā rezultātā gāja bojā 70 cilvēki un vairāk nekā 300 ievainoti." };
			int random28 = ran.nextInt(aug28.length);
			System.out.println(aug28[random28]);

			break;
		case 29:
			String[] aug29 = { "1982. — Vācijā pirmoreiz sintezēts ķīmiskais elements meitnerijs (atomskaitlis 109).",
					"1966. — The Beatles Sanfrancisko izpildīja savu pēdējo koncertu.",
					"1886. — Gotlībs Daimlers patentēja motociklu." };
			int random29 = ran.nextInt(aug29.length);
			System.out.println(aug29[random29]);

			break;
		case 30:
			String[] aug30 = { "1945. — Lielbritānijas bruņotie spēki atbrīvoja Honkongu no Japānas okupācijas.",
					"1991. — Azerbaidžāna deklarēja neatkarību no PSRS.",
					"1999. — Austrumtimorā iedzīvotāji atbalstīja neatkarību no Indonēzijas." };
			int random30 = ran.nextInt(aug30.length);
			System.out.println(aug30[random30]);

			break;
		case 31:
			String[] aug31 = {
					"1910. — Zasulauka stacijā Rīgā vilciens nāvīgi notrieca latviešu komponistu Emīlu Dārziņu.",
					"1935. — PSRS ogļracis Aleksejs Stahanovs uzstādīja rekordu, maiņā iegūdams 104 t akmeņogļu.",
					"1994. — no Latvijas un Igaunijas tika izvesta Krievijas armija (Latvijā turpināja darboties tikai Skrundas lokators)." };
			int random31 = ran.nextInt(aug31.length);
			System.out.println(aug31[random31]);

			break;

		default:
			System.out.print("Augustā šāda datuma nav");
			break;
		}
	}

}
