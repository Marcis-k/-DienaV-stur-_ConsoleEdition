import java.util.Random;

public class December {
	Random ran = new Random();

	December(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Decembra notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] dec1 = { "1918. — Latvijas brīvības cīņas: Padomju Krievija sāka iebrukumu Latvijā.",
					"1959. — noslēgts Antarktikas Līgums, saskaņā ar kuru Antarktiku aizliegts izmantot jebkādiem militāriem mērķiem.",
					"1774. — stājās spēkā tirdzniecības boikots starp Lielbritāniju un tās Ziemeļamerikas kolonijām." };
			int random1 = ran.nextInt(dec1.length);
			System.out.println(dec1[random1]);

			break;
		case 2:
			String[] dec2 = { "1409. — Leipcigā atklāta universitāte.",
					"1942. — ASV sāka darboties Enriko Fermi vadībā radītais pasaulē pirmais atomreaktors.",
					"1848. — Francis Jozefs I kļuva par Austrijas imperatoru." };
			int random2 = ran.nextInt(dec2.length);
			System.out.println(dec2[random2]);

			break;
		case 3:
			String[] dec3 = { "1818. — Ilinoisa iestājās ASV.", "1971. — sākās karš starp Indiju un Pakistānu.",
					"1994. — Sony izlaida spēļu konsoli PlayStation." };
			int random3 = ran.nextInt(dec3.length);
			System.out.println(dec3[random3]);

			break;
		case 4:
			String[] dec4 = { "1674. — franču jezuīti dibināja Čikāgu.",
					"1909. — tika nodibināts Monreālas \"Canadiens\" hokeja klubs.",
					"1980. — par savu izjukšanu paziņoja grupa Led Zeppelin." };
			int random4 = ran.nextInt(dec4.length);
			System.out.println(dec4[random4]);

			break;
		case 5:
			String[] dec5 = {
					"1934. — Turcijā sievietēm tika piešķirtas balsstiesības un tiesības tikt ievēlētām vispārējās parlamenta vēlēšanās.",
					"1969. — tika izveidots četru mezglu ARPANET tīkls.",
					"1978. — PSRS parakstīja \"sadraudzības līgumu\" ar Afganistānas Demokrātisko Republiku." };
			int random5 = ran.nextInt(dec5.length);
			System.out.println(dec5[random5]);

			break;
		case 6:
			String[] dec6 = { "1534. — dibināta Kito, Ekvadoras galvaspilsēta.",
					"1917. — Somija pasludināja neatkarību no Krievijas.",
					"1991. — Dienvidslāvijas armija bombardēja Dubrovniku Horvātijā." };
			int random6 = ran.nextInt(dec6.length);
			System.out.println(dec6[random6]);

			break;
		case 7:
			String[] dec7 = { "1787. — Delavēra ratificēja ASV konstitūciju kā pirmais štats.",
					"1995. — NASA zonde Galileo beidza misiju, ieejot Jupitera atmosfērā.",
					"1988. — Armēnijā notika 6,9 balles stipra zemestrīce, kurā gāja bojā vairāk nekā 25 tūkstoši cilvēku." };
			int random7 = ran.nextInt(dec7.length);
			System.out.println(dec7[random7]);

			break;
		case 8:
			String[] dec8 = { "1907. — pēc Oskara II nāves par Zviedrijas karali kļuva viņa dēls Gustavs V.",
					"1941. — Ķīnas Republika oficiāli pieteica karu Japānai.",
					"2005. — Ķīnā izbeidza izmantot tvaika lokomotīves maģistrālajās dzelzceļa līnijās." };
			int random8 = ran.nextInt(dec8.length);
			System.out.println(dec8[random8]);

			break;
		case 9:
			String[] dec9 = { "1917. — Pirmais pasaules karš: britu spēki ieņēma Jeruzalemi.",
					"1922. — Gabriels Narutovičs ievēlēts par pirmo Polijas prezidentu.",
					"1971. — Apvienotie Arābu Emirāti iestājās ANO." };
			int random9 = ran.nextInt(dec9.length);
			System.out.println(dec9[random9]);

			break;
		case 10:
			String[] dec10 = { "1997. — Kazahstānas galvaspilsēta pārcelta no Almati uz Astanu.",
					"1983. — Argentīnā atjaunota demokrātija pēc militāras pārvaldes.",
					"1948. — ANO Ģenerālā Asambleja pieņēma Vispārējo cilvēktiesību deklarāciju." };
			int random10 = ran.nextInt(dec10.length);
			System.out.println(dec10[random10]);

