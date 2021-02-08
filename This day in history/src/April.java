import java.util.Random;

public class April {
	Random ran = new Random();

	April(int date) {
		System.out.println();
		System.out.println(date+ ". " + "Aprīļa notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] apr1 = {
					"1939. — ģenerālisimuss Fransisko Franko paziņoja par Spānijas pilsoņu kara beigām, kad bija padevušies pēdējie republikāņu spēki.",
					"1948. — Fēru Salas ieguva autonomiju Dānijas sastāvā.",
					"1967. — Stīvs Džobss un Stīvs Vozņaks dibināja Apple Computer." };
			int random1 = ran.nextInt(apr1.length);
			System.out.println(apr1[random1]);

			break;
		case 2:
			String[] apr2 = { "1801. — Napoleona kari: notika Kopenhāgenas kauja, kurā briti iznīcināja dāņu floti.",
					"1902. — Losandželosā tika atklāts pirmais kinoteātris ASV.",
					"1945. — tika izveidoti diplomātiski sakari starp PSRS un Brazīliju." };
			int random2 = ran.nextInt(apr2.length);
			System.out.println(apr2[random2]);

			break;
		case 3:
			String[] apr3 = { "1885. — Gotlībam Daimleram piešķīra vācu patentu par dzinēju.",
					"1954. — PSRS vēstniecības Kanberā trešais sekretārs Vladimirs Petrovs lūdza un saņēma politisko patvērumu Austrālijā.",
					"1973. — ASV, Ņujorkā tika veikts pirmais mobilā telefona zvans." };
			int random3 = ran.nextInt(apr3.length);
			System.out.println(apr3[random3]);

			break;
		case 4:
			String[] apr4 = { "1850. — Losandželosa ieguva pilsētas tiesības.",
					"1975. — Bills Geitss un Pols Allens dibināja Microsoft.",
					"1969. — Dentonam Kūlejam implantēja pirmo pagaidu mākslīgo sirdi." };
			int random4 = ran.nextInt(apr4.length);
			System.out.println(apr4[random4]);

			break;
		case 5:
			String[] apr5 = { "1242. — Ledus kauja uz Peipusa ezera starp Novgorodas kņazisti un krustnešiem.",
					"1968. — Čehoslovākijā tika publicēta Rīcības programma, lai veidotu no PSRS neatkarīgu politiku.",
					"1969. — Vjetnamas karš: daudzās ASV pilsētās notika plašas pretkara demonstrācijas." };
			int random5 = ran.nextInt(apr5.length);
			System.out.println(apr5[random5]);

			break;
		case 6:
			String[] apr6 = { "1917. — Pirmais pasaules karš: ASV pieteica karu Vācijai.",
					"1941. — Otrais pasaules karš: Vācija iebruka Dienvidslāvijas Karalistē un Grieķijā.",
					"2004. — Rolands Pakss kļuva par pirmo Lietuvas prezidentu, kas atcelts no amata pēc impīčmenta procedūras." };
			int random6 = ran.nextInt(apr6.length);
			System.out.println(apr6[random6]);

			break;
		case 7:
			String[] apr7 = { "1795. — Francijā metru pieņēma par garuma pamata mērvienību.",
					"1923. — starp Latviju un Padomju Krieviju tika parakstīts robežlīgums.",
					"2003. — ASV spēki ieņēma Bagdādi." };
			int random7 = ran.nextInt(apr7.length);
			System.out.println(apr7[random7]);

			break;
		case 8:
			String[] apr8 = {
					"1525. — Krakovā tika parakstīts līgums, saskaņā ar kuru Teitoņu ordeņa valsts vietā tika dibināta Prūsijas hercogiste, Polijas troņa vasaļvalsts.",
					"1940. — Otrais pasaules karš: Vācijas karaspēks okupēja Norvēģijas galvaspilsētu Oslo.",
					"1993. — Maķedonijas Republika tika uzņemta ANO." };
			int random8 = ran.nextInt(apr8.length);
			System.out.println(apr8[random8]);

			break;
		case 9:
			String[] apr9 = { "1940. — Otrais pasaules karš: Vācija iebruka Dānijā un Norvēģijā.",
					"1942. — Otrais pasaules karš: Batānas Nāves maršs — 70 000 ASV un Filipīnu karavīri padevās japāņiem.",
					"1991. — Gruzija pasludināja neatkarību no PSRS." };
			int random9 = ran.nextInt(apr9.length);
			System.out.println(apr9[random9]);

			break;
		case 10:
			String[] apr10 = {
					"1945. — Otrais pasaules karš: Sabiedroto spēki atbrīvoja nacistu koncentrācijas nometni Būhenvaldē.",
					"1980. — Spānija un Apvienotā Karaliste vienojās par Gibraltāra robežas atvēršanu, kas tika slēgta 1969. gadā.",
					"2006. — Romano Prodi ar nelielu balsu pārsvaru sakāva Silvio Berluskoni Itālijas parlamenta vēlēšanās." };
			int random10 = ran.nextInt(apr10.length);
			System.out.println(apr10[random10]);

			break;
		case 11:
			String[] apr11 = { "1919. — izveidota Starptautiskā Darba organizācija.",
					"2006. — ESA zonde Venus Express iegāja Veneras orbītā.",
					"2007. — teroristiskais grupējums Al Qaeda uzņēmās atbildību par diviem sprādzieniem Alžīrā, kuros bojā gāja 33 cilvēki, vairāk kā 200 ievainoti." };
			int random11 = ran.nextInt(apr11.length);
			System.out.println(apr11[random11]);

			break;
		case 12:
			String[] apr12 = {
					"1861. — sākās Amerikas pilsoņu karš, konfederātu spēkiem uzbrūkot Samteras fortam Dienvidkarolīnā.",
					"1917. — Pirmais Pasaules karš: Kanādas spēki uzvarēja kaujā par Vimī kori.",
					"1955. — ASV ieviesta poliomielīta vakcīna." };
			int random12 = ran.nextInt(apr12.length);
			System.out.println(apr12[random12]);

			break;
		case 13:
			String[] apr13 = { "1849. — Ungārija kļuva par republiku.",
					"1974. — ASV palaists pirmais komerciālais ģeostacionārais sakaru pavadonis Westar 1.",
					"1975. — sākās Libānas pilsoņu karš." };
			int random13 = ran.nextInt(apr13.length);
			System.out.println(apr13[random13]);

			break;
		case 14:
			String[] apr14 = {
					"1912. — pasažieru kuģis “Titāniks” Atlantijas ziemeļdaļā sadūrās ar aisbergu un nākamajā rīta nogrima, bojā gāja 1503 cilvēki.",
					"1978. — Tbilisi, Gruzijas PSR notika demonstrācijas, protestējot pret valsts valodas statusa noņemšanu gruzīnu valodai.",
					"2003. — pabeigts Cilvēka genoma projekts, sekvencējot 99% cilvēka genoma, ar 99,99% precizitāti." };
			int random14 = ran.nextInt(apr14.length);
			System.out.println(apr14[random14]);

			break;
		case 15:
			String[] apr15 = { "1945. — Otrais pasaules karš: atbrīvota Bergenes-Belzenes koncentrācijas nometne.",
					"1955. — tika atvērts pirmais McDonald's franšīzes ātrās apkalpošanas restorāns.",
					"2013. — Bostonas maratona laikā notika divi sprādzieni, kuros gāja bojā 3 cilvēki un 246 cilvēki tika ievainoti." };
			int random15 = ran.nextInt(apr15.length);
			System.out.println(apr15[random15]);

			break;
		case 16:
			String[] apr16 = { "1917. — Ļeņins ieradās Petrogradā no emigrācijas.",
					"1945. — Otrais pasaules karš: Sarkanā armija sāka Berlīnes operāciju.",
					"1994. — referendumā Somijā atbalstīta pievienošanās Eiropas Savienībai." };
			int random16 = ran.nextInt(apr16.length);
			System.out.println(apr16[random16]);

			break;
		case 17:
			String[] apr17 = { "1861. — Virdžīnija nolēma atdalīties no ASV.",
					"1919. — Francijā ieviesta astoņu stundu darba diena.",
					"1970. — Apollo programma: bojātais kosmosa kuģis Apollo 13 atgriezās uz Zemes." };
			int random17 = ran.nextInt(apr17.length);
			System.out.println(apr17[random17]);

			break;
		case 18:
			String[] apr18 = { "1906. — Sanfrancisko, ASV, notika postoša zemestrīce.",
					"1946. — likvidēta Tautu Savienība, nodibinoties ANO.",
					"1983. — Beirūtā, Libānā, tika uzspridzināta ASV vēstniecība, bojā gāja 63 cilvēki." };
			int random18 = ran.nextInt(apr18.length);
			System.out.println(apr18[random18]);

			break;
		case 19:
			String[] apr19 = { "1896. — notika pirmās riteņbraukšanas sacensības Parīze-Rubē",
					"1995. — Oklahomasitijā, ASV notika sprādziens federālajā ēkā, bojā gāja 168 cilvēki.",
					"1999. — Vācijas Bundestāgs atgriezās Berlīnē." };
			int random19 = ran.nextInt(apr19.length);
			System.out.println(apr19[random19]);

			break;
		case 20:
			String[] apr20 = { "1792. — Francija pieteica karu Austrijai, sākot Franču revolūcijas karus.",
					"1945. — Otrais pasaules karš: ASV spēki ieņēma Leipcigu.",
					"1999. — apšaude Kolumbainas vidusskolā ASV: 2 skolēni nošāva 12 skolas biedrus un 1 skolotāju, ievainoja 24." };
			int random20 = ran.nextInt(apr20.length);
			System.out.println(apr20[random20]);

			break;
		case 21:
			String[] apr21 = { "1509. — pēc Henrija VII nāves Anglijas tronī viņu nomainīja dēls Henrijs VIII.",
					"1944. — sievietes Francijā ieguva vēlēšanas tiesības.",
					"1960. — oficiāli atklāta Brazīlijas jaunā galvaspilsēta Brazilja." };
			int random21 = ran.nextInt(apr21.length);
			System.out.println(apr21[random21]);

			break;
		case 22:
			String[] apr22 = { "1343. — Igaunijā uzliesmoja tā sauktā Jurģa nakts sacelšanās.",
					"1993. — izlaista tīmekļa pārlūkprogrammas Mosaic pirmā versija.",
					"1997. — beidzās 126 dienu ķīlnieku krīze Japānas vēstniecībā Limā, Peru, pēc specvienību uzbrukuma ēkām." };
			int random22 = ran.nextInt(apr22.length);
			System.out.println(apr22[random22]);

			break;
		case 23:
			String[] apr23 = { "1919. — uz pirmo sēdi sanāca Igaunijas Satversmes sapulce.",
					"1985. — Coca Cola mainīja dzēriena formulu, izlaižot New Coke, tomēr cilvēku reakcija bija tik ļoti negatīva, ka iepriekšējās formulas dzēriens atgriezās atpakaļ tirdzniecībā mazāk kā pēc 3 mēnešiem.",
					"1993. — Eritrejas iedzīvotāji nobalsoja par neatkarību no Etiopijas ANO pārraudzītajā referendumā." };
			int random23 = ran.nextInt(apr23.length);
			System.out.println(apr23[random23]);

			break;
		case 24:
			String[] apr24 = {
					"1915. — sākās Armēņu genocīds ar simtiem ietekmīgu armēņu deportāciju no Konstantinopoles.",
					"1981. — demonstrēts pirmais IBM PC personālais dators.",
					"1990. — VFR un VDR piekrita apvienot ekonomiku un valūtu 1. jūlijā." };
			int random24 = ran.nextInt(apr24.length);
			System.out.println(apr24[random24]);

			break;
		case 25:
			String[] apr25 = {
					"1953. — Frānsiss Kriks un Džeimss Votsons publicēja pētījumu rezultātus par DNS struktūru.",
					"1974. — Portugalē Neļķu revolūcijā atjaunoja demokrātiju pēc 40 gadu ilga autoritāra režīma.",
					"2002. — startēja kosmosa kuģis Sojuz TM-34 ar otro \"kosmisko tūristu\" Marku Šatlvortu un diviem profesionāliem kosmonautiem." };
			int random25 = ran.nextInt(apr25.length);
			System.out.println(apr25[random25]);

			break;
		case 26:
			String[] apr26 = {
					"1933. — tika nodibināta gestapo (Geheime Staatspolizei) — slepenpolicija nacistiskajā Vācijā.",
					"1900. — dzimis Čārlzs Rihters, ASV seismologs, Rihtera skalas radītājs.",
					"1966. — 7,5 magnitūdas spēcīga zemestrīce iznīcināja Taškentu." };
			int random26 = ran.nextInt(apr26.length);
			System.out.println(apr26[random26]);

			break;
		case 27:
			String[] apr27 = { "1961. — Sjerraleone ieguva neatkarību no Apvienotās Karalistes.",
					"1994. — Dienvidāfrikas Republikā notika pirmās vēlēšanas, kurās ļauts piedalīties visu rasu pārstāvjiem.",
					"2007. — Igaunijā pārvietota Bronzas karavīra statuja, izraisot protestus gan no valstī dzīvojošo krievu puses, gan Krievijas." };
			int random27 = ran.nextInt(apr27.length);
			System.out.println(apr27[random27]);

			break;
		case 28:
			String[] apr28 = { "1788. — Mērilenda kļuva par septīto ASV štatu.", "1952. — ASV beidza Japānas okupāciju",
					"1969. — Šarls de Golls atkāpās no Francijas prezidenta amata." };
			int random28 = ran.nextInt(apr28.length);
			System.out.println(apr28[random28]);

			break;
		case 29:
			String[] apr29 = { "1483. — Grankanāriju, galveno Kanāriju salu, iekaroja Kastīlijas karaliste.",
					"1991. — tropiskais ciklons uzbruka Bangladešai, bojā gāja aptuveni 138 000 cilvēku, bez pajumtes palika vairāk nekā 10 miljoni cilvēku.",
					"2007. — Sīrija pabeidza savu bruņoto spēku izvešanu no Libānas, beidzot 29 gadu okupāciju." };
			int random29 = ran.nextInt(apr29.length);
			System.out.println(apr29[random29]);

			break;
		case 30:
			String[] apr30 = { "1916. — Vācija kļuva par pirmo valsti, kura pārgāja uz vasaras laiku.",
					"1975. — Vjetnamas karš beidzās, komunistiskajiem spēkiem ieņemot Saigonu.",
					"1993. — CERN palaida globālo tīmekli brīvā izmantošanā jebkuram lietotājam." };
			int random30 = ran.nextInt(apr30.length);
			System.out.println(apr30[random30]);

			break;

		default:
			System.out.print("Aprilī šāda datuma nav");
			break;
		}
	}

}
