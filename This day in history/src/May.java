import java.util.Random;

public class May {
	Random ran = new Random();

	May(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Maija notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] maj1 = { "1851. — tika atklāta Lielā izstāde Kristāla pilī, Londonā.",
					"1920. — uz pirmo sēdi sanāca Latvijas Satversmes sapulce.",
					"1948. — dibināta Korejas Tautas Demokrātiskā Republika." };
			int random1 = ran.nextInt(maj1.length);
			System.out.println(maj1[random1]);

			break;
		case 2:
			String[] maj2 = {
					"1945. — Padomju Savienība paziņoja par Berlīnes ieņemšanu; padomju karavīri pacēla sarkano karogu virs Reihstāga.",
					"1997. — Tonijs Blērs kļuva par Apvienotās Karalistes premjerministru.",
					"2011. — ASV specvienība Pakistānā nogalināja Osamu bin Ladenu, aizdomās turēto par 11. septembra uzbrukumiem un FIB meklētāko personu." };
			int random2 = ran.nextInt(maj2.length);
			System.out.println(maj2[random2]);

			break;
		case 3:
			String[] maj3 = { "1802. — Vašingtona ieguva pilsētas tiesības.",
					"1947. — Japānā stājās spēkā jauna konstitūcija.", "2000. — paslēpts pirmais Geocaching slēpnis." };
			int random3 = ran.nextInt(maj3.length);
			System.out.println(maj3[random3]);

			break;
		case 4:
			String[] maj4 = {
					"1776. — Rodailenda pirmā no ASV štatiem pasludināja neatkarību no Apvienotās Karalistes.",
					"1935. — Latvijas basketbola izlase izcīnīja uzvaru 1935. gada Eiropas čempionātā Šveicē, kļūstot par pirmajiem Eiropas čempioniem.",
					"1949. — Pasniegta pirmā Grammy balva." };
			int random4 = ran.nextInt(maj4.length);
			System.out.println(maj4[random4]);

			break;
		case 5:
			String[] maj5 = { "1936. — Itālijas spēki okupēja Adisabebu, Etiopijā.",
					"1949. — Strasbūrā dibināta Eiropas Padome.", "1997. — palaisti pirmie 5 Iridium pavadoņi." };
			int random5 = ran.nextInt(maj5.length);
			System.out.println(maj5[random5]);

			break;
		case 6:
			String[] maj6 = { "1861. — Amerikas Pilsoņu karš: Ārkanzasa izstājās no ASV.",
					"1910. — Džordžs V kļuva par Apvienotās Karalistes karali pēc sava tēva Edvarda VII nāves.",
					"2007. — Francijas prezidenta vēlēšanu otrajā kārtā ar 53% balsu tika ievēlēts Nikolā Sarkozī." };
			int random6 = ran.nextInt(maj6.length);
			System.out.println(maj6[random6]);

			break;
		case 7:
			String[] maj7 = { "1832. — Grieķija ieguva neatkarību.",
					"1895. — Sanktpēterburgā krievu zinātnieks Aleksandrs Popovs demonstrēja pirmo radiouztvērēju — kohereru.",
					"2000. — Par Krievijas prezidentu kļuva Vladimirs Putins." };
			int random7 = ran.nextInt(maj7.length);
			System.out.println(maj7[random7]);

			break;
		case 8:
			String[] maj8 = { "1912. — dibināts uzņēmums Paramount Pictures.",
					"1945. — Otrais pasaules karš: beidzās karadarbība Eiropā, Vācijai pieņemot bezierunu kapitulāciju.",
					"1956. — lauzta Indonēzijas un Nīderlandes konstitucionālā savienība." };
			int random8 = ran.nextInt(maj8.length);
			System.out.println(maj8[random8]);

			break;
		case 9:
			String[] maj9 = { "1877. — Rumānija pasludināja neatkarību no Osmaņu impērijas.",
					"1936. — Benito Musolīni paziņoja par Etiopijas pievienošanu Itālijai.",
					"1926. — pēc islāmistu sektas nemieriem Francijas flote bombardēja Damasku." };
			int random9 = ran.nextInt(maj9.length);
			System.out.println(maj9[random9]);

			break;
		case 10:
			String[] maj10 = {
					"1924. — Edgars Hūvers tika apstiprināts par ASV Federālā izmeklēšanas biroja direktoru un palika šajā amatā līdz pat savai nāvei 1972. gadā.",
					"1967. — PSRS pārtrauca diplomātiskās attiecības ar Izraēlu.",
					"1994. — par pirmo melnādaino Dienvidāfrikas Republikas prezidentu kļuva Nelsons Mandela." };
			int random10 = ran.nextInt(maj10.length);
			System.out.println(maj10[random10]);