			break;
		case 11:
			String[] dec11 = { "1816. — Indiāna kļuva par ASV 19. štatu.",
					"2001. — Ķīna iestājās Pasaules Tirdzniecības organizācijā.", "1997. — pieņemts Kioto protokols." };
			int random11 = ran.nextInt(dec11.length);
			System.out.println(dec11[random11]);

			break;
		case 12:
			String[] dec12 = { "1787. — Pensilvānija kļuva par ASV otro štatu.",
					"2005. — ASV palaista Marsa zonde Mars Reconnaissance Orbiter ",
					"1979. — Rodēzija nomainīja nosaukumu uz Zimbabve." };
			int random12 = ran.nextInt(dec12.length);
			System.out.println(dec12[random12]);

			break;
		case 13:
			String[] dec13 = { "1642. — Ābels Tasmans sasniedza Jaunzēlandi.",
					"1577. — Frānsiss Dreiks uzsāka savu ceturto pasaules apceļošanu no Plimutas, Anglijā.",
					"2003. — ASV militārie spēki sagūstīja bijušo Irākas prezidentu Sadamu Huseinu." };
			int random13 = ran.nextInt(dec13.length);
			System.out.println(dec13[random13]);

			break;
		case 14:
			String[] dec14 = { "1819. — Alabama kļuva par 22. ASV štatu.", "1955. — Albānija pievienojās ANO.",
					"1989. — Čīlē pēc 16 gadu pārtraukuma notika brīvas vēlēšanas." };
			int random14 = ran.nextInt(dec14.length);
			System.out.println(dec14[random14]);

			break;
		case 15:
			String[] dec15 = { "1791. — stājās spēkā Amerikas Savienoto Valstu Tiesību bils.",
					"1978. — prezidents Džimijs Kārters paziņoja, ka ASV atzīs Ķīnas Tautas Republiku un saraus attiecības ar Taivānu.",
					"1976. — Samoa Neatkarīgā Valsts uzņemta ANO." };
			int random15 = ran.nextInt(dec15.length);
			System.out.println(dec15[random15]);

			break;
		case 16:
			String[] dec16 = { "1916. — Pirmais pasaules karš: beidzās Verdenas kauja.",
					"1991. — Kazahstāna deklarēja neatkarību no PSRS.",
					"1971. — beidzās karš starp Indiju un Pakistānu; Bangladeša ieguva neatkarību no Pakistānas." };
			int random16 = ran.nextInt(dec16.length);
			System.out.println(dec16[random16]);

			break;
		case 17:
			String[] dec17 = { "1834. — Īrijā tika atklāts pirmais dzelzceļš valstī.",
					"1947. — British Thomson-Houston patentēja hologrāfiju.",
					"1926. — Antana Smetonas vadībā veikts valsts apvērsums Lietuvā." };
			int random17 = ran.nextInt(dec17.length);
			System.out.println(dec17[random17]);

			break;
		case 18:
			String[] dec18 = { "1953. — uzsāktas krāsainās televīzijas pārraides NTSC standartā.",
					"1940. — apstiprināts \"Barbarosas\" plāns.",
					"1898. — Pēterpilī dibināta studentu korporācija Fraternitas Metropolitana." };
			int random18 = ran.nextInt(dec18.length);
			System.out.println(dec18[random18]);

			break;
		case 19:
			String[] dec19 = { "2012. — Paka Kinhje kļuva par pirmo sievieti Dienvidkorejas prezidenta amatā.",
					"1997. — iznāca filma \"Titāniks\".",
					"1986. — Mihails Gorbačovs izbeidza Andreja Saharova un viņa sievas Jeļenas Bonneres izsūtījumu trimdā Gorkijā." };
			int random19 = ran.nextInt(dec19.length);
			System.out.println(dec19[random19]);

			break;
		case 20:
			String[] dec20 = {
					"2000. — Lielbritānijas parlaments atļāva cilvēka klonēšanu, bet tikai medicīniskiem mērķiem.",
					"1999. — Makao no Portugāles nonāca Ķīnas pārvaldībā.",
					"1996. — kompānija NeXT apvienojās ar Apple Computer; sākta Mac OS X izstrāde." };
			int random20 = ran.nextInt(dec20.length);
			System.out.println(dec20[random20]);

			break;
		case 21:
			String[] dec21 = { "1898. — Marija Sklodovska-Kirī un Pjērs Kirī atklāja rādiju.",
					"2007. — Čehija, Igaunija, Ungārija, Latvija, Lietuva, Malta, Polija, Slovākija un Slovēnija parakstīja Šengenas līgumu.",
					"1991. — NVS iestājās Azerbaidžāna, Armēnija, Kazahstāna, Kirgizstāna, Moldova, Tadžikistāna, Turkmenistāna un Uzbekistāna." };
			int random21 = ran.nextInt(dec21.length);
			System.out.println(dec21[random21]);

