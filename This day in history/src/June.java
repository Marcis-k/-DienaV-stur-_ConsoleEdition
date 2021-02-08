import java.util.Random;

public class June {
	Random ran = new Random();

	June(int date) {
		
		System.out.println();
		System.out.println(date+ ". " + "Jūnija notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] jun1 = { "1926. — dzimusi ASV aktrise Merilina Monro.",
					"1945. — britu spēki pārņēma kontroli pār Libānu un Sīriju.",
					"2005. — Nīderlandē referendumā tika noraidīta Eiropas Savienības konstitūcija." };
			int random1 = ran.nextInt(jun1.length);
			System.out.println(jun1[random1]);

			break;
		case 2:
			String[] jun2 = { "1896. — itāliešu izgudrotājs Guljelmo Markoni patentēja radio.",
					"1946. — Itālijā referendumā vēlētāji atbalstīja monarhijas likvidēšanu un republikas izveidi.",
					"1966. — Surveyor 1 kļuva par pirmo ASV aparātu, kas nolaidies uz Mēness virsmas." };
			int random2 = ran.nextInt(jun2.length);
			System.out.println(jun2[random2]);

			break;
		case 3:
			String[] jun3 = {
					"1808. — dzimis ASV politiķis, Amerikas Valstu Konfederācijas prezidents Džefersons Deiviss.",
					"1940. — Vācijas Luftwaffe bombardēja Parīzi.",
					"2006. — Melnkalne pasludināja neatkarību pēc 21. maijā notikušā referenduma." };
			int random3 = ran.nextInt(jun3.length);
			System.out.println(jun3[random3]);

			break;
		case 4:
			String[] jun4 = { "1133. — par Svētās Romas impērijas imperatoru kronēts Lotārs III Zuplinburgs.",
					"1940. — Otrais pasaules karš: vācu spēki iegāja Parīzē.",
					"1970. — Tonga ieguva neatkarību no Apvienotās Karalistes." };
			int random4 = ran.nextInt(jun4.length);
			System.out.println(jun4[random4]);

			break;
		case 5:
			String[] jun5 = { "1837. — Hjūstona, ASV, ieguva pilsētas tiesības.",
					"1848. — pieņemot jaunu konstitūciju, Dānija kļuva par konstitucionālu monarhiju.",
					"1950. — Rīgā tika nodibināts Rīgas Medicīnas institūts." };
			int random5 = ran.nextInt(jun5.length);
			System.out.println(jun5[random5]);

			break;
		case 6:
			String[] jun6 = { "1971. — PSRS palaists kosmosa kuģis Sojuz-11.",
					"1984. — tika izdota viena no visu laiku veiksmīgākajām datorspēlēm Tetris.",
					"2006. — islamisti pārņēma kontroli pār Somālijas galvaspilsētu Mogadīšo, tā beidzot militāristu valdīšanu pilsētā." };
			int random6 = ran.nextInt(jun6.length);
			System.out.println(jun6[random6]);

			break;
		case 7:
			String[] jun7 = { "1905. — Norvēģijas parlaments anulēja savienību ar Zviedriju.",
					"1942. — ASV uzvarēja Japānu Midveja kaujā.",
					"1967. — Sešu dienu karš: Izraēlas spēki iegāja Jeruzalemē." };
			int random7 = ran.nextInt(jun7.length);
			System.out.println(jun7[random7]);

			break;
		case 8:
			String[] jun8 = { "1861. — Amerikas pilsoņu karš: Tenesī izstājās no Savienības.",
					"1948. — Čeļabinskā-40 (tagad Ozjorska) iedarbināja pirmo PSRS rūpniecisko atomreaktoru.",
					"1988. — PSRS pieņēma likumu \"Par kooperāciju PSRS\", kas legalizēja privāto uzņēmējdarbību." };
			int random8 = ran.nextInt(jun8.length);
			System.out.println(jun8[random8]);

			break;
		case 9:
			String[] jun9 = { "1846. — Hamiltonai, Kanādā, Ontārio štatā piešķirtas pilsētas tiesības.",
					"1934. — Donalds Daks debitēja filmā The Wise Little Hen.",
					"1999. — Kosovas karš: Dienvidslāvija noslēdza miera līgumu ar NATO." };
			int random9 = ran.nextInt(jun9.length);
			System.out.println(jun9[random9]);

			break;
		case 10:
			String[] jun10 = { "1376. — Vāclavs IV kļuva par Vācijas karali (formāli par Romas karali).",
					"1967. — beidzās Sešu dienu karš: Izraēla un Sīrija piekrita uguns pārtraukšanai.",
					"2003. — palaists NASA Marsa visurgājējs Mars Exploration Rover Spirit." };
			int random10 = ran.nextInt(jun10.length);
			System.out.println(jun10[random10]);

			break;
		case 11:
			String[] jun11 = { "1903. — nogalināts Serbijas karalis Aleksandrs Obrenovičs.",
					"1964. — budistu mūks Thits Kuangs Diks pašaizdedzinājās Saigonā, protestējot pret reliģiskās brīvības trūkumu Dienvidvjetnamā.",
					"1999. — beidzās Kosovas karš." };
			int random11 = ran.nextInt(jun11.length);
			System.out.println(jun11[random11]);

			break;
		case 12:
			String[] jun12 = { "1901. — Kuba kļuva par ASV protektorātu.",
					"1934. — Bulgārijā aizliedza politiskās partijas.",
					"1898. — Filipīnas deklarēja neatkarību no Spānijas." };
			int random12 = ran.nextInt(jun12.length);
			System.out.println(jun12[random12]);

			break;
		case 13:
			String[] jun13 = { "1942. — Vācija pirmoreiz izmēģināja (neveiksmīgi) raķeti A4 (V-2).",
					"1955. — PSRS (Jakutijā) atrada pirmo dimantu atradni.",
					"1917. — Pirmais pasaules karš: Vācija veica pirmo lielāko Londonas bombardēšanu, 162 cilvēki gāja bojā, 432 ievainoti." };
			int random13 = ran.nextInt(jun13.length);
			System.out.println(jun13[random13]);

			break;
		case 14:
			String[] jun14 = { "1900. — Havajas kļuva par ASV teritoriju.",
					"1940. — Otrais Pasaules karš: Vācijas karaspēks ieņēma Parīzi.",
					"1941. — Igaunijā, Latvijā un Lietuvā tika veikta iedzīvotāju deportācija uz PSRS austrumu rajoniem." };
			int random14 = ran.nextInt(jun14.length);
			System.out.println(jun14[random14]);

			break;
		case 15:
			String[] jun15 = { "1808. — Žozefs I Napoleons kļuva par Spānijas karali.",
					"1954. — dibināta Eiropas futbola asociāciju savienība UEFA.",
					"1991. — Filipīnās izvirda Pinatubo; tas bija otrs lielākais 20. gadsimta vulkāna izvirdums, kurā bojā gāja vairāk kā 800 cilvēku." };
			int random15 = ran.nextInt(jun15.length);
			System.out.println(jun15[random15]);

			break;
		case 16:
			String[] jun16 = { "1779. — Spānija pasludināja karu pret Apvienoto Karalisti.",
					"1846. — par Romas pāvestu kļuva Pijs IX, kas bija visu laiku visilgāk valdījušais ievēlētais pāvests.",
					"1963. — PSRS kosmosa programmas Vostok 6 misijas laikā kosmonaute Valentīna Tereškova kļuva par pirmo sievieti kosmosā." };
			int random16 = ran.nextInt(jun16.length);
			System.out.println(jun16[random16]);

			break;
		case 17:
			String[] jun17 = {
					"1789. — Franču revolūcija: trešās kārtas pārstāvji pasludināja sevi par Nacionālo sapulci.",
					"1944. — Islande pasludināja neatkarību no Dānijas un kļuva par republiku.",
					"1999. — Vaira Vīķe-Freiberga tika ievēlēta par Latvijas Valsts prezidenti." };
			int random17 = ran.nextInt(jun17.length);
			System.out.println(jun17[random17]);

			break;
		case 18:
			String[] jun18 = { "1778. — ASV Neatkarības karš: Lielbritānijas kareivji pameta Filadelfiju.",
					"1953. — Ēģipte pasludināta par republiku.",
					"2009. — palaista NASA izpētes zonde Lunar Reconnaissance Orbiter (LRO)." };
			int random18 = ran.nextInt(jun18.length);
			System.out.println(jun18[random18]);

			break;
		case 19:
			String[] jun19 = { "1862. — ASV aizliegta verdzība.", "1925. — pieņemts pašreizējais Igaunijas ģerbonis.",
					"1961. — Kuveita deklarēja neatkarību no Apvienotās Karalistes." };
			int random19 = ran.nextInt(jun19.length);
			System.out.println(jun19[random19]);

			break;
		case 20:
			String[] jun20 = { "1840. — Semjuels Morze patentēja telegrāfu.",
					"1863. — Rietumvirdžīnija kļuva par 35. ASV štatu",
					"1993. — notika pirmais vilciena izmēģinājuma brauciens pa Lamanša tuneli." };
			int random20 = ran.nextInt(jun20.length);
			System.out.println(jun20[random20]);

			break;
		case 21:
			String[] jun21 = { "1788. — Ņūhempšīra kļuva par 9. ASV štatu.",
					"1945. — Otrais pasaules karš: noslēdzās Okinavas kauja.",
					"1934. — Turcijā atcēla Osmaņu impērijas titulus un goda vārdus, ieviešot uzvārdus." };
			int random21 = ran.nextInt(jun21.length);
			System.out.println(jun21[random21]);

			break;
		case 22:
			String[] jun22 = {
					"1919. — Latvijas brīvības cīņas: Igaunijas armija kopā ar Ziemeļlatvijas brigādi Cēsu kaujās sakāva vācu spēkus.",
					"1940. — Otrais pasaules karš: Francija Kompjēnā parakstīja kapitulāciju Vācijai.",
					"1957. — PSRS pirmoreiz palaida vidējās darbības rādiusa ballistisko raķeti R-12." };
			int random22 = ran.nextInt(jun22.length);
			System.out.println(jun22[random22]);

			break;
		case 23:
			String[] jun23 = {
					"1919. — Latvijas brīvības cīņas: Cēsu kaujas beidzās ar Igaunijas un Latvijas spēku uzvaru, ieņemot Cēsis.",
					"1990. — Moldova pasludināja neatkarību no Padomju Savienības.",
					"1941. — Lietuvas Aktīvistu Fronte pasludināja Lietuvas neatkarību no Padomju Savienības, ko pēc dažām nedēļām pārtrauca vācu okupācija." };
			int random23 = ran.nextInt(jun23.length);
			System.out.println(jun23[random23]);

			break;
		case 24:
			String[] jun24 = { "1793. — Francijā akceptēja pirmo republikānisko konstitūciju.",
					"1880. — pirmoreiz izpildīja dziesmu O Canada, kas vēlāk kļuva par Kanādas himnu.",
					"1983. — uz Zemes no kosmiskā lidojuma atgriezās pirmā amerikāniete kosmonaute Sallija Raida." };
			int random24 = ran.nextInt(jun24.length);
			System.out.println(jun24[random24]);

			break;
		case 25:
			String[] jun25 = { "1868. — Florida no jauna iestājās ASV.",
					"1947. — izdeva grāmatu \"Annas Frankas dienasgrāmata\".",
					"1993. — Lietuvā atjaunoja naudas vienību litu." };
			int random25 = ran.nextInt(jun25.length);
			System.out.println(jun25[random25]);

			break;
		case 26:
			String[] jun26 = {
					"1940. — saskaņā ar Molotova-Rībentropa paktu PSRS iesniedza ultimātu Rumānijai, kurā pieprasīja Besarābijas un Ziemeļbukovinas teritoriju atdošanu.",
					"1945. — parakstīja Apvienoto Nāciju Organizācijas Statūtus.",
					"1991. — Desmitdienu karš: Dienvidslāvijas armija atstāja kazarmas un devās uz Slovēniju." };
			int random26 = ran.nextInt(jun26.length);
			System.out.println(jun26[random26]);

			break;
		case 27:
			String[] jun27 = { "1954. — Obņinskā, PSRS, atklāja pasaulē pirmo atomelektrostaciju.",
					"1977. — Džibutija ieguva neatkarību no Francijas.",
					"1993. — Microsoft izlaida pirmo operētājsistēmas Windows NT versiju Windows NT 3.1." };
			int random27 = ran.nextInt(jun27.length);
			System.out.println(jun27[random27]);

			break;
		case 28:
			String[] jun28 = { "1635. — Gvadelupa kļuva par Francijas koloniju.",
					"1919. — Pirmais pasaules karš: Parīzē starp Sabiedrotajiem un Veimāras republiku (bijušo Vācijas impēriju) parakstīts Versaļas līgums.",
					"1950. — Korejas karš: Ziemeļkorejas karaspēks ieņēma Seulu." };
			int random28 = ran.nextInt(jun28.length);
			System.out.println(jun28[random28]);

			break;
		case 29:
			String[] jun29 = { "1880. — Francija anektēja Taiti.",
					"2006. — sievietes pirmoreiz piedalījās Kuveitas parlamenta vēlēšanās.",
					"1775. — atklāja Jelgavas akadēmisko ģimnāziju, vēlāko Academia Petrina." };
			int random29 = ran.nextInt(jun29.length);
			System.out.println(jun29[random29]);
			break;
		case 30:
			String[] jun30 = {
					"1934. — Garo nažu nakts: Vācijā Ādolfa Hitlera vadītā nacistu partija izrēķinājās ar politiskajiem pretiniekiem.",
					"1972. — pirmoreiz UTC laika sistēmai pievienoja vienu lieku sekundi, lai saskaņotu to ar Zemes rotācijas izmaiņām.",
					"1997. — Apvienotā Karaliste nodeva Honkongas pārvaldību Ķīnai." };
			int random30 = ran.nextInt(jun30.length);
			System.out.println(jun30[random30]);

			break;

		default:
			System.out.print("Jūnijā šāda datuma nav");
			break;
		}
	}

}
