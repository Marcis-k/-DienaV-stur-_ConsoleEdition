import java.util.Random;
import java.util.Scanner;

public class January {
	Random ran = new Random();
	

	January(int date) {
		System.out.println();
		System.out.println(date+ ". " + "Janvāra notikums:");
		System.out.println();

		switch (date) {
		case 1:
			String[] jan1 = {
					"1801. — Īrijas karaliste apvienojās ar Lielbritānijas Karalisti, izveidojot Lielbritānijas impēriju, pieņemts pašreizējais Apvienotās Karalistes karogs.",
					"1959. — Fidela Kastro spēki gāza Kubas prezidenta Fulhensio Batistas režīmu.",
					"1993. — Čehoslovākija sadalījās divās valstīs: Čehijā un Slovākijā." };
			int random1 = ran.nextInt(jan1.length);
			System.out.println(jan1[random1]);
			
			break;
		case 2:
			String[] jan2 = {
					"1882. — ASV uzņēmējs Džons Rokfellers, apvienojot 40 dažādus naftas uzņēmumus, izveidoja Standard Oil.",
					"2004. — NASA zonde Stardust pārlidoja Vilda 2 komētu, savācot vielas paraugus, kurus pēc diviem gadiem atgādāja uz Zemi.",
					"1942. — Audriņu traģēdija: par no gūsta izbēgušu sarkanarmiešu karavīru slēpšanu nacistiskās Vācijas soda ekspedīcija nodedzināja Audriņu ciemu un nogalināja aptuveni 200 iedzīvotāju." };
			int random2 = ran.nextInt(jan2.length);
			System.out.println(jan2[random2]);
			break;
		case 3:
			String[] jan3 = {
					"1957. — ASV pulksteņu ražošanas uzņēmums Hamilton sāka ražot pasaulē pirmos elektroniskos pulksteņus.",
					"1959. — Aļaska kļuva par ASV 49. štatu.",
					"1987. — soulmūzikas dziedātāja Areta Franklina kļuva par pirmo sievieti, kas uzņemta Rokenrola Slavas zālē." };
			int random3 = ran.nextInt(jan3.length);
			System.out.println(jan3[random3]);

			break;
		case 4:
			String[] jan4 = { "1762. — Lielbritānija pieteica karu Spānijai un Neapolei.",
					"1948. — Birma atguva neatkarību no Apvienotās Karalistes.",
					"1959. — Luna-1 kļuva par pirmo kosmisko aparātu, kas sasniedzis Mēness apkārtni." };
			int random4 = ran.nextInt(jan4.length);
			System.out.println(jan4[random4]);

			break;
		case 5:
			String[] jan5 = { "1769. — Džeimss Vats ieguva patentu savam tvaika dzinējam.",
					"1895. — tika atklāti rentgenstari.",
					"1997. — Krievija izveda savus bruņotos spēkus no Čečenijas." };
			int random5 = ran.nextInt(jan5.length);
			System.out.println(jan5[random5]);

			break;
		case 6:
			String[] jan6 = {
					"1900. — Angļu—būru karš: būri uzbruka Leidismitai Dienvidāfrikā, tika nonāvēti vairāk nekā 1000 cilvēku.",
					"1912. — Ņūmeksika kļuva par 47. ASV štatu.",
					"1998. — palaista NASA Mēness zonde Lunar Prospector." };
			int random6 = ran.nextInt(jan6.length);
			System.out.println(jan6[random6]);

			break;
		case 7:
			String[] jan7 = { "1927. — tika veikts pirmais transatlantiskais telefona zvans no Ņujorkas uz Londonu.",
					"1953. — ASV prezidents Harijs Trumens paziņoja, ka ASV izstrādāta ūdeņraža bumba.",
					"1999. — tika sākta ASV prezidenta Billa Klintona impīčmenta procedūra." };
			int random7 = ran.nextInt(jan7.length);
			System.out.println(jan7[random7]);

			break;
		case 8:
			String[] jan8 = { "1297. — Monako ieguva neatkarību no Dženovas.",
					"1900. — ASV prezidents Viljams Makinlijs Aļaskā ieviesa militāro pārvaldi.",
					"1959. — Šarls de Golls kļuva par Francijas Republikas prezidentu." };
			int random8 = ran.nextInt(jan8.length);
			System.out.println(jan8[random8]);

			break;
		case 9:
			String[] jan9 = { "1788. — Konektikuta kļuva par piekto ASV štatu.",
					"1878. — Umberto I kļuva par Itālijas karali.",
					"1792. — noslēdzot Jasu miera līgumu, beidzās krievu—turku karš (1787—1792)." };
			int random9 = ran.nextInt(jan9.length);
			System.out.println(jan9[random9]);

			break;
		case 10:
			String[] jan10 = {
					"1920. — Tautu Savienības pirmā sanāksmē ratificēts Versaļas līgums, izbeidzot Pirmo pasaules karu.",
					"1923. — Klaipēdas apgabala vietējo lietuviešu izveidotā glābšanas komisija pasludināja pilsētu par pievienojušos Lietuvai.",
					"1946. — Londonā atklāta ANO Ģenerālā asambleja." };
			int random10 = ran.nextInt(jan10.length);
			System.out.println(jan10[random10]);

			break;
		case 11:
			String[] jan11 = { "1693. — Etnas vulkāna izvirdums Sicīlijā.",
					"1569. — Svētā Pāvila katedrālē notika pirmā vēsturē pieminētā loterija Anglijā.",
					"1990. — Lietuvā notika 300 000 liela cilvēku demonstrācija par neatkarības atgūšanu." };
			int random11 = ran.nextInt(jan11.length);
			System.out.println(jan11[random11]);

			break;
		case 12:
			String[] jan12 = { "1816. — Francijas valdība izdeva pavēli uz mūžu no valsts padzīt Napoleona ģimeni.",
					"1908. — pirmoreiz no Eifeļa torņa pārraidīts tālas distances radio signāls.",
					"1964. — Zanzibārā notika sacelšanās pret arābu sultāna varu un proklamēta republika." };
			int random12 = ran.nextInt(jan12.length);
			System.out.println(jan12[random12]);

			break;
		case 13:
			String[] jan13 = { "1900. — Vācijas ķeizars deklarēja, ka vācu valoda ir Vācijas armijas komandu valoda.",
					"1991. — PSRS bruņoto spēku vienības ieņēma Viļņas televīzijas torni Lietuvā, nogalinot 14 neapbruņotus civiliedzīvotājus un daudzus ievainojot.",
					"2001. — Salvadorā plosījās viesuļvētra, nogalinot vairāk kā 800 cilvēkus." };
			int random13 = ran.nextInt(jan13.length);
			System.out.println(jan13[random13]);

			break;
		case 14:
			String[] jan14 = { "1539. — Spānija anektēja Kubu.",
					"1953. — maršals Josips Brozs Tito kļuva par Dienvidslāvijas prezidentu.",
					"1994. — ASV prezidents Bills Klintons Maskavā ar Krievijas prezidentu Borisu Jeļcinu parakstīja vienošanos, pēc kuras raķetes vairs netika notēmētas uz pretējo valstu mērķiem, kā arī nolēma likvidēt kodolarsenālu Ukrainā." };
			int random14 = ran.nextInt(jan14.length);
			System.out.println(jan14[random14]);

			break;
		case 15:
			String[] jan15 = { "1943. — pabeigta Pentagona celtniecība.",
					"2001. — Vikipēdija, brīvā satura enciklopēdija, tika iedarbināta tiešsaistes režīmā.",
					"2006. — NASA zondes Stardust nolaižamais aparāts pirmoreiz vēsturē nogādāja uz Zemi komētas daļiņas." };
			int random15 = ran.nextInt(jan15.length);
			System.out.println(jan15[random15]);

			break;
		case 16:
			String[] jan16 = { "1891. — sākās Čīles Pilsoņu karš.", "1920. — ASV spēkā stājās «sausais likums».",
					"1969. — čehu students Jans Palahs pašaizdedzinājās Vāclava laukumā Prāgā, protestējot pret padomju iebrukumu 1968. gadā." };
			int random16 = ran.nextInt(jan16.length);
			System.out.println(jan16[random16]);

			break;
		case 17:
			String[] jan17 = {
					"1773. — britu kuģis Resolution Džeimsa Kuka vadībā bija pirmais kuģis, kas šķērsoja Dienvidu polāro loku.",
					"1875. — atklāts Stambulas Tünel (pazemes dzelzceļš), kas bija otrais pasaulē un pirmais kontinentālajā Eiropā.",
					"1995. — Japānā, Kobes tuvumā, notika 7,3 ballu stiprā Lielā Hanšinas zemestrīce, kas izraisīja plašus postījumus un 6434 cilvēku nāvi." };
			int random17 = ran.nextInt(jan17.length);
			System.out.println(jan17[random17]);

			break;
		case 18:
			String[] jan18 = { "1778. — angļu jūras braucējs Džeimss Kuks atklāja Havaju salas.",
					"1886. — tika uzbūvēta pirmā automašīna.",
					"2009. — Izraēla beidza karadarbību Gazas sektorā, kas sākās 2008. gada 27. decembrī." };
			int random18 = ran.nextInt(jan18.length);
			System.out.println(jan18[random18]);

			break;
		case 19:
			String[] jan19 = { "1806. — Apvienotā Karaliste okupēja Labās Cerības ragu.",
					"2001. — Beļģijā tika atļauta marihuānas lietošana un glabāšana.",
					"1649. — Kvebekā tika izpildīts pirmais nāves sods Kanādā (sodīta 16 gadu veca meitene par zagšanu)." };
			int random19 = ran.nextInt(jan19.length);
			System.out.println(jan19[random19]);

			break;
		case 20:
			String[] jan20 = { "1265. — grāfs Lankasters sasauca pirmo Anglijas parlamentu.",
					"1892. — Springfīldā, Masačūsetsas štatā, ASV notika pirmais basketbola turnīrs.",
					"1996. — Jāsirs Arafāts tika ievēlēts par Palestīnas autonomijas prezidentu." };
			int random20 = ran.nextInt(jan20.length);
			System.out.println(jan20[random20]);

			break;
		case 21:
			String[] jan21 = { "1774. — Osmaņu impērijā sāka valdīt Abdulhamids I.",
					"1921. — Zviedrijas sievietēm tika piešķirtas balsstiesības.",
					"1925. — Albānija tika pasludināta par republiku." };
			int random21 = ran.nextInt(jan21.length);
			System.out.println(jan21[random21]);

			break;
		case 22:
			String[] jan22 = { "1918. — Ukraina pasludināja neatkarību.",
					"1955. — ASV paziņoja par plāniem attīstīt starpkontinentālās ballistiskās raķetes.",
					"2008. — tika pieņemts pašreizējais Irākas karogs." };
			int random22 = ran.nextInt(jan22.length);
			System.out.println(jan22[random22]);

			break;
		case 23:
			String[] jan23 = { "1579. — tika parakstīta Utrehtas ūnija, izveidojot Nīderlandes valsti.",
					"1950. — Jeruzaleme tika pasludināta par Izraēlas galvaspilsētu.",
					"1996. — tika izlaista Java programmēšanas valodas pirmā versija." };
			int random23 = ran.nextInt(jan23.length);
			System.out.println(jan23[random23]);

			break;
		case 24:
			String[] jan24 = {
					"1848. — Amerikas Savienotajās Valstīs tika atrasts zelts un sākās Kalifornijas zelta drudzis",
					"1924. — Krievijas pilsēta Petrograda tika pārdēvēta par Ļeņingradu.",
					"1986. — Voyager 2 81 500 km attālumā palidoja garām Urānam." };
			int random24 = ran.nextInt(jan24.length);
			System.out.println(jan24[random24]);

			break;
		case 25:
			String[] jan25 = {
					"1533. — Anglijas karalis Henrijs VIII Tjudors slepus apprecēja Annu Boleinu, par ko tika padzīts no baznīcas.",
					"1554. — Brazīlijā tika dibināta Sanpaulu pilsēta.",
					"1858. — pirmo reizi tika atskaņots Mendelszona \"Kāzu maršs\"." };
			int random25 = ran.nextInt(jan25.length);
			System.out.println(jan25[random25]);

			break;
		case 26:
			String[] jan26 = { "1837. — Mičigana kļuva par 26. ASV štatu.",
					"1921. — Francija, Apvienotā Karaliste, Itālija, Beļģija un Japāna atzina Latvijas un Igaunijas neatkarību de jure.",
					"1934. — Vācija un Polija parakstīja 10 gadu neuzbrukšanas līgumu." };
			int random26 = ran.nextInt(jan26.length);
			System.out.println(jan26[random26]);

			break;
		case 27:
			String[] jan27 = { "1885. — tika izveidota Vācijas Austrumāfrika.",
					"1944. — tika pārrauta Ļeņingradas blokāde.",
					"1951. — Nevadas poligonā pirmoreiz izmēģināti atomieroči." };
			int random27 = ran.nextInt(jan27.length);
			System.out.println(jan27[random27]);

			break;
		case 28:
			String[] jan28 = { "1932. — Japāna okupēja Šanhaju.", "1937. — Latvijas Republikā pieņemts Civillikums.",
					"1724. — Sanktpēterburgā dibināja Krievijas Zinātņu akadēmiju." };
			int random28 = ran.nextInt(jan28.length);
			System.out.println(jan28[random28]);

			break;
		case 29:
			String[] jan29 = { "1676. — Fjodors III Romanovs kļuva par Krievijas caru.",
					"1960. — radīta pirmā mākslīgā niere.",
					"1916. — Pirmais pasaules karš: pirmoreiz Parīzi bombardēja vācu dirižabļi." };
			int random29 = ran.nextInt(jan29.length);
			System.out.println(jan29[random29]);

			break;
		case 30:
			String[] jan30 = { "1920. — starp Latviju un Padomju Krieviju tika parakstīts līgums par slepenu pamieru.",
					"1933. — Ādolfs Hitlers ievēlēts par Vācijas kancleru.",
					"1943. — Otrais pasaules karš: pie Staļingradas kapitulēja vācu 6. armija." };
			int random30 = ran.nextInt(jan30.length);
			System.out.println(jan30[random30]);

			break;
		case 31:
			String[] jan31 = { "1946. — pieņemta jauna Dienvidslāvijas konstitūcija pēc PSRS parauga.",
					"1968. — Nauru deklarēja neatkarību no Austrālijas.",
					"1983. — Apvienotajā Karalistē obligāta kļuva drošības josta automašīnu vadītājiem un priekšējiem pasažieriem." };
			int random31 = ran.nextInt(jan31.length);
			System.out.println(jan31[random31]);

			break;

		default:
			System.out.print("Janvārī šāda datuma nav");
			break;
		}

	}

}