			break;
		case 22:
			String[] dec22 = { "1894. — sākās Dreifusa lieta.",
					"2001. — Hāmids Karzajs kļuva par Afganistānas valdības vadītāju.",
					"2007. — Francijas nesējraķete Ariane 5 nogādāja orbītā pirmo Āfrikas mākslīgo Zemes pavadoni." };
			int random22 = ran.nextInt(dec22.length);
			System.out.println(dec22[random22]);

			break;
		case 23:
			String[] dec23 = { "1956. — Apvienotās Karalistes un Francijas spēki atstāja Suecas kanāla reģionu.",
					"1954. — ASV veikta pasaulē pirmā nieres transplantācija.",
					"1920. — Apvienotā Karaliste un Francija vienojās par tām piederošo teritoriju — Sīrijas un Palestīnas — robežu." };
			int random23 = ran.nextInt(dec23.length);
			System.out.println(dec23[random23]);

			break;
		case 24:
			String[] dec24 = { "1851. — ugunsgrēks Kongresa bibliotēkā iznīcināja ap 35 000 grāmatu.",
					"1924. — Albānija pasludināta par republiku.", "1951. — Lībija ieguva neatkarību no Itālijas." };
			int random24 = ran.nextInt(dec24.length);
			System.out.println(dec24[random24]);

			break;
		case 25:
			String[] dec25 = { "1643. — atklāta Ziemassvētku sala.",
					"2008. — ar nesējraķeti Proton-M nogādāti orbītā 3 GLONASS pavadoņi.",
					"1991. — Mihails Gorbačovs atkāpās no PSRS prezidenta amata." };
			int random25 = ran.nextInt(dec25.length);
			System.out.println(dec25[random25]);

			break;
		case 26:
			String[] dec26 = { "1933. — patentēts FM radio.",
					"2003. — 6,6 ballu spēcīga zemestrīce izpostīja Irānas dienvidaustrumus; dzīvību zaudēja vairāk nekā 40 000 cilvēku.",
					"2004. — netālu no Sumatras, Indonēzijā, notika 9,0 ballu stipra zemestrīce, kas izraisīja cunami, kurā dzīvību zaudēja vairāk nekā 200 000 cilvēku." };
			int random26 = ran.nextInt(dec26.length);
			System.out.println(dec26[random26]);

			break;
		case 27:
			String[] dec27 = { "1945. — Vašingtonā, ASV tika dibināts Starptautiskais Valūtas fonds.",
					"2004. — novērots līdz šim spēcīgākais kosmiskās radiācijas uzliesmojums, kas nāca no magnetāra SGR 1806-20.",
					"1831. — Čārlzs Darvins ar kuģi Beagle devās ceļojumā, kura laikā viņš formulēja evolūcijas teoriju." };
			int random27 = ran.nextInt(dec27.length);
			System.out.println(dec27[random27]);

			break;
		case 28:
			String[] dec28 = { "1836. — Spānija atzina Meksikas neatkarību.", "1846. — Aiova kļuva par ASV 29. štatu.",
					"2007. — Nepāla likvidēja monarhiju, pasludinot valsti par republiku." };
			int random28 = ran.nextInt(dec28.length);
			System.out.println(dec28[random28]);

			break;
		case 29:
			String[] dec29 = { "1845. — Teksasa kļuva par ASV 28. štatu.", "1911. — Mongolija ieguva neatkarību.",
					"1989. — Vāclavs Havels kļuva par Čehoslovākijas prezidentu." };
			int random29 = ran.nextInt(dec29.length);
			System.out.println(dec29[random29]);

			break;
		case 30:
			String[] dec30 = { "1922. — dibināta Padomju Sociālistisko Republiku Savienība.",
					"1993. — Izraēla un Vatikāns uzsāka diplomātiskās attiecības.",
					"2006. — bijušais Irākas prezidents Sadams Huseins tika sodīts ar nāvi pakarot." };
			int random30 = ran.nextInt(dec30.length);
			System.out.println(dec30[random30]);

			break;
		case 31:
			String[] dec31 = { "1963. — Centrālāfrikas Federācija sadalījās Zimbabvē, Malāvijā un Rodēzijā.",
					"1918. — Vācijas armija atstāja Viļņu, kas palika Polijas pārvaldībā.",
					"1991. — oficiāli beidza pastāvēt PSRS." };
			int random31 = ran.nextInt(dec31.length);
			System.out.println(dec31[random31]);

			break;

		default:
			System.out.print("Decembrī šāda datuma nav");
			break;
		}
	}

}
