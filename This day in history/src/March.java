import java.util.Random;

public class March {
	Random ran = new Random();

//System.out   ( x+"martaa :") ....
	March(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Marta notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] mar1 = { "1815. — Napoleons Bonaparts atgriezās Francijā no izsūtījuma trimdā uz Elbas salu.",
					"1847. — ASV štatā Mičiganā oficiāli atcēla nāvessodu.",
					"1992. — Bosnija un Hercegovina pasludināja neatkarību no Dienvidslāvijas." };
			int random1 = ran.nextInt(mar1.length);
			System.out.println(mar1[random1]);

			break;
		case 2:
			String[] mar2 = { "1855. — Aleksandrs II kļuva par Krievijas caru.",
					"1956. — Maroka pasludināja neatkarību no Francijas.",
					"1970. — Rodēzija tika pasludināta par republiku, saraujot pēdējās saites ar Apvienoto Karalisti." };
			int random2 = ran.nextInt(mar2.length);
			System.out.println(mar2[random2]);

			break;
		case 3:
			String[] mar3 = { "1795. — Kurzemes hercogiste tika iekļauta Krievijas Impērijā.",
					"1924. — Turcijā tika atcelts 1400 gadu senais kalifāts, atceļot kalifa titulu.",
					"1991. — Latvijā notika aptauja, kurā vairākums balsotāju atbalstīja \"demokrātisku un neatkarīgu Latviju\"; tajā pašā dienā Igaunijā arī notika analoģisks referendums." };
			int random3 = ran.nextInt(mar3.length);
			System.out.println(mar3[random3]);

			break;
		case 4:
			String[] mar4 = { "1822. — Bostona ieguva pilsētas tiesības.",
					"1861. — par ASV prezidentu kļuva Abrahams Linkolns.",
					"2007. — Igaunijā notika parlamenta vēlēšanas, kurās pirmo reizi pasaulē iedzīvotājiem bija iespēja balsot arī elektroniskā veidā." };
			int random4 = ran.nextInt(mar4.length);
			System.out.println(mar4[random4]);

			break;
		case 5:
			String[] mar5 = { "1918. — Padomju Krievija pārvietoja galvaspilsētu no Petrogradas uz Maskavu",
					"1940. — Katiņas slaktiņš: PSKP CK Politbiroja locekļi parakstīja pavēli par vairāk nekā 20 000 poļu karavīru un inteliģences nošaušanu.",
					"1991. — Irāka atbrīvoja visus Līča kara gūstekņus." };
			int random5 = ran.nextInt(mar5.length);
			System.out.println(mar5[random5]);

			break;
		case 6:
			String[] mar6 = { "1940. — Ziemas karš: starp Somiju un Padomju Savienību tika noslēgts pamiers.",
					"1945. — Rumānijā izveidota komunistiski noskaņota valdība.",
					"1997. — Šrilankā Tamilu Tīģeri uzbruka militārajai bāzei, nogalinot vairāk nekā 200 cilvēku." };
			int random6 = ran.nextInt(mar6.length);
			System.out.println(mar6[random6]);

			break;
		case 7:
			String[] mar7 = { "1918. — Pirmais pasaules karš: Somija noslēdza aliansi ar Vāciju.",
					"1969. — Golda Meira kļuva par pirmo sievieti Izraēlas premjerministra amatā.",
					"1996. — darbu uzsāka pirmais demokrātiski ievēlētais Palestīnas parlaments." };
			int random7 = ran.nextInt(mar7.length);
			System.out.println(mar7[random7]);

			break;
		case 8:
			String[] mar8 = { "1817. — tika dibināta Ņujorkas fondu birža.",
					"1945. — Josips Brozs Tito izveidoja Dienvidslāvijas valdību.",
					"1980. — PSRS tika rīkots pirmais rokmūzikas festivāls." };
			int random8 = ran.nextInt(mar8.length);
			System.out.println(mar8[random8]);

			break;
		case 9:
			String[] mar9 = { "1908. — Milānā, Itālijā dibināts futbola klubs F.C. Internazionale Milano.",
					"1991. — Belgradas ielās notika demonstrācijas pret Serbijas prezidentu Slobodanu Miloševiču.",
					"1992. — Ķīnas Tautas Republika ratificēja Kodolieroču neizplatīšanas līgumu." };
			int random9 = ran.nextInt(mar9.length);
			System.out.println(mar9[random9]);

			break;
		case 10:
			String[] mar10 = { "1876. — Aleksandrs Greiems Bells veica pirmo telefona sarunu.",
					"1892. — Kotdivuāra kļuva par Francijas koloniju.",
					"1952. — Fulhensio Batista veica valsts apvērsumu Kubā." };
			int random10 = ran.nextInt(mar10.length);
			System.out.println(mar10[random10]);