			break;
		case 11:
			String[] maj11 = { "1858. — Minesota kļuva par 32. ASV štatu.",
					"1502. — Kristofors Kolumbs devās savā ceturtajā un pēdējā ceļojumā un Rietumindiju.",
					"1949. — Siāma oficiāli nomainīja nosaukumu uz Taizemi, kas ticis lietots kopš 1939. gada." };
			int random11 = ran.nextInt(maj11.length);
			System.out.println(maj11[random11]);

			break;
		case 12:
			String[] maj12 = { "1786. — Teherāna kļuva par Irānas galvaspilsētu.",
					"1941. — Konrāds Cūze Berlīnē prezentēja Z3, pasaulē pirmo darbojošos programmējamu, pilnībā automātisku datoru.",
					"1997. — noslēgts Krievijas un Čečenijas miera līgums." };
			int random12 = ran.nextInt(maj12.length);
			System.out.println(maj12[random12]);

			break;
		case 13:
			String[] maj13 = { "1848. — pirmoreiz atskaņota Somijas valsts himna.",
					"1909. — tika dots starts pirmajām Giro d'Italia sacensībām.",
					"1950. — Apvienotajā Karalistē (Silverstonas trasē) sākās pirmais Formula 1 čempionāts." };
			int random13 = ran.nextInt(maj13.length);
			System.out.println(maj13[random13]);

			break;
		case 14:
			String[] maj14 = { "1702. — Lielais Ziemeļu karš: zviedru karaspēks ieņēma Varšavu.",
					"1811. — Paragvaja ieguva neatkarību no Spānijas.",
					"1955. — PSRS un vēl septiņas komunistiskā bloka valstis dibināja Varšavas līguma organizāciju, atbildot uz NATO izveidi." };
			int random14 = ran.nextInt(maj14.length);
			System.out.println(maj14[random14]);

			break;
		case 15:
			String[] maj15 = { "1919. — Grieķija ieņēma Turcijas pilsētu Izmiru.",
					"1935. — Maskavas metro atklāts publikai.", "1958. — PSRS palaists pavadonis Sputņik-3." };
			int random15 = ran.nextInt(maj15.length);
			System.out.println(maj15[random15]);

			break;
		case 16:
			String[] maj16 = { "1908. — Parīzē dibināta Starptautiskā Hokeja federācija.",
					"1929. — Holivudā, ASV notika pirmā Kinoakadēmijas balvas pasniegšanas ceremonija.",
					"1916. — noslēgta slepenā Sikes-Piko vienošanās par Osmaņu impērijas teritorijas sadalīšanu ietekmes sfērās starp Lielbritāniju, Franciju un Krieviju." };
			int random16 = ran.nextInt(maj16.length);
			System.out.println(maj16[random16]);

			break;
		case 17:
			String[] maj17 = { "1587. — par Kurzemes hercogiem kļuva brāļi Frīdrihs un Vilhelms Ketleri",
					"1756. — formāli sākās Septiņgadu karš, kad Lielbritānijas Karaliste pieteica karu Francijai.",
					"1983. — Libāna, Izraēla un ASV parakstīja līgumu par Izraēlas spēku izvākšanu no Libānas." };
			int random17 = ran.nextInt(maj17.length);
			System.out.println(maj17[random17]);

			break;
		case 18:
			String[] maj18 = { "1804. — Francijas senāts proklamēja Napoleonu par imperatoru.",
					"1944. — krimas tatāri tika deportēti no Krimas uz Vidusāziju.",
					"1998. — ASV Tieslietu departaments un 20 štati iesniedza prasību tiesā pret Microsoft par monopola stāvokļa izmantošanu." };
			int random18 = ran.nextInt(maj18.length);
			System.out.println(maj18[random18]);

			break;
		case 19:
			String[] maj19 = { "1568. — karaliene Elizabete I pavēlēja arestēt Skotijas karalieni Mariju I.",
					"1971. — PSRS palaista Marsa zonde Mars-2.",
					"1991. — horvāti nobalsoja par neatkarību no Dienvidslāvijas." };
			int random19 = ran.nextInt(maj19.length);
			System.out.println(maj19[random19]);

			break;
		case 20:
			String[] maj20 = { "1498. — Portugāļu jūrasbraucējs Vasko da Gama sasniedza Indijas okeānu.",
					"1882. — izveidota Trejsavienība starp Vāciju, Austroungāriju un Itāliju.",
					"2002. — Austrumtimora iegūst neatkarību no Portugāles un Indonēzijas." };
			int random20 = ran.nextInt(maj20.length);
			System.out.println(maj20[random20]);

			break;
		case 21:
			String[] maj21 = { "1721. — zibens iespēra Rīgas Sv. Pētera baznīcas tornī, un tas nodega.",
					"1840. — Jaunzēlande tika pasludināta par britu koloniju.",
					"2006. — Melnkalnē notika referendums, kurā iedzīvotaji atbalstīja atdalīšanos no Serbijas un Melnkalnes valsts." };
			int random21 = ran.nextInt(maj21.length);
			System.out.println(maj21[random21]);

