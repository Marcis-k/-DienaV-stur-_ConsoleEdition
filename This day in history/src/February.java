import java.util.Random;

public class February {
	Random ran = new Random();
	

	February(int date) {
		System.out.println();
		System.out.println(date+ ". " + "Februāra notikums:");
		System.out.println();
		
		switch (date) {
		case 1:
			String[] feb1 = { "1861. — Amerikas pilsoņu karš: Teksasa atdalījās no ASV.",
					"1959. — pēc referenduma Šveicē tika pieņemts lēmums atļaut sievietēm balsot.",
					"1958. (pēc vietējā laika 31. janvārī) — palaists pirmais ASV Zemes mākslīgais pavadonis Explorer 1." };
			int random1 = ran.nextInt(feb1.length);
			System.out.println(feb1[random1]);
			break;
		case 2:
			String[] feb2 = { "1933. — Ādolfs Hitlers atlaida Vācijas parlamentu.",
					"1946. — proklamēta Ungārijas republika.",
					"2008. — nemiernieki uzbruka Čadas galvaspilsētai Ndžamenai, bet tika padzīti no tās." };
			int random2 = ran.nextInt(feb2.length);
			System.out.println(feb2[random2]);

			break;
		case 3:
			String[] feb3 = { "1919. — Padomju Krievija okupēja Ukrainu.",
					"1943. — Otrais pasaules karš: PSRS piekrita pievienoties karadarbībai Klusajā okeānā pret Japānu.",
					"1966. — PSRS zonde Luna-9 pirmoreiz vēsturē veica nosēšanos uz Mēness virsmas, kā arī pārraidīja pirmos fotoattēlus." };
			int random3 = ran.nextInt(feb3.length);
			System.out.println(feb3[random3]);
			break;
		case 4:
			String[] feb4 = { "1789. — Džordžs Vašingtons tika ievēlēts par pirmo ASV prezidentu.",
					"1794. — Francijā tika atcelta verdzība.",
					"2003. — Dienvidslāvijas parlaments pieņēma jaunu konstitūciju par jaunas valsts Serbijas un Melnkalnes dibināšanu Dienvidslāvijas atlikušo republiku vietā." };
			int random4 = ran.nextInt(feb4.length);
			System.out.println(feb4[random4]);
			break;
		case 5:
			String[] feb5 = { "881. — Fīniksai, ASV piešķirtas pilsētas tiesības.",
					"1900. — ASV un Apvienotā Karaliste noslēdza līgumu par Panamas kanālu.",
					"1917. — Meksikā pieņemta jauna konstitūcija, izveidojot federatīvo republiku." };
			int random5 = ran.nextInt(feb5.length);
			System.out.println(feb5[random5]);

			break;
		case 6:
			String[] feb6 = {
					"1457. — Rīgas arhibīskaps Silvestrs Stodevešers piešķīra Silvestra žēlastību vasaļiem Livonijā.",
					"1922. — par Romas pāvestu kļuva Pijs XI.",
					"2000. — Tarja Halonena tika ievēlēta par pirmo Somijas prezidenti sievieti." };
			int random6 = ran.nextInt(feb6.length);
			System.out.println(feb6[random6]);

			break;
		case 7:
			String[] feb7 = { "1962. — ASV aizliedza importu un eksportu uz Kubu.",
					"1974. — Grenāda ieguva neatkarību no Apvienotās Karalistes.",
					"1983. — Irāna veica iebrukumu Irākas dienvidaustrumos." };
			int random7 = ran.nextInt(feb7.length);
			System.out.println(feb7[random7]);

			break;
		case 8:
			String[] feb8 = {
					"1904. — negaidīts japāņu torpēdu uzbrukums Portartūrai Ķīnā izprovocēja krievu—japāņu karu.",
					"1924. — ASV Nevadas štatā pirmoreiz valsts vēsturē tika izpildīts nāvessods, izmantojot indīgu gāzi.",
					"2006. — sākās krīze Austrumtimorā — 404 kareivji atstāja kazarmas." };
			int random8 = ran.nextInt(feb8.length);
			System.out.println(feb8[random8]);

			break;
		case 9:
			String[] feb9 = { "1900. — Dvaits Deiviss nodibināja Deivisa kausu tenisā.",
					"1918. — Ukrainas Tautas Republika Brestā parakstīja miera līgumu ar Vācijas impēriju.",
					"2008. — Rīgā ielikts Z-Towers pamatakmens." };
			int random9 = ran.nextInt(feb9.length);
			System.out.println(feb9[random9]);

			break;
		case 10:
			String[] feb10 = { "1861. — Florida pievienojās Amerikas Valstu Konfederācijai.",
					"1931. — Ņūdeli kļuva par Indijas galvaspilsētu.",
					"1996. — superdators Deep Blue pirmoreiz uzvarēja pasaules šaha čempionu Gariju Kasparovu." };
			int random10 = ran.nextInt(feb10.length);
			System.out.println(feb10[random10]);

			break;
		case 11:
			String[] feb11 = {
					"1700. — sākās Lielais Ziemeļu karš, Saksijas karaspēkam iebrūkot zviedru pārvaldītajā Vidzemē.",
					"1873. — Spānijas karalis Amadeo I atteicās no troņa, un Spāniju pasludināja par republiku.",
					"1943. — ģenerālis Dvaits Eizenhauers tika tika izvēlēts par Sabiedroto armiju komandieri Eiropā." };
			int random11 = ran.nextInt(feb11.length);
			System.out.println(feb11[random11]);

			break;
		case 12:
			String[] feb12 = { "1818. — Čīle ieguva neatkarību no Spānijas.",
					"1908. — sākās pirmās autosacīkstes apkārt zemeslodei no Ņujorkas uz Parīzi.",
					"1950. — dibināta Eiropas Raidorganizāciju apvienība." };
			int random12 = ran.nextInt(feb12.length);
			System.out.println(feb12[random12]);

			break;
		case 13:
			String[] feb13 = { "1668. — Spānija atzina Portugāli kā neatkarīgu valsti.",
					"1880. — Tomass Edisons atklāja termoelektronu emisijas efektu.",
					"1960. — Francija pirmo reizi izmēģināja atombumbu Sahāras tuksnesī." };
			int random13 = ran.nextInt(feb13.length);
			System.out.println(feb13[random13]);

			break;
		case 14:
			String[] feb14 = {
					"1009. — Lietuvas nosaukums pirmoreiz minēts vēstures avotos (Kvedlinburgas klostera annālēs).",
					"1949. — pirmoreiz tika sasaukts Knesets (Izraēlas parlaments).",
					"1998. — palaisti pirmie 4 globālās mobilo sakaru pavadoņu sistēmas Globalstar pavadoņi." };
			int random14 = ran.nextInt(feb14.length);
			System.out.println(feb14[random14]);

			break;
		case 15:
			String[] feb15 = { "1794. — pieņemts pašreizējais Francijas karogs.",
					"1903. — ASV tirgū parādījās rotaļlieta plīša lācis (teddy bear).",
					"1989. — Afganistānu atstāja PSRS karaspēks." };
			int random15 = ran.nextInt(feb15.length);
			System.out.println(feb15[random15]);

			break;
		case 16:
			String[] feb16 = { "1918. — Lietuva pasludināja neatkarību no Krievijas.",
					"1985. — dibināta Hezbollah organizācija.",
					"2005. — stājās spēkā Kioto protokols, bet bez ASV un Austrālijas piedalīšanās." };
			int random16 = ran.nextInt(feb16.length);
			System.out.println(feb16[random16]);

			break;
		case 17:
			String[] feb17 = { "1867. — pirmais kuģis izbrauca Suecas kanālu.",
					"2000. — Microsoft izlaida operētājsistēmu Windows 2000.",
					"2003. — daļā Londonas tika ieviesta satiksmes nodeva." };
			int random17 = ran.nextInt(feb17.length);
			System.out.println(feb17[random17]);

			break;
		case 18:
			String[] feb18 = { "1954. — Losandželosā, ASV tika atvērta pirmā scientoloģijas baznīca.",
					"1977. — Space Shuttle Enterprise veica pirmo izmēģinājuma lidojumu uz Boeing 747 muguras.",
					"2012. — Latvijā notika tautas nobalsošana par Satversmes grozījumiem, kas paredzētu valsts valodas statusa piešķiršanu krievu valodai." };
			int random18 = ran.nextInt(feb18.length);
			System.out.println(feb18[random18]);

			break;
		case 19:
			String[] feb19 = { "1881. — Kanzasā kā pirmajā ASV štatā tika aizliegti alkoholiskie dzērieni.",
					"1915. — Pirmais pasaules karš: sākās Galipoli operācija.",
					"2008. — Kubas prezidents Fidels Kastro paziņoja par aiziešanu no amata." };
			int random19 = ran.nextInt(feb19.length);
			System.out.println(feb19[random19]);

			break;
		case 20:
			String[] feb20 = { "1878. — par pāvestu kļuva Leons XIII.",
					"1907. — Sanktpēterburgā uz pirmo sēdi sanāca Krievijas Valsts Domes otrais sasaukums.",
					"1965. — Ranger 8 ietriecās Mēness virsmā pēc veiksmīgi nofotografētām iespējamām Apollo nolaišanās vietām." };
			int random20 = ran.nextInt(feb20.length);
			System.out.println(feb20[random20]);

			break;
		case 21:
			String[] feb21 = {
					"1613. — Mihails Romanovs tika izvēlēts par caru, sākot Romanovu dinastijas valdīšanu Krievijas Impērijā.",
					"1960. — Kubā tika nacionalizēti visi uzņēmumi.",
					"1992. — ANO Drošības padome apstiprināja rezolūciju 743, lai sūtītu miera uzturēšanas spēkus uz Dienvidslāviju." };
			int random21 = ran.nextInt(feb21.length);
			System.out.println(feb21[random21]);
			break;
		case 22:
			String[] feb22 = {
					"1958. — Ēģiptes un Sīrijas prezidenti parakstīja abu valstu apvienošanas paktu, dibinot Apvienoto Arābu Republiku.",
					"1978. — ASV palaists pirmais eksperimentālais GPS pavadonis Navstar 1.",
					"1978. — Sentlūsija ieguva neatkarību no Apvienotās Karalistes." };
			int random22 = ran.nextInt(feb22.length);
			System.out.println(feb22[random22]);

			break;
		case 23:
			String[] feb23 = { "1947. — dibināta Starptautiskā standartizācijas organizācija (ISO).",
					"1966. — Sīrijā armijas virsnieki īstenoja valsts apvērsumu.",
					"1999. — orbitālajā stacijā Mir notika liels ugunsgrēks." };
			int random23 = ran.nextInt(feb23.length);
			System.out.println(feb23[random23]);

			break;
		case 24:
			String[] feb24 = { "1918. — Igaunija pasludināja neatkarību no Krievijas.",
					"1920. — Ādolfs Hitlers Minhenē prezentēja nacionālsociālistu jauno programmu.",
					"1965. — Montevideo Mossad aģenti nogalināja Herbertu Cukuru." };
			int random24 = ran.nextInt(feb24.length);
			System.out.println(feb24[random24]);

			break;
		case 25:
			String[] feb25 = { "1590. — Narvas tuvumā krievi un zviedri noslēdza pamieru uz vienu gadu.",
					"1921. — Padomju Krievija okupēja Gruziju.",
					"1992. — dibināta Krievijas kosmiskā aģentūra Roskosmos." };
			int random25 = ran.nextInt(feb25.length);
			System.out.println(feb25[random25]);

			break;
		case 26:
			String[] feb26 = { "1848. — proklamēta otrā Francijas Republika.",
					"1952. — Apvienotās Karalistes premjerministrs Vinstons Čērčils paziņoja, ka valstī izgatavota atombumba.",
					"2004. — Maķedonijas Republikas prezidents Boriss Trajkovskis gāja bojā lidmašīnas katastrofā pie Mostaras, Bosnijā un Hercegovinā." };
			int random26 = ran.nextInt(feb26.length);
			System.out.println(feb26[random26]);

			break;
		case 27:
			String[] feb27 = {
					"1900. — Lielbritānijā nodibināta Leiboristu partija, par tās sekretāru ievēlēja Ramzeju Makdonaldu.",
					"1942. — Andrejs Vlasovs publicēja Smoļenskas deklarāciju.",
					"1991. — ASV prezidents Džordžs H. V. Bušs paziņoja, ka Kuveita ir atbrīvota no Irākas karaspēka." };
			int random27 = ran.nextInt(feb27.length);
			System.out.println(feb27[random27]);

			break;
		case 28:
			String[] feb28 = { "1922. — Apvienotā Karaliste atzina Ēģiptes neatkarību.", "1991. — beidzās Līča karš.",
					"1998. — Serbijas policija sāka operāciju, lai iztīrītu Kosovu no \"teroristu bandām\"." };
			int random28 = ran.nextInt(feb28.length);
			System.out.println(feb28[random28]);

			break;
		case 29:
			String[] feb29 = { "1952. — Vācija atguva tiesības pār Helgolandes salu.",
					"1960. — zemestrīce gandrīz pilnībā iznīcināja Marokas pilsētu Agadiru, bojā gāja vairāk nekā 3000 cilvēku.",
					"2004. — Haiti prezidents Žans Bertrāns Aristīds atkāpās no amata un pameta valsti pēc plašajām demonstrācijām un nemieriem." };
			int random29 = ran.nextInt(feb29.length);
			System.out.println(feb29[random29]);

		default:
			System.out.print("Februārī šāda datuma nav");
			break;
		}
	}

}