			break;
		case 11:
			String[] mar11 = { "1951. — Indijas pilsētā Ņūdeli beidzās pirmās Āzijas spēles.",
					"1990. — Lietuvas PSR Augstākā Padome pieņēma neatkarības deklarāciju.",
					"2004. — Madridē, Spānijā vienlaicīgos sprādzienos vilcienos dzīvību zaudēja 190 cilvēki." };
			int random11 = ran.nextInt(mar11.length);
			System.out.println(mar11[random11]);

			break;
		case 12:
			String[] mar12 = { "1994. — Anglikāņu baznīca pirmoreiz par priesteri apstiprināja sievieti.",
					"1947. — tika pasludināta Trumena doktrīna, lai palīdzētu Grieķijai un Turcijai pret spiedienu no PSRS.",
					"1934. — Igaunijā Konstantīns Petss un Johans Laidoners veica valsts apvērsumu; tika aizliegtas politiskās partijas." };
			int random12 = ran.nextInt(mar12.length);
			System.out.println(mar12[random12]);

			break;
		case 13:
			String[] mar13 = { "1881. — izveidota Rumānijas karaliste.",
					"1781. — astronoms Viljams Heršels atklāja Saules sistēmas planētu Urānu.",
					"1325. — dibināta Mehiko." };
			int random13 = ran.nextInt(mar13.length);
			System.out.println(mar13[random13]);

			break;
		case 14:
			String[] mar14 = { "1903. — ASV Senāts ratificēja līgumu, kurā Kolumbija atļāva būvēt Panamas kanālu.",
					"1978. — Izraēlas spēki iebruka un okupēja Libānas dienvidus.",
					"2004. — Vladimirs Putins tika atkārtoti ievēlēts par Krievijas prezidentu." };
			int random14 = ran.nextInt(mar14.length);
			System.out.println(mar14[random14]);

			break;
		case 15:
			String[] mar15 = { "44. p.m.ē. — nogalināts Jūlijs Cēzars.",
					"1918. — Jelgavā deklarēta Kurzemes hercogistes atjaunošana.",
					"1990. — Mihails Gorbačovs ievēlēts par pirmo (un pēdējo) PSRS prezidentu." };
			int random15 = ran.nextInt(mar15.length);
			System.out.println(mar15[random15]);

			break;
		case 16:
			String[] mar16 = { "1521. — Filipīnās pirmo reizi ieradās eiropieši. Ekspedīciju vadīja Fernāns Magelāns.",
					"1942. — pirmais vācu raķetes V-2 izmēģinājums, raķete eksplodēja netālu no starta laukuma.",
					"2005. — Izraēla oficiāli Palestīnai atdeva kontroli pār pilsētu Jēriku." };
			int random16 = ran.nextInt(mar16.length);
			System.out.println(mar16[random16]);

			break;
		case 17:
			String[] mar17 = { "1378. — Kurzemes bīskaps Oto piešķīra pilsētas tiesības Aizputei.",
					"1901. — Parīzē, Bernheimas galerijā pirmoreiz izstādīti holandiešu gleznotāja Vinsenta van Goga darbi, kas izraisīja milzu sensāciju mākslas pasaulē.",
					"1992. — referendumā Dienvidāfrikā vairums nobalsoja par aparteīda izbeigšanu." };
			int random17 = ran.nextInt(mar17.length);
			System.out.println(mar17[random17]);

			break;
		case 18:
			String[] mar18 = { "1921. — Rīgā noslēgts miera līgums starp Poliju un Padomju Krieviju.",
					"1990. — notika Latvijas PSR Augstākās Padomes vēlēšanas, kurās pirmoreiz vēlēšanu apgabalos varēja izvirzīt vairākus kandidātus.",
					"1992. — Microsoft izlaida operētājsistēmu Windows 3.1." };
			int random18 = ran.nextInt(mar18.length);
			System.out.println(mar18[random18]);

			break;
		case 19:
			String[] mar19 = {
					"1831. — Ņujorkas pilsētas banka kļuva par vietu pirmajai lielajai banku laupīšanai ASV vēsturē, laupītājiem nolaupot 245 000 USD.",
					"1944. — Otrais pasaules karš: vācu armija okupēja Ungāriju.",
					"1946. — Franču Gviāna, Gvadelupa, Martinika un Reinjona kļuva par Francijas aizjūras departamentiem." };
			int random19 = ran.nextInt(mar19.length);
			System.out.println(mar19[random19]);

			break;
		case 20:
			String[] mar20 = {
					"1861. — zemestrīce Argentīnas rietumos iznīcināja Mendosas pilsētu, nogalinot ap 5000 tās iedzīvotāju.",
					"1916. — Alberts Einšteins publicēja vispārējo relativitātes teoriju.",
					"2003. — sākās ASV iebrukums Irākā." };
			int random20 = ran.nextInt(mar20.length);
			System.out.println(mar20[random20]);

			break;
		case 21:
			String[] mar21 = { "1857. — zemestrīcē Tokijā, Japānā, gāja bojā vairāk kā 100 000 cilvēku.",
					"1935. — Persija tika pārdēvēta par Irānu.",
					"1990. — Namībija ieguva neatkarību pēc 75 gadu ilgas pakļautības Dienvidāfrikai." };
			int random21 = ran.nextInt(mar21.length);
			System.out.println(mar21[random21]);