			break;
		case 22:
			String[] maj22 = { "1906. — brāļi Raiti patentēja savu pirmo lidaparātu.",
					"1990. — Microsoft izlaida operētājsistēmu Windows 3.0.",
					"1960. — 9,5 ballu stipra Lielā Čīles zemestrīce satricināja Čīles dienvidus." };
			int random22 = ran.nextInt(maj22.length);
			System.out.println(maj22[random22]);

			break;
		case 23:
			String[] maj23 = { "1568. — Nīderlande pasludināja neatkarību no Spānijas.",
					"1958. — pirmais ASV pavadonis Explorer 1 beidza aktīvo darbību.",
					"1949. — dibināta Vācijas Federatīvā Republika un pieņemts pašreizējais Vācijas karogs un ģerbonis." };
			int random23 = ran.nextInt(maj23.length);
			System.out.println(maj23[random23]);

			break;
		case 24:
			String[] maj24 = { "1940. — Igors Sikorskis veica pirmo sekmīgo helikoptera lidojumu.",
					"1962. — Mercury projekts: ASV palaists kosmosa kuģis Mercury 7 ar astronautu Skotu Karpenteru.",
					"1993. — Eritreja pasludināja neatkarību no Etiopijas." };
			int random24 = ran.nextInt(maj24.length);
			System.out.println(maj24[random24]);

			break;
		case 25:
			String[] maj25 = { "2008. — uz Marsa virsmas nolaidās NASA kosmiskais aparāts Phoenix. ",
					"2000. — Izraēla izveda savus spēkus no Libānas dienvidiem pēc 22 gadu okupācijas.",
					"1977. — izlaista filma \"Zvaigžņu kari\", kas drīzumā kļuva par rekordisti kases ieņēmumos." };
			int random25 = ran.nextInt(maj25.length);
			System.out.println(maj25[random25]);

			break;
		case 26:
			String[] maj26 = { "1966. — Gajāna ieguva neatkarību no Apvienotās Karalistes.",
					"2001. — CIP atslepenoja 39. paragrāfu 1991. gada janvāra Līča kara ziņojumā par Irākas kodolprogrammu.",
					"2006. — 6,3 ballu stiprā zemestrīcē Javas salā gāja bojā 5700 cilvēku." };
			int random26 = ran.nextInt(maj26.length);
			System.out.println(maj26[random26]);

			break;
		case 27:
			String[] maj27 = { "1919. — Afganistāna kļuva par neatkarīgu valsti.",
					"1994. — krievu rakstnieks un disidents Aleksandrs Solžeņicins atgriezās dzimtenē pēc 20 trimdā pavadītiem gadiem.",
					"1996. — Pirmais Čečenijas karš: Krievijas prezidents Boriss Jeļcins tikās ar Čečenijas nemiernieku līderiem." };
			int random27 = ran.nextInt(maj27.length);
			System.out.println(maj27[random27]);

			break;
		case 28:
			String[] maj28 = { "1971. — PSRS palaista Marsa zonde Mars-3.",
					"2001. — Centrālāfrikas Republikā notika valsts apvērsuma mēģinājums.",
					"1918. — Armēnija un Azerbaidžāna pasludināja neatkarību." };
			int random28 = ran.nextInt(maj28.length);
			System.out.println(maj28[random28]);

			break;
		case 29:
			String[] maj29 = { "1946. — dibināta Minskas traktoru rūpnīca.",
					"1936. — Turcijā ar likumu noteikts Turcijas Republikas karogs un tā izgatavošanas un lietošanas noteikumi.",
					"1790. — Rodailenda kā pēdējā no sākotnējām ASV kolonijām ratificēja konstitūciju, kļūstot par 13. ASV štatu." };
			int random29 = ran.nextInt(maj29.length);
			System.out.println(maj29[random29]);

			break;
		case 30:
			String[] maj30 = { "1913. — beidzās Pirmais Balkānu karš.",
					"1998. — 6,6 ballu stipra zemestrīce Afganistānā, bojā gāja vairāk kā 5000 cilvēku.",
					"1987. — Indijā izveidots Goa štats." };
			int random30 = ran.nextInt(maj30.length);
			System.out.println(maj30[random30]);

			break;
		case 31:
			String[] maj31 = { "1911. — pabeigts okeāna lainera \"Titāniks\" korpuss.",
					"1962. — Izraēlā tika pakārts Ādolfs Eihmanis.",
					"1961. — Dienvidāfrika kļuva par republiku un izstājās no Nāciju Sadraudzības." };
			int random31 = ran.nextInt(maj31.length);
			System.out.println(maj31[random31]);

			break;

		default:
			System.out.print("Maijā šāda datuma nav");
			break;
		}
	}

}
