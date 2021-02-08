import java.util.Random;

public class July {
	Random ran = new Random();

	July(int date) {
		System.out.println();
		System.out.println(date+ ". " + "Jūlija notikums:");
		System.out.println();
		switch (date) {
		case 1:
			String[] jul1 = { "1921. — dibināta Ķīnas Komunistiskā partija.",
					"1957. — sākās Starptautiskais ģeofizikas gads.",
					"2002. — dibināta Starptautiskā krimināltiesa, kas ļautu personām ierosināt lietas genocīda, noziegumu pret cilvēci, kara noziegumu un agresijas gadījumos." };
			int random1 = ran.nextInt(jul1.length);
			System.out.println(jul1[random1]);

			break;
		case 2:
			String[] jul2 = { "1777. — Vērmonta kļuva par pirmo ASV štatu, kurā atcēla verdzību.",
					"1853. — Krievijas impērijas armija iebruka Osmaņu impērijā, sākot Krimas karu.",
					"1900. — Vācijā virs Bodenezera notika pirmais cepelīna lidojums." };
			int random2 = ran.nextInt(jul2.length);
			System.out.println(jul2[random2]);

			break;
		case 3:
			String[] jul3 = { "1608. — dibināta Kvebekas pilsēta Kanādā.",
					"1998. — Japānā palaista Marsa zonde Nozomi.",
					"1962. — Alžīrijas neatkarības karš beidzās, Francijas prezidentam Šarlam de Gollam pasludinot Alžīrijas neatkarību." };
			int random3 = ran.nextInt(jul3.length);
			System.out.println(jul3[random3]);

			break;
		case 4:
			String[] jul4 = { "1776. — Filadelfijā pieņemta ASV Neatkarības deklarācija.",
					"1810. — franči okupēja Amsterdamu.",
					"1941. — Vācijas okupētajā Latvijā nodedzināja Rīgas sinagogas, kas bija daļa no holokausta Latvijā." };
			int random4 = ran.nextInt(jul4.length);
			System.out.println(jul4[random4]);

			break;
		case 5:
			String[] jul5 = { "1811. — Venecuēla deklarēja neatkarību no Spānijas.",
					"1962. — Alžīrija ieguva neatkarību no Francijas.",
					"1996. — pirmais sekmīgi klonētais zīdītājs aita Dollija (attēlā) piedzima Rozlinas institūtā Skotijā." };
			int random5 = ran.nextInt(jul5.length);
			System.out.println(jul5[random5]);

			break;
		case 6:
			String[] jul6 = { "1253. — Mindaugs kronēts par Lietuvas karali.",
					"1785. — ASV ieviesta naudas vienība dolārs.",
					"1919. — Latvijas brīvības cīņas: Rīgā ienāca Ziemeļlatvijas brigāde Jorģa Zemitāna vadībā." };
			int random6 = ran.nextInt(jul6.length);
			System.out.println(jul6[random6]);

			break;
		case 7:
			String[] jul7 = { "1941. — ASV okupēja Īslandi, lai ierīkotu atbalsta punktu cīņai pret Vāciju.",
					"2003. — ASV palaists otrs Marsa visurgājējs Opportunity.",
					"2005. — Londonā notika četri bumbu sprādzieni (3 metro un 1 autobusā), nogalinot 56 cilvēkus un vairāk par 700 ievainojot." };
			int random7 = ran.nextInt(jul7.length);
			System.out.println(jul7[random7]);

			break;
		case 8:
			String[] jul8 = { "1997. — NATO uzaicināja Čehiju, Poliju un Ungāriju pievienoties aliansei 1999. gadā.",
					"1994. — pēc Kima Irsena nāves viņa dēls Kims Čenirs kļuva par Ziemeļkorejas augstāko vadītāju.",
					"1919. — Kārļa Ulmaņa vadītā Latvijas Pagaidu valdība ar kuģi Saratov atgriezās Rīgā." };
			int random8 = ran.nextInt(jul8.length);
			System.out.println(jul8[random8]);

			break;
		case 9:
			String[] jul9 = { "2002. — dibināja Āfrikas Savienību.",
					"1877. — sākās pirmais Vimbldonas čempionāts tenisā.",
					"1850. — pēc Zekerija Teilora nāves par ASV prezidentu kļuva Milards Filmors. " };
			int random9 = ran.nextInt(jul9.length);
			System.out.println(jul9[random9]);

			break;
		case 10:
			String[] jul10 = { "1988. — Arkādijas parkā, Rīgā, lika pamatus Latvijas Nacionālās neatkarības kustībai.",
					"1986. — Liepājā nodibināja Latvijas cilvēktiesību aizsardzības grupu Helsinki-86.",
					"1940. — Otrais pasaules karš: izveidoja Višī Francijas valdību." };
			int random10 = ran.nextInt(jul10.length);
			System.out.println(jul10[random10]);

			break;
		case 11:
			String[] jul11 = { "1776. — kapteinis Džeimss Kuks uzsāka trešo (pēdējo) ceļojumu.",
					"1955. — frāze \"Mēs paļaujamies uz Dievu\" (In God We Trust) iekļauta visās ASV naudas vienībās.",
					"1995. — Bosnijas karā Serbu Republikas kaujinieki ieņēma Srebrenicu, kad ANO miera nodrošinātāji to atstāja; Srebrenicas slaktiņā serbi nogalināja vairāk nekā 8000 musulmaņu vīriešu un zēnu." };
			int random11 = ran.nextInt(jul11.length);
			System.out.println(jul11[random11]);

			break;
		case 12:
			String[] jul12 = { "1312. — par Ungārijas karali kļuva Kārols I Anžū.",
					"1979. — Kiribati ieguva neatkarību no Apvienotās Karalistes.",
					"1920. — Maskavā noslēgts Padomju Krievijas—Lietuvas miera līgums." };
			int random12 = ran.nextInt(jul12.length);
			System.out.println(jul12[random12]);

			break;
		case 13:
			String[] jul13 = {
					"1995. — notika Live Aid labdarības koncerts, lai vāktu līdzekļus, ar kuriem cīnīties pret badu Etiopijā.",
					"1908. — pirmoreiz olimpiskajās spēlēs piedalījās sievietes.",
					"1821. — pieņēma pašreizējo Norvēģijas karogu." };
			int random13 = ran.nextInt(jul13.length);
			System.out.println(jul13[random13]);

			break;
		case 14:
			String[] jul14 = { "1985. — Šengenā, Luksemburgā, parakstīja Šengenas vienošanos.",
					"1789. — Franču revolūcija: tauta ieņēma valsts cietumu Bastīliju.",
					"1700. — Krievu-turku karš: parakstīts Konstantinopoles līgums starp Krievijas impēriju un Osmaņu impēriju." };
			int random14 = ran.nextInt(jul14.length);
			System.out.println(jul14[random14]);

			break;
		case 15:
			String[] jul15 = { "1099. — Pirmais Krusta karš: krustneši ieņēma Jeruzalemi.",
					"1799. — Ēģiptē atrasts Rozetas akmens.",
					"1959. — notika tērauda lietuvju strādnieku streiks ASV." };
			int random15 = ran.nextInt(jul15.length);
			System.out.println(jul15[random15]);

			break;
		case 16:
			String[] jul16 = { "1705. — Lielais Ziemeļu karš: Mūrmuižas kaujā zviedri sakāva Krievijas karaspēku.",
					"1769. — dibināja Sandjego, ASV.", "1921. — Satversmes sapulce apstiprināja Latvijas ģerboni." };
			int random16 = ran.nextInt(jul16.length);
			System.out.println(jul16[random16]);

			break;
		case 17:
			String[] jul17 = { "1936. — Spānijā sākās pilsoņu karš.",
					"1962. — lidmašīna X-15, kuru pilotēja Roberts Vaits, pirmoreiz pārsniedza 50 km augstumu, kas ASV ir pieņemta par kosmosa robežu.",
					"2014. — Ukrainā virs separātistu kontrolētās teritorijas ar raķeti notriekta Malaysia Airlines lidmašīna reisā 17, bojā iet 298 cilvēki." };
			int random17 = ran.nextInt(jul17.length);
			System.out.println(jul17[random17]);

			break;
		case 18:
			String[] jul18 = { "1968. — dibināta kompānija Intel Corporation.",
					"1965. — PSRS palaista starpplanētu zonde Zond-3.",
					"1955. — apmeklētājiem tiek atvērta Disnejlenda Anahaimā, Kalifornijā." };
			int random18 = ran.nextInt(jul18.length);
			System.out.println(jul18[random18]);

			break;
		case 19:
			String[] jul19 = { "1900. — Parīzē atklāja pirmo metro līniju.",
					"1903. — Moriss Garēns uzvarēja pirmajā Tour de France velobraucienā.",
					"1903. — Moriss Garēns uzvarēja pirmajā Tour de France velobraucienā." };
			int random19 = ran.nextInt(jul19.length);
			System.out.println(jul19[random19]);

			break;
		case 20:
			String[] jul20 = { "1871. — Britu Kolumbija pievienojās Kanādas konfederācijai.",
					"1969. — Apollo programma: Apollo 11 veica pirmo pilotējamo nolaišanos uz Mēness (20:17 UTC).",
					"1960. — Rīgā atklāja jauno dzelzceļa staciju." };
			int random20 = ran.nextInt(jul20.length);
			System.out.println(jul20[random20]);

			break;
		case 21:
			String[] jul21 = { "1831. — Beļģija ieguva neatkarību no Nīderlandes.",
					"1973. — PSRS palaida Marsa zondi Mars-4.",
					"1954. — Ženēvas konferencē Vjetnamu sadalīja Ziemeļvjetnamā un Dienvidvjetnamā." };
			int random21 = ran.nextInt(jul21.length);
			System.out.println(jul21[random21]);

			break;
		case 22:
			String[] jul22 = {
					"2011. — Norvēģijā Annešs Bērings Breivīks uzbrukumā civiliedzīvotājiem nogalināja 77 cilvēkus.",
					"1962. — Mariner programma: Venēras zondi Mariner 1 iznīcināja drīz pēc starta nesējraķetes avārijas dēļ.",
					"1298. — Skotijas neatkarības kari: Folkērkas kaujā angļu spēki Edvarda I vadībā uzveica skotus Viljama Vollesa vadībā." };
			int random22 = ran.nextInt(jul22.length);
			System.out.println(jul22[random22]);

			break;
		case 23:
			String[] jul23 = { "1992. — Abhāzija pasludināja neatkarību no Gruzijas.",
					"1962. — veica pasaulē pirmo televīzijas signāla retranslāciju caur pavadoni (Telstar).",
					"1914. — Pirmā pasaules kara sākums: Austroungārija izvirzīja ultimātu Serbijai, pieprasot ļaut atrast kroņprinča Franča Ferdinanda slepkavu." };
			int random23 = ran.nextInt(jul23.length);
			System.out.println(jul23[random23]);

			break;
		case 24:
			String[] jul24 = { "1985. — Commodore izlaida personālo datoru Amiga.",
					"1923. — Šveicē noslēdza Lozannas miera līgumu, kas noteica jaunu Anatolijas teritoriju sadalīšanu un izbeidza Turcijas neatkarības karu.",
					"1198. — kaujā pret līviem pie Rīgas kalna krita Ikšķiles bīskaps Bertolds." };
			int random24 = ran.nextInt(jul24.length);
			System.out.println(jul24[random24]);

			break;
		case 25:
			String[] jul25 = { "1567. — dibināja Venecuēlas galvaspilsētu Karakasu.",
					"1907. — Koreja kļuva par Japānas protektorātu.",
					"1946. — ASV veica atombumbas zemūdens sprādzienu Bikini atolā." };
			int random25 = ran.nextInt(jul25.length);
			System.out.println(jul25[random25]);

			break;
		case 26:
			String[] jul26 = { "1847. — Libērija pasludināja neatkarību no ASV.",
					"1956. — Ēģiptes prezidents Gamāls Abdels Nāsers pasludināja Suecas kanāla nacionalizāciju.",
					"1960. — Malagasu Republika ieguva pilnu neatkarību no Francijas." };
			int random26 = ran.nextInt(jul26.length);
			System.out.println(jul26[random26]);

			break;
		case 27:
			String[] jul27 = { "1953. — beidzās Korejas karš, ASV, Ziemeļkorejai un Ķīnai noslēdzot pamieru.",
					"1955. — Austrija ieguva neatkarību no Sabiedrotajiem pēc Otrā pasaules kara.",
					"1990. — Baltkrievija pasludināja neatkarību no PSRS." };
			int random27 = ran.nextInt(jul27.length);
			System.out.println(jul27[random27]);

			break;
		case 28:
			String[] jul28 = { "1821. — Peru deklarēja neatkarību no Spānijas.", "1896. — dibināta Maiami.",
					"1957. — Maskavā sākās 6. Pasaules studentu un jaunatnes festivāls, pirmoreiz plašāk atverot PSRS ārvalstniekiem." };
			int random28 = ran.nextInt(jul28.length);
			System.out.println(jul28[random28]);

			break;
		case 29:
			String[] jul29 = { "1957. — dibināta Starptautiskā Atomenerģijas aģentūra.",
					"1958. — ASV prezidents Dvaits Eizenhauers parakstīja \"Nacionālo aeronautikas un kosmosa aktu\", kas bija par pamatu NASA dibināšanai.",
					"1921. — Ādolfs Hitlers kļuva par Nacionālsociālistiskās vācu strādnieku partijas vadītāju." };
			int random29 = ran.nextInt(jul29.length);
			System.out.println(jul29[random29]);
			break;
		case 30:
			String[] jul30 = { "1629. — zemestrīcē Itālijas pilsētā Neapolē gāja bojā aptuveni 10 000 cilvēku.",
					"1729. — dibināta Baltimoras pilsēta Mērilendas štatā, ASV.",
					"1980. — Vanuatu ieguva neatkarību no Apvienotās Karalistes un Francijas." };
			int random30 = ran.nextInt(jul30.length);
			System.out.println(jul30[random30]);

			break;
		case 31:
			String[] jul31 = { "1914. — Pirmais pasaules karš: Krievijā uzsākta mobilizācija, vēl neesot karastāvoklī.",
					"1932. — Vācijas parlamenta vēlēšanās NSDAP uzvarēja ar 38% balsu.",
					"1991. — PSRS OMON grupa uzbruka Lietuvas muitas punktam Medininkos, nogalinot 7 muitniekus." };
			int random31 = ran.nextInt(jul31.length);
			System.out.println(jul31[random31]);

			break;

		default:
			System.out.print("Jūlijā šāda datuma nav");
			break;
		}
	}

}