			break;
		case 22:
			String[] mar22 = {
					"1873. — Spānijas Nacionālā asambleja pieņēma likumu, ar kuru tika atcelta verdzība Puertoriko.",
					"1894. — notika pirmā Stenlija kausa izcīņas izslēgšanas spēle.",
					"1939. — Otrais pasaules karš: Vācija okupēja Lietuvai piederošo Mēmeli." };
			int random22 = ran.nextInt(mar22.length);
			System.out.println(mar22[random22]);

			break;
		case 23:
			String[] mar23 = { "1919. — Milānā, Itālijā, Benito Musolīni nodibināja fašistu politisko kustību.",
					"1991. — sākās Sjerraleones pilsoņu karš.",
					"2001. — orbitālā stacija Mir tika nogremdēta Klusā okeāna dienvidu daļā." };
			int random23 = ran.nextInt(mar23.length);
			System.out.println(mar23[random23]);

			break;
		case 24:
			String[] mar24 = { "1923. — Grieķija kļuva par republiku.",
					"1924. — Latvijā dibināts Triju Zvaigžņu ordenis.",
					"2004. — darbu sāka viens no Latvijas populārākajiem interneta portāliem Draugiem.lv." };
			int random24 = ran.nextInt(mar24.length);
			System.out.println(mar24[random24]);

			break;
		case 25:
			String[] mar25 = { "1655. — Kristiāns Heigenss atklāja Saturna lielāko pavadoni Titānu.",
					"1949. — Padomju Savienība veica masveida deportācijas no Baltijas valstīm, izvedot vairāk nekā 92 000 cilvēku.",
					"1954. — PSRS atzina Austrumvācijas suverenitāti, tomēr atstāja padomju bruņotos spēkus valstī." };
			int random25 = ran.nextInt(mar25.length);
			System.out.println(mar25[random25]);

			break;
		case 26:
			String[] mar26 = { "1817. — Kurzemē atcēla dzimtbūšanu.",
					"1971. — Bangladeša deklarēja neatkarību no Pakistānas, kā rezultātā sākās Bangladešas atbrīvošanas karš.",
					"1995. — stājās spēkā Šengenas līgums." };
			int random26 = ran.nextInt(mar26.length);
			System.out.println(mar26[random26]);

			break;
		case 27:
			String[] mar27 = { "1625. — Čārlzs I kļuva par Skotijas, Īrijas un Anglijas karali.",
					"1918. — Moldova un Besarābija pievienojās Rumānijai.",
					"1994. — pirmo lidojumu veica Eiropas iznīcinātājlidmašīnas Eurofighter 2000 Typhoon prototips." };
			int random27 = ran.nextInt(mar27.length);
			System.out.println(mar27[random27]);

			break;
		case 28:
			String[] mar28 = {
					"1930. — Turcijas pilsētām Konstantinopolei un Angorai tika mainīti nosaukumi uz Stambulu un Ankaru.",
					"1990. — dibināta Latvijas Kultūras akadēmija.",
					"2005. — Indonēzijā Sumatras salā notika 8,7 ballu stipra zemestrīce, kas bija otra spēcīgākā zemestrīce kopš 1965. gada." };
			int random28 = ran.nextInt(mar28.length);
			System.out.println(mar28[random28]);

			break;
		case 29:
			String[] mar29 = {
					"1942. — Otrais pasaules karš: Sabiedroto aviācijas uzlidojumā Lībekai piektā daļa no vecpilsētas tika sagrauta.",
					"1973. — Vjetnamas karš: pēdējais ASV karavīrs atstāja Dienvidvjetnamu.",
					"2004. — NATO tika uzņemta Bulgārija, Igaunija, Latvija, Rumānija, Slovākija un Slovēnija." };
			int random29 = ran.nextInt(mar29.length);
			System.out.println(mar29[random29]);
			break;
		case 30:
			String[] mar30 = { "1856. — ar Parīzes miera līguma noslēgšanu beidzās Krimas karš.",
					"1867. — beidza pastāvēt Austrijas impērija.",
					"1945. — Otrais pasaules karš: PSRS spēki iegāja Austrijā un ieņēma Vīni; padomju un poļu spēki ieņēma Gdaņsku." };
			int random30 = ran.nextInt(mar30.length);
			System.out.println(mar30[random30]);

			break;
		case 31:
			String[] mar31 = { "1918. — ASV pirmoreiz tika pielietots vasaras laiks.",
					"1931. — zemestrīce iznīcināja Managvu Nikaragvā, bojā gāja apmēram 2000 cilvēku.",
					"1959. — dalailama (Tenzins Gjaco) šķērsoja Indijas robežu, lūdzot politisko patvērumu." };
			int random31 = ran.nextInt(mar31.length);
			System.out.println(mar31[random31]);

			break;

		default:
			System.out.print("Martā šāda datuma nav");
			break;
		}
	}

}
