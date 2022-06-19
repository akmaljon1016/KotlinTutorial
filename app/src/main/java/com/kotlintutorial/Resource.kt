package com.kotlintutorial

import com.kotlintutorial.app.model.Lesson
import com.kotlintutorial.model.VideoLesson

const val hello = "Hello World"
const val name = "Zara Ali"
const val age = "19"

class Resource {

    val lessons = arrayListOf<Lesson>(
        Lesson(
            "<b style=\"border:orange; border-width:5px; border-style:solid;\">Home</b>",
            "Ushbu <b>Kotlin qo'llanmasi<b> tajribali Kotlin dasturchilari tomonidan yangi boshlanuvchilar uchun Kotlin dasturlash tili asoslarini tushunishga yordam berish uchun tayyorlangan. Ushbu qo'llanmani tugatgandan so'ng, siz o'zingizni Kotlinda o'rtacha darajadagi tajribaga ega bo'lasiz, u erdan keyingi darajalarga o'tishingiz mumkin.<br><br><br>" +
                    "    Kotlin nima?<br>" +
                    "Kotlin — JetBrains tomonidan 2011-yilda taqdim etilgan dasturlash tili boʻlib, Intellij IDEA nomli eng aqlli Java IDE-ning rasmiy dizayneri. Kotlin bepul, ozod bo'lgan va ozod bo'lib qoladi. U Apache 2.0 litsenziyasi ostida ishlab chiqilgan va manba kodi GitHub da mavjud.<br><br>" +
                    "<br>Bu JVM da ishlaydigan kuchli statik tarzda yozilgan umumiy maqsadli dasturlash tili. 2017-yilda Google Kotlinni androidni ishlab chiqish uchun rasmiy til ekanligini eʼlon qildi. Kotlin ochiq kodli dasturlash tili bo'lib, u ob'ektga yo'naltirilgan dasturlash va funktsional xususiyatlarni noyob platformada birlashtiradi. Tarkib oddiy va foydali misollar bilan bog'liq mavzularni o'z ichiga olgan turli boblarga bo'lingan.<br><br><br>" +
                    "Kotlin - bu ishlab chiquvchilarni xursand qiladigan zamonaviy dasturlash tili. Kotlinni olish oson, shuning uchun siz darhol kuchli ilovalar yaratishingiz mumkin.<br><br>" +
                    "Hozirda Kotlin asosan Java Virtual Mashinasini (JVM) maqsad qilib qo'yadi, balki JavaScript-ni kompilyatsiya qiladi. Kotlinga Java, C#, JavaScript, Scala va Groovy kabi boshqa mashhur dasturlash tillari taʼsir koʻrsatadi. Kotlin sintaksisi Java dasturlash tiliga mutlaqo o'xshamasligi mumkin, ammo Kotlin dasturchilar uchun ajoyib natijalarga erishish uchun mavjud Java Class kutubxonasiga tayanadi. Kotlin butun dunyo bo'ylab ishlab chiquvchilar uchun birgalikda ishlash, kod xavfsizligi va ravshanlikni ta'minlaydi.<br><br><br>" +
                    " Kotlin Jobs<br><br>" +
                    "Kotlinga talab juda yuqori va barcha yirik kompaniyalar o'zlarining veb va mobil ilovalarini ishlab chiqish uchun Kotlin tomon harakat qilmoqdalar.<br><br>" +
                    "Kotlin dasturchisi uchun o'rtacha yillik ish haqi taxminan 130 000 dollarni tashkil qiladi. Garchi bu joylashuvga qarab farq qilishi mumkin. Quyida Kotlindan foydalanadigan yirik kompaniyalar:<br><br><br>" +
                    "Google<br><br>" +
                    "Amazon<br><br>" +
                    "Netflix<br><br>" +
                    "Pinterest<br><br>" +
                    "Uber<br><br>" +
                    "Trello<br><br>" +
                    "Kursera<br><br>" +
                    "Asosiy kamar<br><br>" +
                    "Korda<br><br>" +
                    "JetBrains<br><br>" +
                    "Yana ko'p...<br><br><br>" +
                    "Shunday qilib, siz ushbu yirik kompaniyalarning har qanday keyingi potentsial xodimi bo'lishingiz mumkin. Biz Kotlin uchun ajoyib o'quv materialini ishlab chiqdik, bu sizga Kotlin asosidagi texnik intervyu va sertifikat imtihonlariga tayyorgarlik ko'rishga yordam beradi. Shunday qilib, Kotlinni o'rganishni bizning oddiy va samarali o'quv qo'llanmamizdan istalgan joyda va istalgan vaqtda o'z tezligingizda boshlang.<br><br>" +
                    "Kotlin onlayn kompilyatori<br><br>" +
                    "<br><br>" +
                    "fun main(){<br><br>" +
                    " var string: String  = Hello, World!  // defining a variable<br>" +
                    " println(string)<br>" +
                    "}"
        ),
        Lesson(
            "Overview", "<h1>Kotlin nima?</h1><br>" +
                    "Kotlin Java, JavaScript, Python va boshqalar kabi ochiq kodli yangi dasturlash tilidir. Bu yuqori darajadagi kuchli statik terilgan til boʻlib, funksional va texnik qismlarni bir joyda birlashtiradi. Hozirda Kotlin asosan Java Virtual Mashinasini (JVM) maqsad qilib qo'yadi, balki JavaScript-ni kompilyatsiya qiladi.<br><br>" +
                    "Kotlinga Java, C#, JavaScript, Scala va Groovy kabi boshqa mashhur dasturlash tillari taʼsir koʻrsatadi. Kotlin sintaksisi Java dasturlash tiliga mutlaqo o'xshamasligi mumkin, ammo Kotlin dasturchilar uchun ajoyib natijalarga erishish uchun mavjud Java Class kutubxonasiga tayanadi. Kotlin butun dunyo bo'ylab ishlab chiquvchilar uchun birgalikda ishlash, kod xavfsizligi va ravshanlikni ta'minlaydi.<br><br>" +
                    "Kotlin 2016-yilda JetBrains tomonidan ishlab chiqilgan va chiqarilgan. Kotlin bepul, bepul va bepul qoladi. U Apache 2.0 litsenziyasi ostida ishlab chiqilgan va manba kodi GitHub da mavjud<br><br>" +
                    "<h1>Nega Kotlin?</h1><br>" +
                    "Kotlin barcha darajadagi dasturchilar orasida mashhur bo'lib bormoqda va u quyidagilar uchun ishlatiladi:<br>" +
                    "<li>O'zaro platformali mobil ilovalar.</li><br>" +
                    "<li>Android ilovalarini ishlab chiqish.</li><br>" +
                    "<li>Veb-ilovalarni ishlab chiqish</li><br>" +
                    "<li>Server tomoni ilovalari</li><br>" +
                    "<li>Ish stoli ilovalarini ishlab chiqish</li><br>" +
                    "<li>Ma'lumotlar faniga asoslangan ilovalar</li><br><br>" +
                    "Kotlin turli platformalarda (Windows, Mac, Linux, Raspberry Pi va boshqalar) ishlaydi va u Java bilan 100% mos keladi.<br><br>" +
                    "Kotlin Google, Netflix, Slack, Uber kabi ko'plab yirik kompaniyalar tomonidan Android asosidagi ilovalarini ishlab chiqishda foydalaniladi.<br><br>" +
                    "Eng muhimi, Kotlin ishlab chiquvchilarini faol ravishda qidirayotgan ko'plab kompaniyalar mavjud, ayniqsa Androidni ishlab chiqish sohasida.<br><br>" +
                    "<h1>Kotlin versiyasi?</h1><br><br>" +
                    "Ushbu qoʻllanmani 2021-yil 3-avgustda yozish vaqtida Kotlinning joriy versiyasi 1.5.21<br><br>" +
                    "<h1>Kotlin afzalliklari</h1><br><br>" +
                    "Quyida ilovangizni ishlab chiqish uchun Kotlindan foydalanishning baʼzi afzalliklari keltirilgan.<br><br>" +
                    "<li>Oson til - Kotlin ob'ektga yo'naltirilgan va funktsional konstruktsiyalarni qo'llab-quvvatlaydi va o'rganish juda oson. Sintaksis Java-ga deyarli o'xshaydi, shuning uchun har qanday Java dasturchisi uchun har qanday Kotlin sintaksisini eslab qolish juda oson.</li><br>" +
                    "<li>Juda qisqacha - Kotlin Java Virtual Machine (JVM) ga asoslangan va u funksional tildir. Shunday qilib, u boshqa dasturlash tillarida ishlatiladigan qozon plitasining ko'p kodlarini kamaytiradi.</li><br>" +
                    "<li>Runtime va Performance - Kotlin har qanday dastur uchun yaxshiroq ishlash va kichik ish vaqtini beradi.</li><br>" +
                    "<li>O'zaro ishlash qobiliyati - Kotlin kamroq murakkab usulda o'zaro ishlaydigan dasturni yaratish uchun etarlicha etuk.</li><br>" +
                    "<li>Yangi – Kotlin – ishlab chiquvchilarga yangi boshlanish imkonini beruvchi mutlaqo yangi til. Bu Java o'rnini bosmaydi, garchi u JVM orqali ishlab chiqilgan. Kotlin Android ilovalarini ishlab chiqishning birinchi rasmiy tili sifatida qabul qilingan. Kotlin shuningdek, Kotlin = Java + Extra yangilangan yangi xususiyatlar sifatida ham ta'riflanishi mumkin .</li><br>" +
                    "<h1>Kotlinning kamchiliklari</h1><br><br>" +
                    "Quyida Kotlindan foydalanishning kamchiliklari keltirilgan.<br><br>" +
                    "<li><font color='#321'>Nomlar maydoni deklaratsiyasi</font> - Kotlin ishlab chiquvchilarga funksiyalarni yuqori darajada e'lon qilish imkonini beradi. Biroq, ilovangizning ko'p joylarida bir xil funktsiya e'lon qilinganida, qaysi funktsiya chaqirilayotganini tushunish qiyin.</li><br>" +
                    "<li><font color='#321'>Statik deklaratsiya yo'q</font> - Kotlinda Java kabi odatiy statik ishlov berish modifikatori yo'q, bu an'anaviy Java dasturchisiga ba'zi muammolar keltirib chiqarishi mumkin.</li><br>"
        ),
        Lesson("Environment SetUp"),
        Lesson(
            "Arhitecture",
            "Kotlin dasturlash tili bo'lib, xotirani ajratish va oxirgi foydalanuvchiga sifatli mahsulot ishlab chiqarish uchun o'z arxitekturasiga ega.<br>" +
                    "Quyida Kotlin kompilyatori boshqacha ishlaydigan turli stsenariylar keltirilgan<br>" +
                    "<li>Kotlinni JVM da ishlay oladigan bayt-kodga kompilyatsiya qiling. Bu bayt kod Java .class fayli tomonidan yaratilgan bayt kodiga aynan teng</li>" +
                    "<li>Kotlin JavaScript-ni maqsad qilganda, Kotlin kompilyatori .kt faylini ES5.1 ga aylantiradi va JavaScript uchun mos kodni yaratadi.</li>" +
                    "<li>Kotlin kompilyatori LLVM orqali platformaga mos kodlarni yaratishga qodir</li>" +
                    "<li>Kotlin Multiplatform Mobile (KMM) Android va iOS o'rtasida taqsimlangan kodli ko'p platformali mobil ilovalarni yaratish uchun ishlatiladi.</li><br>" +
                    "Ikki bayt kodli fayllar JVMda ishlaganda (Kotlin va Java-dan ikki xil dastur) ular bir-biri bilan bog'lanishlari mumkin va Java uchun Kotlin-da o'zaro ishlash xususiyati shu tarzda o'rnatiladi.<br><br>" +
                    "<h1>Kotlin asli\n</h1><br><br>" +
                    "Kotlin/Native - bu virtual mashinasiz ishlashi mumkin bo'lgan mahalliy ikkilik fayllarga Kotlin kodini kompilyatsiya qilish texnologiyasi. Kotlin/Native quyidagi platformalarni qo'llab-quvvatlaydi:<br><br>" +
                    "<li>macOS</li>" +
                    "<li>iOS, tvOS, watchOS</li>" +
                    "<li>Linux</li>" +
                    "<li>Windows (MinGW)</li>" +
                    "<li>Android NDK</li>" +
                    "<li>Yana ko'p...</li><br><br>" +
                    "Kotlin/Native, birinchi navbatda, virtual mashinalar istalmagan yoki mumkin bo'lmagan platformalar uchun kompilyatsiya qilish uchun mo'ljallangan, masalan, o'rnatilgan qurilmalar yoki iOS.<br><br>" +
                    "Kompilyatsiya qilingan Kotlin kodini C, C++, Swift, Objective-C va boshqa tillarda yozilgan mavjud loyihalarga kiritish oson."

        ),
        Lesson(
            "Basic syntax", "<h1>Kotlin dasturiga kirish nuqtasi</h1><br<br>" +
                    "Kotlin ilovasining kirish nuqtasi main() funktsiyasidir. Funktsiyani ma'lum bir vazifani bajarish uchun mo'ljallangan kod bloki sifatida aniqlash mumkin.<br><br>" +
                    "fun main() {<br>" +
                    "   var string: String  = \"Hello, World!\"<br>" +
                    "   println(\"$hello\")<br>" +
                    "}<br><br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br><br>" +
                    "Hello, World!<br><br>" +
                    "<h1>Parametrlar bilan kirish nuqtasi</h1><br><br>" +
                    "main() funktsiyasining boshqa shakli quyidagi kabi o'zgaruvchan sonli String argumentlarini qabul qiladi:<br><br>" +
                    "fun main(args: Array<String>){<br>" +
                    "    println(\"Hello, world!\")<br>" +
                    "}<br><br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br><br>" +
                    "Hello, World!<br><br>" +
                    "Agar siz kuzatgan bo'lsangiz, ikkala dastur ham bir xil natijani ishlab chiqarishi aniq, shuning uchun Kotlin 1.3 versiyasidan boshlab main() funktsiyasida parametrni o'tkazish juda ixtiyoriy .<br>" +
                    "<h1>print() va println()</h1><br>" +
                    "Print() bu Kotlindagi funksiya bo‘lib, u o‘z argumentini standart chiqishda chop etadi, xuddi shunday tarzda println() o‘z argumentini standart chiqishda chop etadigan boshqa funksiya bo‘lib, chiqishda qator uzilishini ham qo‘shadi.<br><br>" +
                    "Ushbu ikkita muhim funktsiya o'rtasidagi farqni tushunish uchun quyidagi dasturni sinab ko'raylik:<br><br>" +
                    "fun main(args: Array<String>){<br>" +
                    "    println(\"Hello,\")<br>" +
                    "    println(\" world!\")<br>" +
                    "<br>" +
                    "    print(\"Hello,\")<br>" +
                    "    print(\" world!\")<br>" +
                    "}" +
                    "<br><br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br>" +
                    "Hello,<br>" +
                    "world!<br>" +
                    "Hello, world!<br>" +
                    "Har ikkala funksiya (print() va println()) raqamlar va satrlarni chop etish va bir vaqtning o‘zida quyidagi matematik hisoblarni bajarish uchun ishlatilishi mumkin:<br><br><br>" +
                    "fun main(args: Array<String>){<br>" +
                    "    println( 200 )<br>" +
                    "    println( \"200\" )<br>" +
                    "    println( 2 + 2 )<br>" +
                    "" +
                    "    print(4*3)<br>" +
                    "}<br><br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br><br>" +
                    "200<br>" +
                    "200<br>" +
                    "4<br>" +
                    "12<br><br>" +
                    "<h1>Kotlinda nuqtali vergul (;).</h1><br><br>" +
                    "Java, C++, C# va boshqalar kabi ko'plab boshqa dasturlash tillari kabi Kotlin kodi bayonotlarida nuqta-vergul (;) kerak emas.<br>" +
                    "<br>" +
                    "Kotlin dasturini nuqta-vergul bilan va holda quyidagi tarzda muvaffaqiyatli kompilyatsiya qilishingiz va ishga tushirishingiz mumkin:<br><br>" +
                    "fun main() {<br>" +
                    "    println(\"I'm without semi-colon\")<br>" +
                    "   <br>" +
                    "    println(\"I'm with semi-colon\");<br>" +
                    "}<br><br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br><br>" +
                    "I'm without semi-colon<br>" +
                    "I'm with semi-colon<br><br>" +
                    "Shunday qilib, yaxshi dasturlash amaliyoti sifatida, Kotlin bayonotining oxiriga nuqta-vergul qo'yish tavsiya etilmaydi.<br><br>" +
                    "<h1>Kotlindagi paketlar</h1><br><br>" +
                    "Kotlin kodi odatda paketlarda aniqlanadi, ammo paket spetsifikatsiyasi ixtiyoriydir. Agar siz manba faylda paketni ko'rsatmasangiz, uning mazmuni standart paketga o'tadi.\n" +
                    "<br>" +
                    "Agar biz Kotlin dasturida paketni belgilasak, u faylning yuqori qismida quyidagicha ko'rsatiladi:<br>" +
                    "<br>" +
                    "package org.tutorialspoint.com<br>" +
                    "<br>" +
                    "fun main() {<br>" +
                    "    println(\"Hello, World!\")<br>" +
                    "}<br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:<br>" +
                    "<br>" +
                    "Hello, World!"),
        Lesson("Comments",
            "Sharh - bu Kotlin manba kodidagi dasturchi o'qiy oladigan tushuntirish yoki izoh. Ular manba kodini odamlarga tushunishni osonlashtirish maqsadida qo'shiladi va Kotlin kompilyatori tomonidan e'tiborga olinmaydi.\n" +
                    "\n" +
                    "Ko'pgina zamonaviy tillar singari, Kotlin ham bir qatorli (yoki qator oxiri) va ko'p qatorli (blok) sharhlarni qo'llab-quvvatlaydi. Kotlin sharhlari Java, C va C++ dasturlash tillarida mavjud bo'lgan izohlarga juda o'xshaydi.\n" +
                    "\n" +
                    "Kotlin bir qatorli sharhlar\n" +
                    "Kotlindagi bir qatorli izohlar ikkita oldinga qiyshiq chiziqdan // boshlanadi va satr oxiri bilan tugaydi. Shunday qilib, // va satr oxiri o'rtasida yozilgan har qanday matn Kotlin kompilyatori tomonidan e'tiborga olinmaydi.\n" +
                    "\n" +
                    "Quyida bir qatorli sharhdan foydalanadigan namunaviy Kotlin dasturi keltirilgan:\n" +
                    "\n" +
                    "// This is a comment\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    println(\"Hello, World!\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Hello, World!\n" +
                    "Bitta qatorli izoh dasturning istalgan joyidan boshlanishi mumkin va satr oxirigacha tugaydi. Masalan, bitta qatorli izohdan quyidagi tarzda foydalanishingiz mumkin:\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    println(\"Hello, World!\") // This is also a comment\n" +
                    "}\n" +
                    "Kotlin ko'p qatorli sharhlar\n" +
                    "Kotlindagi ko'p qatorli sharh /* bilan boshlanadi va */ bilan tugaydi . Shunday qilib, /* va */ oralig'ida yozilgan har qanday matn izoh sifatida qabul qilinadi va Kotlin kompilyatori tomonidan e'tiborga olinmaydi.\n" +
                    "\n" +
                    "Ko'p qatorli sharhlar, shuningdek, Kotlindagi izohlarni bloklash deb ham ataladi.\n" +
                    "\n" +
                    "Quyida ko'p qatorli sharhdan foydalanadigan namunaviy Kotlin dasturi keltirilgan:\n" +
                    "\n" +
                    "/* This is a multi-line comment and it can span\n" +
                    " * as many lines as you like \n" +
                    " */\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    println(\"Hello, World!\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Hello, Word!\n" +
                    "Kotlin o'rnatilgan sharhlar\n" +
                    "Kotlindagi izohlarni bloklash mumkin, ya'ni bitta satrli sharh yoki ko'p qatorli sharhlar ko'p qatorli sharhlar ichida quyida joylashgan bo'lishi mumkin:\n" +
                    "\n" +
                    "/* This is a multi-line comment and it can span\n" +
                    " * as many lines as you like \n" +
                    " /* This is a nested comment */\n" +
                    " // Another nested comment \n" +
                    " */\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    println(\"Hello, World!\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Hello, World!"),
        Lesson("Keywords",
            "<table class=\"table table-bordered\" style=\"text-align:center;\"><br>" +
                    "<tbody><tr><br>" +
                    "<td>as</td><br>" +
                    "<td>as?</td><br>" +
                    "<td>break</td><br>" +
                    "<td>class</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>continue</td><br>" +
                    "<td>do</td><br>" +
                    "<td>else</td><br>" +
                    "<td>false</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>for</td><br>" +
                    "<td>fun</td><br>" +
                    "<td>if</td><br>" +
                    "<td>in</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>!in</td><br>" +
                    "<td>interface</td><br>" +
                    "<td>is</td><br>" +
                    "<td>!is</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>null</td><br>" +
                    "<td>object</td><br>" +
                    "<td>package</td><br>" +
                    "<td>return</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>super</td><br>" +
                    "<td>this</td><br>" +
                    "<td>throw</td><br>" +
                    "<td>true</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>try</td><br>" +
                    "<td>typealias</td><br>" +
                    "<td>typeof</td><br>" +
                    "<td>val</td><br>" +
                    "</tr><br>" +
                    "<tr><br>" +
                    "<td>var</td><br>" +
                    "<td>when</td><br>" +
                    "<td>while</td><br>" +
                    "<td></td><br>" +
                    "</tr><br>" +
                    "</tbody></table>"),
        Lesson("Variable",
            "O'zgaruvchilar har qanday dasturlashning muhim qismidir. Ular kompyuter dasturida qiymatlarni saqlash uchun ishlatiladigan kompyuter xotirasi joylariga beradigan nomlar va keyinchalik siz saqlangan qiymatlarni olish va ularni dasturingizda ishlatish uchun ushbu nomlardan foydalanasiz.\n" +
                    "<br>" +
                    "Kotlin o'zgaruvchilari var yoki val kalit so'zlari yordamida yaratiladi va keyin yaratilgan o'zgaruvchilarga qiymat belgilash uchun = teng belgisi ishlatiladi.\n" +
                    "<br>" +
                    "Sintaksis<br>" +
                    "Quyida ikkita o'zgaruvchini yaratish va keyin ularga turli qiymatlarni belgilash uchun oddiy sintaksis mavjud:\n" +
                    "<br>" +
                    "var name = \"Zara Ali\"<br>" +
                    "var age = 19<br>" +
                    "var height = 5.2<br>" +
                    "Misollar<br>" +
                    "O'zgaruvchi yaratilgach va qiymat tayinlangach, biz uning nomidan foydalanib, uning qiymatiga quyidagi tarzda kirishimiz mumkin:\n" +
                    "<br>" +
                    "fun main() {<br>" +
                    "   var name = \"Zara Ali\"<br>" +
                    "   var age = 19<br>" +
                    "<br>" +
                    "   println(name)<br>" +
                    "   println(age)<br>" +
                    "}<br>" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "<br>" +
                    "Zara Ali\n" +
                    "19\n" +
                    "Keling, dollar belgisi yordamida o'zgaruvchan qiymatlarga kirishimiz mumkin bo'lgan yana bir misolni ko'rib chiqaylik :\n" +
                    "\n" +
                    "fun main() {\n" +
                    "   var name = \"Zara Ali\"\n" +
                    "   var age = 19\n" +
                    "\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Zara Ali\n" +
                    "Age = 19\n" +
                    "Quyidagi kabi dollar belgisini ishlatmasdan o'zgaruvchan qiymatlarni ko'rsatish uchun yana bir misolni ko'rib chiqaylik:\n" +
                    "\n" +
                    "fun main() {\n" +
                    "   var name = \"Zara Ali\"\n" +
                    "   var age = 19\n" +
                    "\n" +
                    "   println(\"Name = \" + name)\n" +
                    "   println(\"Age = \" + age)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Zara Ali\n" +
                    "Age = 19\n" +
                    "Kotlin o'zgaruvchan o'zgaruvchilari\n" +
                    "O'zgaruvchanlik, o'zgaruvchining dastlabki tayinlanganidan keyin boshqa qiymatga qayta tayinlanishi mumkinligini anglatadi. O'zgaruvchan o'zgaruvchini e'lon qilish uchun biz yuqoridagi misollarda qo'llaganimizdek var kalit so'zidan foydalanamiz:\n" +
                    "\n" +
                    "fun main() {\n" +
                    "   var name = \"Zara Ali\"\n" +
                    "   var age = 19\n" +
                    "\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "   \n" +
                    "   name = \"Nuha Ali\"\n" +
                    "   age = 11\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Zara Ali\n" +
                    "Age = 19\n" +
                    "Name = Nuha Ali\n" +
                    "Age = 11\n" +
                    "Kotlin faqat o'qiladigan o'zgaruvchilar\n" +
                    "Faqat o'qish uchun mo'ljallangan o'zgaruvchini val (var o'rniga) yordamida e'lon qilish mumkin va qiymat tayinlangandan keyin uni qayta tayinlab bo'lmaydi.\n" +
                    "\n" +
                    "fun main() {\n" +
                    "   val name = \"Zara Ali\"\n" +
                    "   val age = 19\n" +
                    "\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "   \n" +
                    "   name = \"Nuha Ali\" // Not allowed, throws an exception\n" +
                    "   age = 11\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "main.kt:8:4: error: val cannot be reassigned\n" +
                    "name = \"Nuha Ali\" // Not allowed, throws an exception\n" +
                    "^\n" +
                    "main.kt:9:4: error: val cannot be reassigned\n" +
                    "age = 11\n" +
                    "^\n" +
                    "Faqat o'qish uchun va Mutable\n" +
                    "O'zgaruvchan o'zgaruvchilar o'zgaruvchilarni aniqlash uchun ishlatiladi, ular dasturni bajarish jarayonida turli shartlar asosida o'z qiymatlarini zaryadlashni davom ettiradilar.\n" +
                    "\n" +
                    "Siz har xil doimiy qiymatlarni aniqlash uchun faqat o'qiladigan o'zgaruvchidan foydalanasiz, ya'ni dastur davomida o'z qiymatini saqlab qoladigan o'zgaruvchilar.\n" +
                    "\n" +
                    "Kotlin o'zgaruvchan turlari\n" +
                    "Kotlin \"Zara Ali\" satr ekanligini va 19 raqam o'zgaruvchisi ekanligini anglay oladigan darajada aqlli. Biroq, uni yaratishda siz o'zgaruvchi turini aniq belgilashingiz mumkin:\n" +
                    "\n" +
                    "fun main() {\n" +
                    "   var name: String = \"Zara Ali\"\n" +
                    "   var age: Int = 19\n" +
                    "\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "   \n" +
                    "   name = \"Nuha Ali\"\n" +
                    "   age = 11\n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Age = $age\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Zara Ali\n" +
                    "Age = 19\n" +
                    "Name = Nuha Ali\n" +
                    "Age = 11\n" +
                    "Tez orada biz Kotlinda mavjud bo'lgan har xil turdagi o'zgaruvchilarni yaratish uchun ishlatilishi mumkin bo'lgan turli xil ma'lumotlar turlari haqida ko'proq bilib olamiz.\n" +
                    "\n" +
                    "Kotlin o'zgaruvchan nomlash qoidalari\n" +
                    "Kotlin o'zgaruvchilarini nomlashda ma'lum qoidalarga rioya qilish kerak:\n" +
                    "\n" +
                    "Kotlin o'zgaruvchilar nomlarida harflar, raqamlar, pastki chiziq va dollar belgilari bo'lishi mumkin.\n" +
                    "\n" +
                    "Kotlin o'zgaruvchilar nomlari harf, \$ yoki pastki chiziq bilan boshlanishi kerak\n" +
                    "\n" +
                    "Kotlin o'zgaruvchilari katta-kichik harflarga sezgir, ya'ni Zara va ZARA ikki xil o'zgaruvchidir.\n" +
                    "\n" +
                    "Kotlin o'zgaruvchisida bo'sh joy yoki boshqa boshqaruv belgilari bo'lishi mumkin emas.\n" +
                    "\n" +
                    "Kotlin o'zgaruvchisi var, val, String, Int kabi nomlarga ega bo'lishi mumkin emas, chunki ular Kotlinda zaxiralangan kalit so'zlardir."),
        Lesson("Data Types",
            "Kotlin ma'lumotlar turi - bu ma'lumotlar tasnifi bo'lib, kompilyatorga dasturchi ma'lumotlardan qanday foydalanish niyatida ekanligini aytadi. Masalan, Kotlin ma'lumotlari raqamli, satr, mantiqiy va boshqalar bo'lishi mumkin.\n" +
                    "\n" +
                    "Kotlin hamma narsani ob'ekt sifatida ko'radi, ya'ni biz istalgan o'zgaruvchiga a'zo funktsiyalari va xususiyatlarini chaqira olamiz.\n" +
                    "\n" +
                    "Kotlin - bu statik tarzda yozilgan til, ya'ni har bir ifodaning ma'lumotlar turi kompilyatsiya vaqtida ma'lum bo'lishi kerak.\n" +
                    "\n" +
                    "Kotlin o'rnatilgan ma'lumotlar turini quyidagicha tasniflash mumkin:\n" +
                    "\n" +
                    "Raqam\n" +
                    "\n" +
                    "Xarakter\n" +
                    "\n" +
                    "String\n" +
                    "\n" +
                    "Mantiqiy\n" +
                    "\n" +
                    "Massiv\n" +
                    "\n" +
                    "(a) Kotlin raqamlari ma'lumotlar turlari\n" +
                    "Kotlin raqamlari ma'lumotlar turlari raqamli qiymatlarga ega bo'lgan o'zgaruvchilarni aniqlash uchun ishlatiladi va ular ikki guruhga bo'linadi: (a) butun sonli tiplar musbat yoki manfiy butun sonlarni saqlaydi (b) suzuvchi nuqta turlari bir yoki bir nechtasini o'z ichiga olgan kasr qismi bo'lgan raqamlarni ifodalaydi. o'nli kasrlar." +
                    "Agar biz ma'lum bir turdagi ma'lumotlar o'zgaruvchisida ruxsat etilgan qiymatdan ko'proq qiymatni saqlashga harakat qilsak, Kotlin kompilyatori shikoyat qiladi, chunki ish vaqtida to'lib ketish sodir bo'ladi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyidagi misol turli xil Kotlin raqamlari ma'lumotlar turlarini qanday aniqlash va ularga kirishni ko'rsatadi:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a: Int = 10000\n" +
                    "   val d: Double = 100.00\n" +
                    "   val f: Float = 100.00f\n" +
                    "   val l: Long = 1000000004\n" +
                    "   val s: Short = 10\n" +
                    "   val b: Byte = 1\n" +
                    "\n" +
                    "   println(\"Int Value is \" + a)\n" +
                    "   println(\"Double  Value is \" + d)\n" +
                    "   println(\"Float Value is \" + f)\n" +
                    "   println(\"Long Value is \" + l )\n" +
                    "   println(\"Short Value is \" + s)\n" +
                    "   println(\"Byte Value is \" + b)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Int Value is 10000\n" +
                    "Double Value is 100.0\n" +
                    "Float Value is 100.0\n" +
                    "Long Value is 1000000004\n" +
                    "Short Value is 10\n" +
                    "Byte Value is 1\n" +
                    "(b) Kotlin belgilar ma'lumotlar turi\n" +
                    "Kotlin belgilar ma'lumotlar turi bitta belgini saqlash uchun ishlatiladi va ular Char kalit so'zi bilan ifodalanadi . Char qiymati “A” yoki “1” kabi bitta tirnoq bilan oʻralgan boʻlishi kerak.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyidagi misol Kotlin Char ma'lumotlar turini qanday aniqlash va unga kirishni ko'rsatadi:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val letter: Char    // defining a Char variable\n" +
                    "   letter = 'A'        // Assigning a value to it\n" +
                    "   println(\"letter\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "A\n" +
                    "Kotlin belgilarning bir qator qochish ketma-ketligini qo'llab-quvvatlaydi. Belgidan oldin teskari chiziq (\\) qo'yilsa, u qochish ketma-ketligi deb ataladi va kompilyator uchun alohida ma'noga ega. Masalan, quyidagi bayonotdagi \\n to'g'ri belgi bo'lib, u yangi satr belgisi deb ataladi\n" +
                    "\n" +
                    "println('\\n') //prints a newline character\n" +
                    "\n" +
                    "println('\\\$') //prints a dollar \$ character\n" +
                    "\n" +
                    "println('\\\\') //prints a back slash \\ character\n" +
                    "Kotlinda quyidagi qochish ketma-ketliklari qo'llab-quvvatlanadi: \\t, \\b, \\n, \\r, \\', \\\", \\\\ va \\\$.\n" +
                    "\n" +
                    "(c) Kotlin string ma'lumotlar turi\n" +
                    "String ma'lumotlar turi belgilar ketma-ketligini saqlash uchun ishlatiladi. Satr qiymatlari qo'sh tirnoq (\" \") yoki uch qo'shtirnoq (\"\"\" \"\"\") bilan o'ralgan bo'lishi kerak.\n" +
                    "\n" +
                    "Bizda Kotlin-da ikkita turdagi string mavjud - biri Escaped String , ikkinchisi esa Raw String deb ataladi .\n" +
                    "\n" +
                    "Escaped string is declared within double quote (\" \") and may contain escape characters like '\\n', '\\t', '\\b' etc.\n" +
                    "\n" +
                    "Raw string is declared within triple quote (\"\"\" \"\"\") and may contain multiple lines of text without any escape characters.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val escapedString : String  = \"I am escaped String!\\n\"\n" +
                    "   var rawString :String  = \"\"\"This is going to be a\n" +
                    "   multi-line string and will\n" +
                    "   not have any escape sequence\"\"\";\n" +
                    "\n" +
                    "   print(escapedString)\n" +
                    "   println(rawString)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "I am escaped String!\n" +
                    "This is going to be a\n" +
                    "multi-line string and will\n" +
                    "not have any escape sequence\n" +
                    "(d) Kotlin Boolean Data Type\n" +
                    "Boolean is very simple like other programming languages. We have only two values for Boolean data type - either true or false.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val A: Boolean = true   // defining a variable with true value\n" +
                    "   val B: Boolean = false   // defining a variable with false value\n" +
                    "\n" +
                    "   println(\"Value of variable A \"+ A )\n" +
                    "   println(\"Value of variable B \"+ B )\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Value of variable A true\n" +
                    "Value of variable B false\n" +
                    "Boolean has a nullable counterpart Boolean? that can store a null value as below:\n" +
                    "\n" +
                    "val boolNull: Boolean? = null\n" +
                    "(e) Kotlin Array Data Type\n" +
                    "Kotlin arrays are a collection of homogeneous data. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.\n" +
                    "\n" +
                    "We will study array in a separate chapter, for now let's look at one example to define an array of integers and then access its one of the elements.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)\n" +
                    "   println(\"Value at 3rd position : \" + numbers[2])\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Value at 3rd position : 3\n" +
                    "Kotlin Data Type Conversion\n" +
                    "Type conversion is a process in which the value of one data type is converted into another type. Kotlin does not support direct conversion of one numeric data type to another, For example, it is not possible to convert an Int type to a Long type:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 100\n" +
                    "   val y: Long = x  // Not valid assignment\n" +
                    "\n" +
                    "   println(y)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "main.kt:3:18: error: type mismatch: inferred type is Int but Long was expected\n" +
                    "val y: Long = x // Not valid assignment\n" +
                    "To convert a numeric data type to another type, Kotlin provides a set of functions:\n" +
                    "\n" +
                    "toByte()\n" +
                    "\n" +
                    "toShort()\n" +
                    "\n" +
                    "toInt()\n" +
                    "\n" +
                    "toLong()\n" +
                    "\n" +
                    "toFloat()\n" +
                    "\n" +
                    "toDouble()\n" +
                    "\n" +
                    "toChar()\n" +
                    "\n" +
                    "Now let's rewrite above example once again and try to run it:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 100\n" +
                    "   val y: Long = x.toLong()\n" +
                    "\n" +
                    "   println(y)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "100"),
        Lesson("Operators",
            "Operator - kompilyatorga aniq matematik yoki mantiqiy manipulyatsiyalarni bajarishni bildiruvchi belgi. Kotlin o'rnatilgan operatorlarga boy va quyidagi turdagi operatorlarni taqdim etadi:\n" +
                    "\n" +
                    "Arifmetik operatorlar\n" +
                    "\n" +
                    "Aloqa operatorlari\n" +
                    "\n" +
                    "Belgilash operatorlari\n" +
                    "\n" +
                    "Birlik operatorlar\n" +
                    "\n" +
                    "Mantiqiy operatorlar\n" +
                    "\n" +
                    "Bitli operatsiyalar\n" +
                    "\n" +
                    "Keling, ushbu Kotlin operatorlarini birma-bir ko'rib chiqaylik.\n" +
                    "\n" +
                    "(a) Kotlin arifmetik operatorlari\n" +
                    "Kotlin arifmetik operatorlari qo'shish, ayirish, ko'paytirish va bo'lish kabi asosiy matematik operatsiyalarni bajarish uchun ishlatiladi.\n" +
                    "\n" +
                    "Operator\tIsm\tTavsif\tMisol\n" +
                    "+\tQo'shish\tIkki qiymatni birlashtiradi\tx + y\n" +
                    "-\tAyirish\tBir qiymatdan boshqasini ayiradi\tx - y\n" +
                    "*\tKo'paytirish\tIkki qiymatni ko'paytiradi\tx * y\n" +
                    "/\tBo'lim\tBir qiymatni boshqasiga ajratadi\tx / y\n" +
                    "%\tModul\tBo'linish qoldig'ini qaytaradi\tx % y\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlin arifmetik operatorlari yordamida turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 40\n" +
                    "   val y: Int = 20\n" +
                    "\n" +
                    "   println(\"x + y = \" +  (x + y))\n" +
                    "   println(\"x - y = \" +  (x - y))\n" +
                    "   println(\"x / y = \" +  (x / y))\n" +
                    "   println(\"x * y = \" +  (x * y))\n" +
                    "   println(\"x % y = \" +  (x % y))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x + y = 60\n" +
                    "x - y = 20\n" +
                    "x / y = 2\n" +
                    "x * y = 800\n" +
                    "x % y = 0\n" +
                    "(b) Kotlin aloqa operatorlari\n" +
                    "Kotlin relyatsion (taqqoslash) operatorlari ikkita qiymatni solishtirish uchun ishlatiladi va mantiqiy qiymatni qaytaradi: true yoki false .\n" +
                    "\n" +
                    "Operator\tIsm\tMisol\n" +
                    ">\tdan kattaroq\tx > y\n" +
                    "<\tkamroq\tx < y\n" +
                    ">=\tdan katta yoki teng\tx >= y\n" +
                    "<=\tdan kam yoki teng\tx <= y\n" +
                    "==\tga teng\tx == y\n" +
                    "!=\tga teng emas\tx != y\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlin aloqa operatorlari yordamida turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 40\n" +
                    "   val y: Int = 20\n" +
                    "\n" +
                    "   println(\"x > y = \" +  (x > y))\n" +
                    "   println(\"x < y = \" +  (x < y))\n" +
                    "   println(\"x >= y = \" +  (x >= y))\n" +
                    "   println(\"x <= y = \" +  (x <= y))\n" +
                    "   println(\"x == y = \" +  (x == y))\n" +
                    "   println(\"x != y = \" +  (x != y))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x > y = true\n" +
                    "x < y = false\n" +
                    "x >= y = true\n" +
                    "x <= y = false\n" +
                    "x == y = false\n" +
                    "x != y = true\n" +
                    "(c) Kotlinni tayinlash operatorlari\n" +
                    "Kotlin belgilash operatorlari o'zgaruvchilarga qiymatlarni belgilash uchun ishlatiladi.\n" +
                    "\n" +
                    "Quyida ikkita o'zgaruvchiga qiymat belgilash uchun tayinlash operatoridan foydalangan misol keltirilgan :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 40\n" +
                    "   val y: Int = 20\n" +
                    "   \n" +
                    "   println(\"x = \" +  x)\n" +
                    "   println(\"y = \" +  y)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x = 40\n" +
                    "y = 20\n" +
                    "Quyida biz o'z-o'zidan o'zgaruvchining qiymatini qo'shish va uni yana bir xil o'zgaruvchiga belgilash uchun += tayinlash operatoridan foydalanganmiz yana bir misol :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x: Int = 40\n" +
                    "\n" +
                    "   x += 10\n" +
                    "      \n" +
                    "   println(\"x = \" +  x)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x = 50\n" +
                    "Quyida barcha tayinlash operatorlarining ro'yxati keltirilgan:\n" +
                    "\n" +
                    "Operator\tMisol\tKengaytirilgan shakl\n" +
                    "=\tx = 10\tx = 10\n" +
                    "+=\tx += 10\tx = x - 10\n" +
                    "-=\tx -= 10\tx = x - 10\n" +
                    "*=\tx *= 10\tx = x * 10\n" +
                    "/=\tx /= 10\tx = x / 10\n" +
                    "%=\tx %= 10\tx = x % 10\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlin tayinlash operatorlari yordamida turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x: Int = 40\n" +
                    "\n" +
                    "   x += 5\n" +
                    "   println(\"x += 5 = \" + x )\n" +
                    "   \n" +
                    "   x = 40;\n" +
                    "   x -= 5\n" +
                    "   println(\"x -= 5 = \" +  x)\n" +
                    "   \n" +
                    "   x = 40\n" +
                    "   x *= 5\n" +
                    "   println(\"x *= 5 = \" +  x)\n" +
                    "   \n" +
                    "   x = 40\n" +
                    "   x /= 5\n" +
                    "   println(\"x /= 5 = \" +  x)\n" +
                    "   \n" +
                    "   x = 43\n" +
                    "   x %= 5\n" +
                    "   println(\"x %= 5 = \" + x)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x += 5 = 45\n" +
                    "x -= 5 = 35\n" +
                    "x *= 5 = 200\n" +
                    "x /= 5 = 8\n" +
                    "x %= 5 = 3\n" +
                    "(d) Kotlin unary operatorlari\n" +
                    "Birlik operatorlar faqat bitta operandni talab qiladi; ular qiymatni bittaga oshirish/kamaytirish, ifodani inkor etish yoki mantiqiy qiymatini invertatsiya qilish kabi turli amallarni bajaradi.\n" +
                    "\n" +
                    "Quyida Kotlin Unary operatorlari ro'yxati keltirilgan:\n" +
                    "\n" +
                    "Operator\tIsm\tMisol\n" +
                    "+\tunary plus\t+x\n" +
                    "-\tunary minus\t-x\n" +
                    "++\t1 ga oshirish\t++x\n" +
                    "--\t1 ga kamaytirish\t--x\n" +
                    "!\tmantiqiy qiymatni invertatsiya qiladi\t!x\n" +
                    "Misol\n" +
                    "Quyidagi misol Kotlin Unary operatorlari yordamida turli hisoblarni ko'rsatadi:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x: Int = 40\n" +
                    "   var b:Boolean = true\n" +
                    "\n" +
                    "   println(\"+x = \" +  (+x))\n" +
                    "   println(\"-x = \" +  (-x))\n" +
                    "   println(\"++x = \" +  (++x))\n" +
                    "   println(\"--x = \" +  (--x))\n" +
                    "   println(\"!b = \" +  (!b))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "+x = 40\n" +
                    "-x = -40\n" +
                    "++x = 41\n" +
                    "--x = 40\n" +
                    "!b = false\n" +
                    "Bu erda o'sish (++) va kamaytirish (--) operatorlari ++x yoki --x prefiksi, shuningdek x++ yoki x-- qo'shimchasi sifatida ishlatilishi mumkin. Ikkala shakl o'rtasidagi yagona farq shundaki, agar biz ularni prefiks sifatida ishlatsak, operator ifoda bajarilishidan oldin qo'llaniladi, lekin agar ulardan qo'shimcha sifatida foydalanilsa, operator ifoda bajarilgandan keyin amal qiladi.\n" +
                    "\n" +
                    "(e) Kotlin mantiqiy operatorlari\n" +
                    "Kotlin mantiqiy operatorlari ikkita o'zgaruvchi yoki qiymat o'rtasidagi mantiqni aniqlash uchun ishlatiladi:\n" +
                    "\n" +
                    "Quyida Kotlin mantiqiy operatorlari ro'yxati keltirilgan:\n" +
                    "\n" +
                    "Operator\tIsm\tTavsif\tMisol\n" +
                    "&&\tMantiqiy va\tIkkala operand ham rost bo'lsa, true qiymatini qaytaradi\tx && y\n" +
                    "||\tMantiqiy yoki\tOperandlardan biri rost bo'lsa, true qiymatini qaytaradi\tx || y\n" +
                    "!\tMantiqiy emas\tNatijani o'zgartiring, agar operand rost bo'lsa, noto'g'ri qaytaradi\t!x\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlin mantiqiy operatorlari yordamida turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x: Boolean = true\n" +
                    "   var y:Boolean = false\n" +
                    "\n" +
                    "   println(\"x && y = \" +  (x && y))\n" +
                    "   println(\"x || y = \" +  (x || y))\n" +
                    "   println(\"!y = \" +  (!y))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x && y = false\n" +
                    "x || y = true\n" +
                    "!y = true\n" +
                    "(e) Kotlin bitli operatsiyalari\n" +
                    "Kotlinda bitli operatorlar yo'q, lekin Kotlin bitli operatsiyalarni bajarish uchun yordamchi funktsiyalar ro'yxatini taqdim etadi.\n" +
                    "\n" +
                    "Quyida Kotlin Bitwise funktsiyalari ro'yxati keltirilgan:\n" +
                    "\n" +
                    "Funktsiya\tTavsif\tMisol\n" +
                    "shl (bit)\timzolangan siljish chapga\tx.shl(y)\n" +
                    "shr (bit)\timzolangan o'ngga siljish\tx.shr(y)\n" +
                    "ushr (bit)\timzosiz o'ngga siljish\tx.ushr(y)\n" +
                    "va (bit)\tbitli va\tx.va (y)\n" +
                    "yoki (bit)\tbitli yoki\tx.yoki(y)\n" +
                    "xor (bit)\tbitwise xor\tx.xor(y)\n" +
                    "inv()\tbitli teskari\tx.inv()\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlinning bitviy funksiyalaridan foydalangan holda turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x:Int = 60\t  // 60 = 0011 1100  \n" +
                    "   var y:Int = 13\t  // 13 = 0000 1101\n" +
                    "   var z:Int\n" +
                    "\n" +
                    "   z = x.shl(2)       // 240 = 1111 0000\n" +
                    "   println(\"x.shl(2) = \" +  z)\n" +
                    "   \n" +
                    "   z = x.shr(2)       // 15 = 0000 1111\n" +
                    "   println(\"x.shr(2) = \" +  z)\n" +
                    "   \n" +
                    "   z = x.and(y)       // 12 = 0000 1100\n" +
                    "   println(\"x.and(y)  = \" +  z)\n" +
                    "   \n" +
                    "   z = x.or(y)        // 61 = 0011 1101\n" +
                    "   println(\"x.or(y)  = \" +  z)\n" +
                    "   \n" +
                    "   z = x.xor(y)       // 49 = 0011 0001\n" +
                    "   println(\"x.xor(y)  = \" +  z)\n" +
                    "   \n" +
                    "   z = x.inv()        // -61 = 1100 0011\n" +
                    "   println(\"x.inv()  = \" +  z)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x.shl(2) = 240\n" +
                    "x.shr(2) = 15\n" +
                    "x.and(y) = 12\n" +
                    "x.or(y) = 61\n" +
                    "x.xor(y) = 49\n" +
                    "x.inv() = -61"),
        Lesson("Booleans",
            "Ko'p marta biz Ha yoki Yo'q deb qaror qabul qilishimiz kerak bo'lgan vaziyatga duch kelamiz yoki to'g'ri yoki noto'g'ri deb aytishimiz mumkin . Bunday vaziyatni hal qilish uchun Kotlin mantiqiy ma'lumotlar turiga ega bo'lib, u true yoki false qiymatlarini qabul qilishi mumkin .\n" +
                    "\n" +
                    "Kotlinning mantiqiy hamkasbi ham bormi? bu null qiymatga ega bo'lishi mumkin.\n" +
                    "\n" +
                    "Mantiqiy o'zgaruvchilarni yaratish\n" +
                    "Mantiqiy o'zgaruvchini Boolean kalit so'zi yordamida yaratish mumkin va bu o'zgaruvchi faqat true yoki false qiymatlarini qabul qilishi mumkin :\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val isSummer: Boolean = true\n" +
                    "   val isCold: Boolean = false\n" +
                    "  \n" +
                    "   println(isSummer)\n" +
                    "   println(isCold)\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "true\n" +
                    "false\n" +
                    "Aslida, biz Boolean kalit so'zidan foydalanmasdan Kotlin mantiqiy o'zgaruvchilarni yaratishimiz mumkin va Kotlin o'zgaruvchining turini tayinlangan qiymatlar asosida tushunadi yoki haqiqiy yoki noto'g'ri\n" +
                    "\n" +
                    "AD\n" +
                    "Kotlin mantiqiy operatorlari\n" +
                    "Kotlin mantiqiy o'zgaruvchilar uchun quyidagi o'rnatilgan operatorlarni taqdim etadi. Bu operatorlar mantiqiy operatorlar deb ham ataladi:\n" +
                    "\n" +
                    "Operator\tIsm\tTavsif\tMisol\n" +
                    "&&\tMantiqiy va\tIkkala operand ham rost bo'lsa, true qiymatini qaytaradi\tx && y\n" +
                    "||\tMantiqiy yoki\tOperandlardan biri rost bo'lsa, true qiymatini qaytaradi\tx || y\n" +
                    "!\tMantiqiy emas\tNatijani o'zgartiring, agar operand rost bo'lsa, noto'g'ri qaytaradi\t!x\n" +
                    "Misol\n" +
                    "Quyidagi misolda Kotlin mantiqiy operatorlari yordamida turli hisoblar ko'rsatilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var x: Boolean = true\n" +
                    "   var y:Boolean = false\n" +
                    "\n" +
                    "   println(\"x && y = \" +  (x && y))\n" +
                    "   println(\"x || y = \" +  (x || y))\n" +
                    "   println(\"!y = \" +  (!y))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x && y = false\n" +
                    "x || y = true\n" +
                    "!y = true\n" +
                    "Kotlin mantiqiy ifodasi\n" +
                    "Mantiqiy ifoda haqiqiy yoki noto'g'ri qiymatni qaytaradi va asosan if...else ifodalari bilan shartni tekshirishda ishlatiladi . Mantiqiy ifoda relyatsion operatorlardan foydalanadi, masalan >, <, >= va hokazo.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Int = 40\n" +
                    "   val y: Int = 20\n" +
                    "\n" +
                    "   println(\"x > y = \" +  (x > y))\n" +
                    "   println(\"x < y = \" +  (x < y))\n" +
                    "   println(\"x >= y = \" +  (x >= y))\n" +
                    "   println(\"x <= y = \" +  (x <= y))\n" +
                    "   println(\"x == y = \" +  (x == y))\n" +
                    "   println(\"x != y = \" +  (x != y))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x > y = true\n" +
                    "x < y = false\n" +
                    "x >= y = true\n" +
                    "x <= y = false\n" +
                    "x == y = false\n" +
                    "x != y = true\n" +
                    "AD\n" +
                    "Kotlin va () va yoki () funktsiyalari\n" +
                    "Kotlin ikkita mantiqiy operandlar o'rtasida mantiqiy VA va mantiqiy OR operatsiyalarini bajarish uchun va() va yoki() funksiyalarini taqdim etadi .\n" +
                    "\n" +
                    "Bu funksiyalar && va || dan farq qiladi operatorlar, chunki bu funktsiyalar qisqa tutashuvni baholashni amalga oshirmaydi, lekin ular har doim ikkala operandni ham baholaydi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Boolean = true\n" +
                    "   val y: Boolean = false\n" +
                    "   val z: Boolean = true\n" +
                    "\n" +
                    "   println(\"x.and(y) = \" +  x.and(y))\n" +
                    "   println(\"x.or(y) = \" +  x.or(y))\n" +
                    "   println(\"x.and(z) = \" +  x.and(z))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x.and(y) = false\n" +
                    "x.or(y) = true\n" +
                    "x.and(z) = true\n" +
                    "Kotlin mantiqiy EMAS va XOR amallarini bajarish uchun not() va xor() funksiyalarini ham taqdim etadi.\n" +
                    "\n" +
                    "Boolean to String\n" +
                    "Mantiqiy ob'ektni uning ekvivalent qator ko'rinishiga aylantirish uchun toString() funksiyasidan foydalanishingiz mumkin .\n" +
                    "\n" +
                    "String o'zgaruvchisida rost yoki noto'g'ri qiymatni belgilashda sizga ushbu konvertatsiya kerak bo'ladi .\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x: Boolean = true\n" +
                    "   var z: String\n" +
                    "   \n" +
                    "   z = x.toString()\n" +
                    "\n" +
                    "   println(\"x.toString() = \" +  x.toString())\n" +
                    "   println(\"z = \" +  z)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "x.toString() = true\n" +
                    "z = true"),
        Lesson("Strings",
            "Kotlin String ma'lumotlar turi belgilar ketma-ketligini saqlash uchun ishlatiladi. Satr qiymatlari qo'sh tirnoq (\" \") yoki uch qo'shtirnoq (\"\"\" \"\"\") bilan o'ralgan bo'lishi kerak.\n" +
                    "\n" +
                    "Bizda Kotlin-da ikkita turdagi string mavjud - biri Escaped String , ikkinchisi esa Raw String deb ataladi .\n" +
                    "\n" +
                    "Chiqib ketgan satr qo'sh tirnoq (\" \") ichida e'lon qilinadi va '\\n', '\\t', '\\b' va boshqalar kabi qochish belgilarini o'z ichiga olishi mumkin.\n" +
                    "\n" +
                    "Raw string uch qo'shtirnoq (\"\"\" \"\"\") ichida e'lon qilinadi va hech qanday qochish belgilarisiz bir nechta matn qatorlarini o'z ichiga olishi mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val escapedString : String  = \"I am escaped String!\\n\"\n" +
                    "   var rawString :String  = \"\"\"This is going to be a\n" +
                    "   multi-line string and will\n" +
                    "   not have any escape sequence\"\"\";\n" +
                    "\n" +
                    "   print(escapedString)\n" +
                    "   println(rawString)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am escaped String!\n" +
                    "This is going to be a\n" +
                    "multi-line string and will\n" +
                    "not have any escape sequence\n" +
                    "Bu String uchun ma'lumotlar turini belgilash uchun ixtiyoriy, Kotlin berilgan ikki yoki uch qo'shtirnoq tufayli a o'zgaruvchisi String ekanligini tushunishi mumkin.\n" +
                    "\n" +
                    "Agar siz qiymatni belgilamasdan String o'zgaruvchisini yaratmoqchi bo'lsangiz, o'zgaruvchini e'lon qilishda turini ko'rsatishingiz kerak, aks holda u xatoga olib keladi:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String\n" +
                    "\n" +
                    "   name = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(name)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Zara Ali\n" +
                    "Kotlin string shablonlar\n" +
                    "Kotlin string shablonlari - bu baholanadigan va natijalari satrga interpolyatsiya qilinadigan kod qismlari. Shablon ifodasi dollar belgisi (\$) bilan boshlanadi va ism yoki ifodadan iborat bo'lishi mumkin.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String = \"Zara Ali\"\n" +
                    "   \n" +
                    "   println(\"Name  - $name\")  // Using template with variable name\n" +
                    "   \n" +
                    "   println(\"Name length - ${name.length}\")  // Using template with expression.\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name - Zara Ali\n" +
                    "Name length - 8\n" +
                    "Kotlin string ob'ekti\n" +
                    "Kotlin String - bu o'ziga xos satr o'zgaruvchisidan keyin nuqta belgisini (.) yozish orqali satrlarda ma'lum operatsiyalarni bajarishi mumkin bo'lgan bir qator xususiyatlar va funktsiyalarni o'z ichiga olgan ob'ekt.\n" +
                    "\n" +
                    "Biz ushbu bobda ba'zi muhim xususiyatlar va funktsiyalarni ko'rib chiqamiz, qolganlarini siz Kotlinning so'nggi versiyasining rasmiy hujjatlarida topishingiz mumkin.\n" +
                    "\n" +
                    "Kotlin string indekslari\n" +
                    "Kotlin Stringni belgilar ketma-ketligi sifatida ko'rib chiqish mumkin yoki siz Stringni belgilar massivi deb aytishingiz mumkin. Kvadrat qavslar yordamida element indeksini belgilash orqali uning elementiga kirishingiz mumkin.\n" +
                    "\n" +
                    "String indekslari 0 dan boshlanadi, shuning uchun agar siz satrning 4-elementiga kirishni istasangiz, 4-elementga kirish uchun indeksni 3 sifatida belgilashingiz kerak.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(name[3])\n" +
                    "   println(name[5])\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "a\n" +
                    "A\n" +
                    "Kotlin string uzunligi\n" +
                    "Kotlin satrining uzunligini aniqlash uchun uzunlik xususiyatidan foydalanishimiz mumkin .\n" +
                    "\n" +
                    "Kotlin funktsiyasi count() ham berilgan satr uzunligini qaytaradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(\"The length of name :\" + name.length)\n" +
                    "   println(\"The length of name :\" + name.count())\n" +
                    "      \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "The length of name :8\n" +
                    "The length of name :8\n" +
                    "Kotlin String oxirgi indeksi\n" +
                    "Belgilar ketma-ketligidagi oxirgi belgi indeksini bilish uchun Kotlin satrining lastIndex xususiyatidan foydalanishimiz mumkin . Agar satr bo'sh bo'lsa, u -1 ni qaytaradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(\"The index of last character in name :\" + name.lastIndex)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "The index of last character in name :7\n" +
                    "Satrlarning holatini o'zgartirish\n" +
                    "Kotlin satrni mos ravishda katta va kichik harflarga aylantirish uchun toUpperCase() va toLowerCase() funksiyalarini taqdim etadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(\"Upper case of name :\" + name.toUpperCase())\n" +
                    "   println(\"Lower case of name :\" + name.toLowerCase())\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Upper case of name :ZARA ALI\n" +
                    "Lower case of name :zara ali\n" +
                    "Kotlin satrini birlashtirish\n" +
                    "Ikki qatorni birlashtirish uchun + operatoridan foydalanishimiz mumkin yoki ikkita qatorni birlashtirish uchun plus() funksiyasidan ham foydalanishimiz mumkin .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var firstName : String = \"Zara \"\n" +
                    "   var lastName : String = \"Ali\"\n" +
                    "\n" +
                    "   println(\"Full Name :\" + firstName + lastName)\n" +
                    "   \n" +
                    "   println(\"Full Name :\" + firstName.plus(lastName) )\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Full Name :Zara Ali\n" +
                    "Full Name :Zara Ali\n" +
                    "Stringdagi belgilarni kesish\n" +
                    "Biz drop() yoki dropLast() funksiyalari yordamida satrdan dastlabki yoki oxirgi bir necha belgilarni olib tashlashimiz mumkin .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(\"Remove first two characters from name : \" + name.drop(2))\n" +
                    "   \n" +
                    "   println(\"Remove last two characters from name : \" + name.dropLast(2))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Remove first two characters from name : ra Ali\n" +
                    "Remove last two characters from name : Zara A\n" +
                    "Satr ichidagi iqtiboslar\n" +
                    "Satr ichidagi qo'shtirnoqlardan foydalanish uchun bitta tirnoqdan foydalaning ('):\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var str1 : String = \"That's it\"\n" +
                    "   var str2 : String = \"It's OK\"\n" +
                    "\n" +
                    "   println(\"str1 : \" + str1)\n" +
                    "   println(\"str2 : \" + str2)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "str1 : That's it\n" +
                    "str2 : It's OK\n" +
                    "String ichidagi satrni topish\n" +
                    "Kotlin satr ichidagi matnni topish uchun indexOf() funksiyasini taqdim etadi. Ushbu funktsiya satrda belgilangan matnning birinchi marta paydo bo'lish indeksini qaytaradi\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var str : String = \"Meditation and Yoga are synonymous with India\"\n" +
                    "\n" +
                    "   println(\"Index of Yoga in the string - \" + str.indexOf(\"Yoga\"))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Index of Yoga in the string - 15\n" +
                    "Ikki qatorni solishtirish\n" +
                    "Kotlin ikki qatorni solishtirish uchun compareTo() funksiyasini taqdim etadi. Agar ikkita satr teng bo'lsa, bu funktsiya 0 ni qaytaradi, aks holda u 1 ni qaytaradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var str1 : String = \"Apple\"\n" +
                    "   var str2 : String = \"Apple\"\n" +
                    "\n" +
                    "   println(str1.compareTo(str2))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "0\n" +
                    "Kotlin getOrNull() funktsiyasi\n" +
                    "Kotlin getOrNull() funktsiyasi berilgan indeksdagi belgini qaytaradi yoki agar indeks ushbu belgilar ketma-ketligi chegarasidan tashqarida bo'lsa null.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var name : String = \"Zara\"\n" +
                    "\n" +
                    "   println(name.getOrNull(0))\n" +
                    "   println(name.getOrNull(2))\n" +
                    "   println(name.getOrNull(100))\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Z\n" +
                    "r\n" +
                    "null\n" +
                    "Kotlin toString() funktsiyasi\n" +
                    "Kotlin toString() funktsiyasi ob'ektning satr tasvirini qaytaradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var name : String = \"Zara Ali\"\n" +
                    "\n" +
                    "   println(name.toString())\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Zara Ali"),
        Lesson("Arrays",
            "Massivlar bir xil ma'lumotlar turidagi bir nechta elementlarni bitta o'zgaruvchida, masalan, butun son yoki satrni bitta o'zgaruvchi nomi ostida saqlash uchun ishlatiladi.\n" +
                    "\n" +
                    "Misol uchun, agar biz 1000 ta xodimning nomlarini saqlashimiz kerak bo'lsa, unda 1000 ta turli qator o'zgaruvchilarni yaratish o'rniga, sig'imi 1000 ta bo'lgan qatorni aniqlashimiz mumkin.\n" +
                    "\n" +
                    "Boshqa har qanday zamonaviy dasturlash tillari singari, Kotlin ham massivlarni qo'llab-quvvatlaydi va massivlarning keng doirasini ta'minlaydi va massivlarni manipulyatsiya qilish uchun qo'llab-quvvatlash funktsiyalarini ta'minlaydi.\n" +
                    "\n" +
                    "Kotlinda massivlarni yaratish\n" +
                    "Kotlinda massiv yaratish uchun biz arrayOf() funksiyasidan foydalanamiz va qiymatlarni uning ichida vergul bilan ajratilgan ro‘yxatga joylashtiramiz:\n" +
                    "\n" +
                    "val fruits = arrayOf(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "Ixtiyoriy ravishda biz quyidagi ma'lumotlar turini taqdim etishimiz mumkin:\n" +
                    "\n" +
                    "val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "Shu bilan bir qatorda, arrayOfNulls() funksiyasidan null elementlar bilan toʻldirilgan berilgan oʻlchamdagi massiv yaratish uchun foydalanish mumkin.\n" +
                    "\n" +
                    "Primitiv tipdagi massivlar\n" +
                    "Kotlin, shuningdek, ibtidoiy ma'lumotlar turlarining massivlarini yaratish uchun o'rnatilgan zavod usullariga ega. Masalan, butun sonli massivni yaratishning zavod usuli:\n" +
                    "\n" +
                    "val num = intArrayOf(1, 2, 3, 4)\n" +
                    "Massivlarni yaratish uchun boshqa zavod usullari mavjud:\n" +
                    "\n" +
                    "byteArrayOf()\n" +
                    "\n" +
                    "charArrayOf()\n" +
                    "\n" +
                    "shortArrayOf()\n" +
                    "\n" +
                    "longArrayOf()\n" +
                    "\n" +
                    "Massiv elementlarini oling va o'rnating\n" +
                    "Biz kvadrat qavs ichidagi indeks raqamidan foydalanib, massiv elementiga kira olamiz. Kotlin massivi indeksi noldan boshlanadi (0). Shunday qilib, agar siz massivning 4-elementiga kirishni istasangiz, indeks sifatida 3 ni berishingiz kerak bo'ladi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "  \n" +
                    "   println( fruits [0])\n" +
                    "   println( fruits [3])\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Apple\n" +
                    "Orange\n" +
                    "Kotlin, shuningdek, ma'lum bir indeksdagi qiymatni olish va o'rnatish uchun get() va set() a'zo funktsiyalarini ta'minlaydi. Quyidagi misolni tekshiring:\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "  \n" +
                    "   println( fruits.get(0))\n" +
                    "   println( fruits.get(3))\n" +
                    "   \n" +
                    "   // Set the value at 3rd index\n" +
                    "   fruits.set(3, \"Guava\")\n" +
                    "   println( fruits.get(3)) \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Apple\n" +
                    "Orange\n" +
                    "Guava\n" +
                    "Kotlin massivi uzunligi\n" +
                    "Kotlin massivning hajmini, ya'ni massiv uzunligini qaytaradigan size deb nomlangan massiv xususiyatini taqdim etadi .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "  \n" +
                    "   println( \"Size of fruits array \" + fruits.size )\n" +
                    "\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Size of fruits array 4\n" +
                    "Massiv hajmini olish uchun count() a'zo funksiyasidan ham foydalanishimiz mumkin .\n" +
                    "\n" +
                    "Massiv orqali aylanish\n" +
                    "Massiv bo‘ylab aylanish uchun for loop dan foydalanishimiz mumkin .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "  \n" +
                    "   for( item in fruits ){\n" +
                    "      println( item )\n" +
                    "   }\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Apple\n" +
                    "Mango\n" +
                    "Banana\n" +
                    "Orange\n" +
                    "Element mavjudligini tekshiring\n" +
                    "Massivda element mavjudligini tekshirish uchun in operatoridan if...else bilan birga foydalanishimiz mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\")\n" +
                    "  \n" +
                    "   if (\"Mango\" in fruits){\n" +
                    "      println( \"Mango exists in fruits\" )\n" +
                    "   }else{\n" +
                    "      println( \"Mango does not exist in fruits\" )\n" +
                    "   }\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Mango exists in fruits\n" +
                    "Massivdan farqli qiymatlar\n" +
                    "Kotlin massivda takroriy qiymatlarni saqlashga imkon beradi, lekin shu bilan birga distinct() a'zo funktsiyasidan foydalanib, massivda saqlangan aniq qiymatlar to'plamini olishingiz mumkin .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\", \"Apple\")\n" +
                    "   \n" +
                    "   val distinct = fruits.distinct()\n" +
                    "   for( item in distinct ){\n" +
                    "      println( item )\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Apple\n" +
                    "Mango\n" +
                    "Banana\n" +
                    "Orange\n" +
                    "Massivdan elementlarni tushirish\n" +
                    "Elementlarni mos ravishda boshidan yoki oxirgisidan tushirish uchun drop() yoki dropLast() a'zo funksiyalaridan foydalanishimiz mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>(\"Apple\", \"Mango\", \"Banana\", \"Orange\", \"Apple\")\n" +
                    "   \n" +
                    "   val result = fruits.drop(2) // drops first two elements.\n" +
                    "   for( item in result ){\n" +
                    "      println( item )\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Banana\n" +
                    "Orange\n" +
                    "Apple\n" +
                    "Bo'sh massivni tekshirish\n" +
                    "Massiv bo'sh yoki yo'qligini tekshirish uchun isEmpty() a'zo funktsiyasidan foydalanishimiz mumkin . Agar massiv bo'sh bo'lsa, bu funktsiya true qiymatini qaytaradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val fruits = arrayOf<String>()\n" +
                    "   println( \"Array is empty : \" + fruits.isEmpty())\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "\"Array is empty : true"),
        Lesson("Ranges",
            "Kotlin diapazoni ikkala so'nggi nuqta qiymati bilan belgilanadi, ularning ikkalasi ham diapazonga kiradi. Kotlin diapazonlari rangeTo() funksiyasi yordamida yoki oddiygina downTo yoki (. .) operatorlari yordamida yaratiladi. Diapazonlardagi asosiy operatsiya odatda in va !in operatorlari shaklida qo'llaniladigan ni o'z ichiga oladi .\n" +
                    "\n" +
                    "Misol\n" +
                    "1..10  // Range of integers starting from 1 to 10\n" +
                    "\n" +
                    "a..z   // Range of characters starting from a to z\n" +
                    "\n" +
                    "A..Z   // Range of capital characters starting from A to Z\n" +
                    "Diapazonning ikkala uchi ham har doim diapazonga kiritiladi, bu 1..4 ifodasi 1,2,3 va 4 qiymatlariga mos kelishini bildiradi.\n" +
                    "\n" +
                    "rangeTo() yordamida diapazonlarni yaratish\n" +
                    "Kotlin diapazonini yaratish uchun biz diapazonning boshlang'ich qiymatida rangeTo() funksiyasini chaqiramiz va yakuniy qiymatni argument sifatida taqdim etamiz.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in 1.rangeTo(4) ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    ".. Operator yordamida diapazonlarni yaratish\n" +
                    "rangeTo () odatda operator shaklida chaqiriladi .. . Shunday qilib, yuqoridagi kodni .. operatori yordamida quyidagi tarzda qayta yozish mumkin :\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in 1..4 ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "downTo() operatori yordamida diapazonlarni yaratish\n" +
                    "Agar biz orqaga qarab diapazonni aniqlamoqchi bo'lsak, downTo operatoridan foydalanishimiz mumkin:\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in 4 downTo 1 ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "4\n" +
                    "3\n" +
                    "2\n" +
                    "1\n" +
                    "Kotlin step() funktsiyasi\n" +
                    "Diapazon qiymatlari orasidagi masofani aniqlash uchun step() funksiyasidan foydalanishimiz mumkin . Keling, quyidagi misolni ko'rib chiqaylik:\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in 1..10 step 2 ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "3\n" +
                    "5\n" +
                    "7\n" +
                    "9\n" +
                    "Kotlin belgilar diapazoni\n" +
                    "Belgilar uchun diapazonlar yaratilishi mumkin, xuddi biz ularni butun sonlar uchun yaratganmiz.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( ch in 'a'..'d' ) {\n" +
                    "     println(ch)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "a\n" +
                    "b\n" +
                    "c\n" +
                    "d\n" +
                    "Kotlin reversed() funktsiyasi\n" +
                    "Reversed() funksiyasi diapazon qiymatlarini teskari o‘zgartirish uchun ishlatilishi mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in (1..5).reversed() ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "5\n" +
                    "4\n" +
                    "3\n" +
                    "2\n" +
                    "1\n" +
                    "Kotlin qadar() funktsiyasi\n" +
                    "To () funktsiyasi diapazon yaratish uchun ishlatilishi mumkin, lekin u berilgan oxirgi elementni o'tkazib yuboradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for ( num in 1 until 5 ) {\n" +
                    "     println(num)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "Oxirgi, birinchi, bosqichli elementlar\n" +
                    "Diapazonning birinchi, oxirgi qiymati yoki qadamini topish uchun diapazonning birinchi , oxirgi va qadam xususiyatlaridan foydalanishimiz mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   println((5..10).first)\n" +
                    "   println((5..10 step 2).step)\n" +
                    "   println((5..10).reversed().last)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "5\n" +
                    "2\n" +
                    "5\n" +
                    "Filtrlash diapazonlari\n" +
                    "filter() funktsiyasi berilgan predikatga mos keladigan elementlar ro'yxatini qaytaradi:\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 1..10\n" +
                    "   val f = a.filter { T -> T % 2 == 0 }\n" +
                    "   \n" +
                    "   println(f)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "[2, 4, 6, 8, 10]\n" +
                    "Diapazondagi alohida qiymatlar\n" +
                    "Distinct() funktsiyasi takroriy qiymatlarga ega bo'lgan diapazondan alohida qiymatlar ro'yxatini qaytaradi:\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = listOf(1, 1, 2, 4, 4, 6, 10)\n" +
                    "   \n" +
                    "   println(a.distinct())\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "[1, 2, 4, 6, 10]\n" +
                    "Range Utility Funksiyalari\n" +
                    "Bizning diapazonimizga qo'llashimiz mumkin bo'lgan boshqa ko'plab foydali funktsiyalar mavjud, masalan, min , max , sum , o'rtacha , count :\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 1..10\n" +
                    "   \n" +
                    "   println(a.min())\n" +
                    "   println(a.max())\n" +
                    "   println(a.sum())\n" +
                    "   println(a.average())\n" +
                    "   println(a.count())\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "10\n" +
                    "55\n" +
                    "5.5\n" +
                    "10"),
        Lesson("Functions",
            "Kotlin statik tarzda yozilgan tildir, shuning uchun unda funktsiyalar katta rol o'ynaydi. Biz funktsiyani yaxshi bilamiz, chunki biz oxirgi boblarimizdagi misollarimizda funksiyadan foydalanamiz. Funktsiya ma'lum bir vazifani bajarish uchun yozilgan kod blokidir. Funktsiyalar barcha zamonaviy dasturlash tillari tomonidan qo'llab-quvvatlanadi va ular usullar yoki pastki dasturlar sifatida ham tanilgan .\n" +
                    "\n" +
                    "Keng darajada, funktsiya parametrlar deb ataladigan ba'zi ma'lumotlarni oladi , ushbu kirishlar bo'yicha ma'lum harakatlarni bajaradi va nihoyat qiymatni qaytaradi.\n" +
                    "\n" +
                    "Kotlin o'rnatilgan funktsiyalari\n" +
                    "Kotlin bir qator o'rnatilgan funktsiyalarni taqdim etadi, biz misollarimizda bir qator o'rnatilgan funktsiyalardan foydalanganmiz. Masalan, print() va println() eng ko'p ishlatiladigan o'rnatilgan funksiya bo'lib, biz chiqishni ekranga chop etish uchun foydalanamiz.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   println(\"Hello, World!\")\n" +
                    "}\n" +
                    "Foydalanuvchi tomonidan belgilangan funksiyalar\n" +
                    "Kotlin bizga fun kalit so'zidan foydalanib, o'z funksiyamizni yaratishga imkon beradi . Foydalanuvchi tomonidan belgilangan funktsiya bir yoki bir nechta parametrlarni oladi, amalni bajaradi va bu harakat natijasini qiymat sifatida qaytaradi.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "fun functionName(){  \n" +
                    "   // body of function \n" +
                    "}  \n" +
                    "Biz funktsiyani aniqlaganimizdan so'ng, biz unga kerak bo'lganda uni istalgan ko'p marta chaqirishimiz mumkin. Kotlin funksiyasini chaqirish uchun quyidagi oddiy sintaksis mavjud:\n" +
                    "\n" +
                    "functionName()\n" +
                    "Misol\n" +
                    "Quyida oddiy “Salom, dunyo!” ni chop etadigan foydalanuvchi tomonidan belgilangan funksiyani aniqlash va chaqirish misoli keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   printHello()\n" +
                    "   \n" +
                    "}\n" +
                    "\n" +
                    "fun printHello(){\n" +
                    "   println(\"Hello, World!\")\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Hello, World!\n" +
                    "Funktsiya parametrlari\n" +
                    "Foydalanuvchi tomonidan belgilangan funksiya nol yoki undan ortiq parametrlarni qabul qilishi mumkin. Parametrlar variantlar bo'lib, talabga qarab ishlatilishi mumkin. Masalan, yuqorida tavsiflangan funksiyamiz hech qanday parametrdan foydalanmagan.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida berilgan ikkita raqamni qo'shadigan va ularning yig'indisini chop etadigan foydalanuvchi tomonidan belgilangan funksiyani yozishga misol keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 10\n" +
                    "   val b = 20\n" +
                    "   \n" +
                    "   printSum(a, b)\n" +
                    "   \n" +
                    "}\n" +
                    "\n" +
                    "fun printSum(a:Int, b:Int){\n" +
                    "\n" +
                    "   println(a + b)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "30\n" +
                    "Qaytish qiymatlari\n" +
                    "Kotlin funktsiyasi talabga asoslangan qiymatni qaytaradi. Yana qiymatni qaytarish juda ixtiyoriy.\n" +
                    "\n" +
                    "Qiymatni qaytarish uchun return kalit so'zidan foydalaning va funktsiya parantezlaridan keyin qaytish turini belgilang\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida berilgan ikkita raqamni qo'shadigan va yig'indini qaytaradigan foydalanuvchi tomonidan belgilangan funktsiyani yozishga misol keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 10\n" +
                    "   val b = 20\n" +
                    "   \n" +
                    "   val result = sumTwo(a, b)\n" +
                    "   println( result )\n" +
                    "   \n" +
                    "}\n" +
                    "\n" +
                    "fun sumTwo(a:Int, b:Int):Int{\n" +
                    "   val x = a + b\n" +
                    "   \n" +
                    "   return x\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "30\n" +
                    "Birlikni qaytaruvchi funksiyalar\n" +
                    "Agar funktsiya foydali qiymatni qaytarmasa, uning qaytish turi Unit hisoblanadi . Birlik faqat bitta qiymatga ega bo'lgan birlikdir .\n" +
                    "\n" +
                    "fun sumTwo(a:Int, b:Int):Unit{\n" +
                    "   val x = a + b\n" +
                    "   \n" +
                    "   println( x )\n" +
                    "}\n" +
                    "Birlikni qaytarish turi deklaratsiyasi ham ixtiyoriydir. Yuqoridagi kod quyidagiga teng:\n" +
                    "\n" +
                    "fun sumTwo(a:Int, b:Int){\n" +
                    "   val x = a + b\n" +
                    "   \n" +
                    "   println( x )\n" +
                    "}\n" +
                    "Kotlin rekursiv funktsiyasi\n" +
                    "Rekursiya funktsiyalari ko'p sahnalarda foydalidir, masalan, sonning faktorialini hisoblash yoki Fibonachchi seriyasini yaratish. Kotlin rekursiyani qo'llab-quvvatlaydi, ya'ni Kotlin funktsiyasi o'zini chaqirishi mumkin.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "fun functionName(){  \n" +
                    "   ...\n" +
                    "   functionName()\n" +
                    "   ...\n" +
                    "}  \n" +
                    "Misol\n" +
                    "Quyida 10 raqamining faktorialini hisoblash uchun Kotlin dasturi keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 4\n" +
                    "   \n" +
                    "   val result = factorial(a)\n" +
                    "   println( result )\n" +
                    "   \n" +
                    "}\n" +
                    "\n" +
                    "fun factorial(a:Int):Int{\n" +
                    "   val result:Int\n" +
                    "   \n" +
                    "   if( a <= 1){\n" +
                    "      result = a\n" +
                    "   }else{\n" +
                    "      result = a*factorial(a-1)\n" +
                    "   }\n" +
                    "   \n" +
                    "   return result\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "24\n" +
                    "Kotlin quyruq rekursiyasi\n" +
                    "Rekursiv funktsiya, agar funktsiyaning o'ziga chaqiruvi u bajaradigan oxirgi operatsiya bo'lsa, quyruq rekursiyasiga mos keladi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida quyruq rekursiyasi yordamida 10 raqamining faktorialini hisoblash uchun Kotlin dasturi keltirilgan. Bu erda ko'paytirishning keyin emas, balki rekursiv chaqiruvdan oldin bajarilishini ta'minlashimiz kerak.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val a = 4\n" +
                    "   \n" +
                    "   val result = factorial(a)\n" +
                    "   println( result )\n" +
                    "   \n" +
                    "}\n" +
                    "\n" +
                    "fun factorial(a: Int, accum: Int = 1): Int {\n" +
                    "    val result = a * accum\n" +
                    "    return if (a <= 1) {\n" +
                    "        result\n" +
                    "    } else {\n" +
                    "        factorial(a - 1, result)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "24\n" +
                    "Kotlin quyruq rekursiyasi katta sonlarda faktorial yoki boshqa qayta ishlashni hisoblashda foydalidir. Shunday qilib, java.lang.StackOverflowError dan qochish uchun siz quyruq rekursiyasidan foydalanishingiz kerak.\n" +
                    "Yuqori darajali funktsiyalar\n" +
                    "Yuqori tartibli funksiya boshqa funktsiyani parametr sifatida qabul qiladigan va/yoki funksiyani qaytaradigan funksiyadir.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida a va b butun son parametrlarini oladigan funksiya va qoʻshimcha ravishda parametr sifatida boshqa funksiya amalini oladi :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   \n" +
                    "   val result = calculate(4, 5, ::sum) \n" +
                    "   println( result )\n" +
                    "   \n" +
                    "}\n" +
                    "fun sum(a: Int, b: Int) = a + b \n" +
                    "\n" +
                    "fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {\n" +
                    "    return operation(a, b)                                       \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "9\n" +
                    "Bu erda biz ikkita butun qiymatdan o'tuvchi yuqori tartibli funktsiyani va funktsiya argumentini ::sum deb ataymiz . Bu erda :: Kotlindagi funktsiya nomiga ishora qiluvchi belgi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Funktsiya boshqa funktsiyani qaytaradigan yana bir misolni ko'rib chiqaylik. Bu erda biz funktsiyani qaytaradigan yuqori tartibli funktsiyani aniqladik. Bu yerda (Int) -> Int kvadrat funksiyaning parametrlari va qaytish turini ifodalaydi .\n" +
                    "\n" +
                    "fun main(args: Array<String>) { \n" +
                    "   val func = operation() \n" +
                    "   println( func(4) )\n" +
                    "   \n" +
                    "}\n" +
                    "fun square(x: Int) = x * x\n" +
                    "\n" +
                    "fun operation(): (Int) -> Int {\n" +
                    "    return ::square                                       \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "9\n" +
                    "Kotlin Lambda funktsiyasi\n" +
                    "Kotlin lambda - bu nomga ega bo'lmagan va jingalak qavslar bilan belgilangan {} nol yoki undan ortiq parametr va funktsiya tanasini qabul qiladigan funksiya.\n" +
                    "\n" +
                    "Funksiya tanasi oʻzgaruvchidan (agar mavjud boʻlsa) keyin -> operatoridan keyin yoziladi.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "{variable with type -> body of the function}  \n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) { \n" +
                    "\n" +
                    "   val upperCase = { str: String -> str.toUpperCase() }  \n" +
                    "\n" +
                    "   println( upperCase(\"hello, world!\") )\n" +
                    "   \n" +
                    "}                           \n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "HELLO, WORLD!\n" +
                    "Kotlin Inline funktsiyasi\n" +
                    "Inline funktsiyasi inline kalit so'zi bilan e'lon qilinadi . Inline funksiyasidan foydalanish yuqori tartibli funksiyaning ishlashini oshiradi. Inline funksiyasi kompilyatorga parametrlar va funksiyalarni qo'ng'iroq qilish saytiga nusxalashni aytadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) { \n" +
                    "\n" +
                    "   myFunction({println(\"Inline function parameter\")})\n" +
                    "   \n" +
                    "}\n" +
                    "inline fun myFunction(function:()-> Unit){\n" +
                    "   println(\"I am inline function - A\")\n" +
                    "\n" +
                    "   function()\n" +
                    "   \n" +
                    "   println(\"I am inline function - B\")\n" +
                    "}                               \n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am inline function - A\n" +
                    "Inline function parameter\n" +
                    "I am inline function - B"),
        Lesson("Control Flow", ""),
        Lesson("if.. Else Expression",
            "Kotlin if...else iboralari boshqa har qanday zamonaviy kompyuter dasturlashda if ...else ifodasi kabi ishlaydi . Shunday qilib, keling, Kotlinda mavjud bo'lgan an'anaviy if...else bayonotidan boshlaylik.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "An'anaviy if...else ifodasining sintaksisi quyidagicha:\n" +
                    "\n" +
                    "if (condition) {\n" +
                    "   // code block A to be executed if condition is true\n" +
                    "} else {\n" +
                    "  // code block B to be executed if condition is false\n" +
                    "}\n" +
                    "Bu yerda if operatori bajariladi va berilgan shart tekshiriladi. Agar bu shart rost deb baholansa, A kod bloki bajariladi, aks holda dastur boshqa qismga o'tadi va B kod bloki bajariladi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Siz quyidagi misolni sinab ko'rishingiz mumkin:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 10\n" +
                    "\n" +
                    "    if (age > 18) {\n" +
                    "        print(\"Adult\")\n" +
                    "    } else {\n" +
                    "        print(\"Minor\")\n" +
                    "    }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Minor\n" +
                    "Kotlin if...else ifodasi\n" +
                    "Kotlin if...else qiymatini qaytaruvchi ifoda sifatida ham foydalanish mumkin va bu qiymat o'zgaruvchiga tayinlanishi mumkin. Quyida Kotlin if...else iborasining oddiy sintaksisi keltirilgan :\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "val result = if (condition) {\n" +
                    "   // code block A to be executed if condition is true\n" +
                    "} else {\n" +
                    "  // code block B to be executed if condition is false\n" +
                    "}\n" +
                    "If dan foydalanayotgan bo'lsangiz, masalan, uning qiymatini qaytarish yoki o'zgaruvchiga tayinlash uchun, else filiali majburiydir.\n" +
                    "\n" +
                    "Misollar\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 10\n" +
                    "\n" +
                    "    val result = if (age > 18) {\n" +
                    "        \"Adult\"\n" +
                    "    } else {\n" +
                    "        \"Minor\"\n" +
                    "    }\n" +
                    "    println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Minor\n" +
                    "Agar faqat bitta gap bo'lsa, { } jingalak qavslarni o'tkazib yuborishingiz mumkin :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 10\n" +
                    "\n" +
                    "    val result = if (age > 18) \"Adult\" else  \"Minor\"\n" +
                    "    println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Minor\n" +
                    "If...else blokiga bir nechta iboralarni kiritishingiz mumkin , bu holda oxirgi ifoda blokning qiymati sifatida qaytariladi. Quyidagi misolni sinab ko'ring:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 10\n" +
                    "\n" +
                    "    val result = if (age > 18) {\n" +
                    "        println(\"Given condition is true\")\n" +
                    "        \"Adult\"\n" +
                    "    } else {\n" +
                    "        println(\"Given condition is false\")\n" +
                    "        \"Minor\"\n" +
                    "    }\n" +
                    "    print(\"The value of result : \")\n" +
                    "    println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Given condition is false\n" +
                    "The value of result : Minor\n" +
                    "Kotlin agar... bo'lmasa... narvon bo'lsa\n" +
                    "Agar birinchi shart noto'g'ri bo'lsa, yangi shartni belgilash uchun else if shartidan foydalanishingiz mumkin .\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "if (condition1) {\n" +
                    "  // code block A to be executed if condition1 is true\n" +
                    "} else if (condition2) {\n" +
                    "  // code block B to be executed if condition2 is true\n" +
                    "} else {\n" +
                    "  // code block C to be executed if condition1 and condition2 are false\n" +
                    "}\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 13\n" +
                    "\n" +
                    "    val result = if (age > 19) {\n" +
                    "        \"Adult\"\n" +
                    "    } else if ( age > 12 && age  < 20 ){\n" +
                    "        \"Teen\"\n" +
                    "    } else {\n" +
                    "        \"Minor\"\n" +
                    "    }\n" +
                    "    print(\"The value of result : \")\n" +
                    "    println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "The value of result : Teen\n" +
                    "Kotlin Nested if Expression\n" +
                    "Kotlin if ifodasini boshqa if ifodasi ichiga qo'yish imkonini beradi . Bu ichki ifoda deyiladi\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "if(condition1) {\n" +
                    "   // code block A to be executed if condition1 is true\n" +
                    "   if( (condition2) {\n" +
                    "      // code block B to be executed if condition2 is true\n" +
                    "   }else{\n" +
                    "      // code block C to be executed if condition2 is fals\n" +
                    "   }\n" +
                    "} else {\n" +
                    "  // code block D to be executed if condition1 is false\n" +
                    "}\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    val age:Int = 20 \n" +
                    "\n" +
                    "    val result = if (age > 12) {\n" +
                    "       if ( age > 12 && age  < 20 ){\n" +
                    "           \"Teen\"\n" +
                    "       }else{\n" +
                    "           \"Adult\"\n" +
                    "       }\n" +
                    "    } else {\n" +
                    "        \"Minor\"\n" +
                    "    }\n" +
                    "    print(\"The value of result : \")\n" +
                    "    println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "The value of result : Adult"),
        Lesson("When Expression",
            "Tekshirish uchun juda ko'p shartlar mavjud bo'lgan vaziyatni ko'rib chiqing. Vaziyatni hal qilish uchun if..else if iborasidan foydalanishingiz mumkin bo'lsa-da , lekin Kotlin vaziyatni yaxshiroq hal qilish uchun qachon ifodasini beradi. If...else if iboralarini yozishga nisbatan when iborasidan foydalanish ancha oson va toza . Kotlin ifoda quyidagi misolda tushuntirilganidek ko'plab alternativalar orasida kod qismini baholaganda .\n" +
                    "\n" +
                    "Kotlin o'z argumentini barcha shoxlarga qarshi ketma-ketlik bilan moslashtirganda, ba'zi bir filial sharti qondirilmaguncha.\n" +
                    "\n" +
                    "Kotlin ifodasi C, C++ va Java- dagi switch bayonotiga o'xshash bo'lsa .\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val day = 2\n" +
                    "\n" +
                    "   val result = when (day) {\n" +
                    "     1 -> \"Monday\"\n" +
                    "     2 -> \"Tuesday\"\n" +
                    "     3 -> \"Wednesday\"\n" +
                    "     4 -> \"Thursday\"\n" +
                    "     5 -> \"Friday\"\n" +
                    "     6 -> \"Saturday\"\n" +
                    "     7 -> \"Sunday\"\n" +
                    "     else -> \"Invalid day.\"\n" +
                    "   }\n" +
                    "   println(result)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Tuesday\n" +
                    "Kotlin qachon Bayonot sifatida\n" +
                    "Kotlin qachon ifoda sifatida yoki ifoda sifatida ishlatilishi mumkin, xuddi Java-dagi switch iborasi kabi. Agar u ifoda sifatida ishlatilsa, birinchi mos keladigan filialning qiymati umumiy ifodaning qiymatiga aylanadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Yuqoridagi misolni ifoda shaklidan foydalanmasdan yana bir bor yozamiz:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val day = 2\n" +
                    "\n" +
                    "   when (day) {\n" +
                    "     1 -> println(\"Monday\")\n" +
                    "     2 -> println(\"Tuesday\")\n" +
                    "     3 -> println(\"Wednesday\")\n" +
                    "     4 -> println(\"Thursday\")\n" +
                    "     5 -> println(\"Friday\")\n" +
                    "     6 -> println(\"Saturday\")\n" +
                    "     7 -> println(\"Sunday\")\n" +
                    "     else -> println(\"Invalid day.\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Tuesday\n" +
                    "Shartlar qachon birlashtiring\n" +
                    "Biz bir nechta shartlarni bitta shartga birlashtira olamiz .\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val day = 2\n" +
                    "\n" +
                    "   when (day) {\n" +
                    "     1, 2, 3, 4, 5 -> println(\"Weekday\")\n" +
                    "     else -> println(\"Weekend\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Weekday\n" +
                    "Qachon shartlar oralig'i\n" +
                    "Kotlin diapazonlari qo'sh nuqtalar yordamida yaratilgan .. va biz ulardan qachon holatini tekshirishda in operatori yordamida foydalanishimiz mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val day = 2\n" +
                    "\n" +
                    "   when (day) {\n" +
                    "     in 1..5 -> println(\"Weekday\")\n" +
                    "     else -> println(\"Weekend\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Weekday\n" +
                    "Qachon shartlaridagi ifoda\n" +
                    "Kotlin qachon filial sharti sifatida doimiy o'rniga ixtiyoriy ifodalardan foydalanishi mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val x = 20\n" +
                    "   val y = 10\n" +
                    "   val z = 10\n" +
                    "   \n" +
                    "   when (x) {\n" +
                    "      (y+z) -> print(\"y + z = x = x\")\n" +
                    "      else -> print(\"Condition is not satisfied\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "y + z = x = 20\n" +
                    "Kotlin kod bloki bilan\n" +
                    "Kotlin qachon braxlar jingalak qavslar ichiga olingan kod bloki sifatida qo'yilishi mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val day = 2\n" +
                    "\n" +
                    "   when (day) {\n" +
                    "     1 -> {\n" +
                    "        println(\"First day of the week\")\n" +
                    "        println(\"Monday\")\n" +
                    "     }\n" +
                    "     2 -> {\n" +
                    "        println(\"Second day of the week\")\n" +
                    "        println(\"Tuesday\")\n" +
                    "     }\n" +
                    "     3 -> {\n" +
                    "        println(\"Third day of the week\")\n" +
                    "        println(\"Wednesday\")\n" +
                    "     }\n" +
                    "     4 -> println(\"Thursday\")\n" +
                    "     5 -> println(\"Friday\")\n" +
                    "     6 -> println(\"Saturday\")\n" +
                    "     7 -> println(\"Sunday\")\n" +
                    "     else -> println(\"Invalid day.\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Second day of the week\n" +
                    "Tuesday"),
        Lesson("For Loop",
            "Looplar nima?\n" +
                    "Ekranda jumlani 20 marta chop etishingiz kerak bo'lgan vaziyatni tasavvur qiling. Buni chop etish bayonotidan 20 marta ishlatishingiz mumkin. Agar bir xil jumlani ming marta chop etish kerak bo'lsa-chi? Bu erda dasturlash ishini soddalashtirish uchun looplardan foydalanishimiz kerak. Aslida, Looplar dasturlashda ma'lum bir shart bajarilmaguncha ma'lum bir kod blokini takrorlash uchun ishlatiladi.\n" +
                    "\n" +
                    "Kotlin har xil turdagi halqalarni qo'llab-quvvatlaydi va bu bobda biz Kotlin for loopni o'rganamiz.\n" +
                    "\n" +
                    "Kotlin uchun Loop\n" +
                    "Kotlin for loop iteratorni ta'minlaydigan har qanday narsani takrorlaydi, ya'ni. u ko'p sonli qiymatlarni o'z ichiga oladi, masalan, massivlar, diapazonlar, xaritalar yoki Kotlinda mavjud bo'lgan boshqa to'plamlar. Kotlin for loop C# kabi tillarda foreach sikliga ekvivalentdir .\n" +
                    "\n" +
                    "Kotlin C, C++ va Java va boshqalarda mavjud bo'lgan an'anaviy for tsiklini ta'minlamaydi.\n" +
                    "Sintaksis\n" +
                    "Kotlin for tsiklining sintaksisi quyidagicha:\n" +
                    "\n" +
                    "for (item in collection) {\n" +
                    "    // body of loop\n" +
                    "}\n" +
                    "Diapazon boʻylab takrorlash\n" +
                    "Biz Kotlin diapazonlarini alohida bobda o‘rganamiz, hozir shuni bilishingiz kerakki, Kotlin diapazonlari iteratorni ta’minlaydi, shuning uchun biz for loop yordamida diapazonni takrorlashimiz mumkin.\n" +
                    "\n" +
                    "Quyida sikl diapazon bo'ylab takrorlanadigan va alohida elementni chop etadigan misol keltirilgan. Bir qator raqamlarni takrorlash uchun biz diapazon ifodasidan foydalanamiz:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for (item in 1..5) {\n" +
                    "      println(item)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "Keling, yana bir misolni ko'rib chiqaylik, bu erda tsikl boshqa diapazon bo'ylab takrorlanadi, lekin bu safar u yuqoridagi misoldagidek qadam tashlash o'rniga pastga tushadi:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   for (item in 5 downTo 1 step 2) {\n" +
                    "      println(item)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "5\n" +
                    "3\n" +
                    "1\n" +
                    "Massiv orqali takrorlash\n" +
                    "Kotlin massivi iteratorni ta'minlovchi boshqa ma'lumotlar turidir, shuning uchun biz diapazonlar uchun qilganimizdek, Kotlin massivi orqali takrorlash uchun for loopidan foydalanishimiz mumkin.\n" +
                    "\n" +
                    "Quyida biz qatorlar qatorini takrorlash uchun for loop dan foydalangan misol keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var fruits = arrayOf(\"Orange\", \"Apple\", \"Mango\", \"Banana\")\n" +
                    "   \n" +
                    "   for (item in fruits) {\n" +
                    "      println(item)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Orange\n" +
                    "Apple\n" +
                    "Mango\n" +
                    "Banana\n" +
                    "Keling, xuddi shu misolni yana bir bor ko'rib chiqaylik, lekin bu safar biz uning indeksidan foydalangan holda massivni takrorlaymiz.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var fruits = arrayOf(\"Orange\", \"Apple\", \"Mango\", \"Banana\")\n" +
                    "   \n" +
                    "   for (index in fruits.indices) {\n" +
                    "      println(fruits[index])\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Orange\n" +
                    "Apple\n" +
                    "Mango\n" +
                    "Banana"),
        Lesson("While Loop",
            "Kotlin while loop belgilangan shart rost bo'lsa , o'z tanasini doimiy ravishda bajaradi .\n" +
                    "\n" +
                    "Kotlin while loopi Java while loopiga o'xshaydi.\n" +
                    "Sintaksis\n" +
                    "Kotlin while siklining sintaksisi quyidagicha:\n" +
                    "\n" +
                    "while (condition) {\n" +
                    "    // body of the loop\n" +
                    "}\n" +
                    "Kotlin dasturi while sikliga yetib borgach, berilgan shartni tekshiradi , agar berilgan shart rost bo'lsa, tsiklning tanasi bajariladi, aks holda dastur while siklining tanasidan keyin mavjud bo'lgan kodni bajarishni boshlaydi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida i hisoblagich o'zgaruvchisi 0 dan katta bo'lsa, while tsikli sikl tanasini bajarishda davom etadigan misol:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var i = 5;\n" +
                    "   while (i > 0) {\n" +
                    "      println(i)\n" +
                    "      i--\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "5\n" +
                    "4\n" +
                    "3\n" +
                    "2\n" +
                    "1\n" +
                    "Kotlin do... while Loop\n" +
                    "do..while ning while sikliga o'xshash bo'lib, farqi shundaki, bu sikl shartning to'g'ri yoki yo'qligini tekshirishdan oldin kod blokini bir marta bajaradi, so'ngra shart to'g'ri bo'lsa, u tsiklni takrorlaydi.\n" +
                    "\n" +
                    "Shart noto'g'ri bo'lsa ham, tsikl har doim kamida bir marta bajariladi, chunki kod bloki shart sinovdan oldin bajariladi.\n" +
                    "Sintaksis\n" +
                    "Kotlin do...while siklining sintaksisi quyidagicha:\n" +
                    "\n" +
                    "do{\n" +
                    "    // body of the loop\n" +
                    "}while( condition )\n" +
                    "Kotlin dasturi do...while tsikliga yetganda , u to'g'ridan-to'g'ri tsiklning tanasiga kiradi va berilgan shartni tekshirishdan oldin mavjud kodni bajaradi. Agar berilgan shartni rost deb topsa, u halqa tanasining bajarilishini takrorlaydi va berilgan shart rost ekan, davom etadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida do...while siklining i hisoblagich o‘zgaruvchisi 0 dan katta bo‘lsa, sikl tanasini bajarishda davom etadigan misol keltirilgan:\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var i = 5;\n" +
                    "   do{\n" +
                    "      println(i)\n" +
                    "      i--\n" +
                    "   }while(i > 0)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "5\n" +
                    "4\n" +
                    "3\n" +
                    "2\n" +
                    "1"),
        Lesson("Break and Continue",
            "Kotlin Break bayonoti\n" +
                    "Kotlin break bayonoti ma'lum bir shart bajarilgandan keyin tsikldan chiqish uchun ishlatiladi. Bu sikl for , while yoki do...while boʻlishi mumkin .\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "Keling, har xil turdagi tsikllarni tugatish uchun sintaksisni tekshirib ko'ramiz:\n" +
                    "\n" +
                    "// Using break in for loop\n" +
                    "for (...) {\n" +
                    "   if(test){\n" +
                    "      break\n" +
                    "   } \n" +
                    "}\n" +
                    "\n" +
                    "// Using break in while loop\n" +
                    "while (condition) {\n" +
                    "   if(test){\n" +
                    "      break\n" +
                    "   } \n" +
                    "}\n" +
                    "\n" +
                    "// Using break in do...while loop\n" +
                    "do {\n" +
                    "   if(test){\n" +
                    "      break\n" +
                    "   } \n" +
                    "}while(condition)\n" +
                    "Agar test ifodasi rost deb baholansa, tsiklni tugatuvchi tanaffus bayoni bajariladi va dastur faqat tsikl bayonotidan keyin ishlashni davom ettiradi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Hisoblagich o'zgaruvchisi i qiymati 3 ga aylanganda while sikli tugaydigan misol quyida keltirilgan :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var i = 0;\n" +
                    "   while (i++ < 100) {\n" +
                    "      println(i)\n" +
                    "      if( i == 3 ){\n" +
                    "         break\n" +
                    "      }\n" +
                    "\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "Kotlin etiketli tanaffus bayonoti\n" +
                    "Kotlin yorlig'i identifikatorning shakli bo'lib, undan keyin @ belgisi keladi, masalan, test@ yoki tashqi @. Har qanday Kotlin ifodasini yorliqli qilish uchun ibora oldiga yorliq qo'yish kifoya.\n" +
                    "\n" +
                    "outerLoop@ for (i in 1..100) {\n" +
                    "    // ...\n" +
                    "}\n" +
                    "Kotlin bilan belgilangan break iborasi maxsus tsiklni tugatish uchun ishlatiladi. Bu @ belgisi bilan keyin yorliq nomi (break@LabelName) bilan tanaffus ifodasi yordamida amalga oshiriladi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    outerLoop@ for (i in 1..3) {  \n" +
                    "        innerLoop@ for (j in 1..3) {  \n" +
                    "            println(\"i = '$'i and j = '$'j\")  \n" +
                    "            if (i == 2){  \n" +
                    "                break@outerLoop\n" +
                    "            }  \n" +
                    "        }  \n" +
                    "    }  \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "i = 1 and j = 1\n" +
                    "i = 1 and j = 2\n" +
                    "i = 1 and j = 3\n" +
                    "i = 2 and j = 1\n" +
                    "Kotlin Davom etish bayonoti\n" +
                    "Kotlinning davom iborasi tsiklning takrorlanishini uzib qo'yadi (davam so'zi yonidagi qismni tsikl oxirigacha o'tkazib yuboradi) va tsikldagi keyingi iteratsiya bilan davom etadi.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "Keling, har xil turdagi tsikllarni tugatish uchun sintaksisni tekshirib ko'ramiz:\n" +
                    "\n" +
                    "// Using continue in for loop\n" +
                    "for (...) {\n" +
                    "   if(test){\n" +
                    "      continue\n" +
                    "   } \n" +
                    "}\n" +
                    "\n" +
                    "// Using continue in while loop\n" +
                    "while (condition) {\n" +
                    "   if(test){\n" +
                    "      continue\n" +
                    "   } \n" +
                    "}\n" +
                    "\n" +
                    "// Using continue in do...while loop\n" +
                    "do {\n" +
                    "   if(test){\n" +
                    "      continue\n" +
                    "   } \n" +
                    "}while(condition)\n" +
                    "Agar test ifodasi rost deb baholansa, tsiklning qolgan qismini o'tkazib yuboradigan va sikl bayonotining keyingi iteratsiyasiga o'tadigan davom iborasi bajariladi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida i o‘zgaruvchisi qiymati 3 bo‘lganda while sikli chop etishni o‘tkazib yuboradigan misol keltirilgan :\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var i = 0;\n" +
                    "   while (i++ < 6) {\n" +
                    "      if( i == 3 ){\n" +
                    "         continue\n" +
                    "      }\n" +
                    "      println(i)\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "1\n" +
                    "2\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "Kotlin etiketli Davom etish bayonoti\n" +
                    "Kotlin yorlig'i bilan belgilangan davom iborasi ma'lum bir tsiklning bir qismini o'tkazib yuborish uchun ishlatiladi. Bu @ belgisi va yorliq nomi (continue@LabelName) bilan davom etuvchi ifoda yordamida amalga oshiriladi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "    outerLoop@ for (i in 1..3) {  \n" +
                    "        innerLoop@ for (j in 1..3) {  \n" +
                    "            if (i == 2){  \n" +
                    "                continue@outerLoop\n" +
                    "            }\n" +
                    "            println(\"i = '$'i and j = '$'j\")   \n" +
                    "        }  \n" +
                    "    }  \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "i = 1 and j = 1\n" +
                    "i = 1 and j = 2\n" +
                    "i = 1 and j = 3\n" +
                    "i = 3 and j = 1\n" +
                    "i = 3 and j = 2\n" +
                    "i = 3 and j = 3"),
        Lesson("Collections",
            "To'plamlar ko'pchilik dasturlash tillari uchun umumiy tushunchadir. To'plam odatda bir xil turdagi ob'ektlarni o'z ichiga oladi va to'plamdagi ob'ektlar elementlar yoki elementlar deb ataladi.\n" +
                    "\n" +
                    "Kotlin standart kutubxonasi to'plamlarni boshqarish uchun keng qamrovli vositalar to'plamini taqdim etadi. Kotlin uchun quyidagi to'plam turlari tegishli:\n" +
                    "\n" +
                    "Kotlin ro'yxati - List - bu indekslar bo'yicha elementlarga kirish huquqiga ega tartiblangan to'plam. Elementlar roʻyxatda bir necha marta boʻlishi mumkin.\n" +
                    "\n" +
                    "Kotlin to'plami - to'plam - bu takroriy takrorlanmaydigan ob'ektlar guruhini bildiruvchi noyob elementlar to'plami.\n" +
                    "\n" +
                    "Kotlin xaritasi - Xarita (yoki lug'at) kalit-qiymat juftliklari to'plamidir. Kalitlar noyobdir va ularning har biri aynan bitta qiymatga mos keladi.\n" +
                    "\n" +
                    "Kotlin kolleksiyasi turlari\n" +
                    "Kotlin quyidagi turdagi to'plamlarni taqdim etadi:\n" +
                    "\n" +
                    "To'plam yoki o'zgarmas to'plam\n" +
                    "\n" +
                    "O'zgaruvchan to'plam\n" +
                    "\n" +
                    "Kotlin o'zgarmas to'plami\n" +
                    "O'zgarmas to'plam yoki oddiygina Collection interfeysini chaqirish faqat o'qish uchun mo'ljallangan usullarni taqdim etadi, ya'ni to'plam yaratilgandan keyin biz uni o'zgartira olmaymiz, chunki yaratilgan ob'ektni o'zgartirish uchun hech qanday usul mavjud emas.\n" +
                    "\n" +
                    "To'plam turlari\tO'zgarmas yig'ish usullari\n" +
                    "Roʻyxat\tlistOf()\n" +
                    "listOf<T>()\n" +
                    "Xarita\tmapOf()\n" +
                    "Oʻrnatish\tsetOf()\n" +
                    "Misol\n" +
                    "fun main() {\n" +
                    "    val numbers = listOf(\"one\", \"two\", \"three\", \"four\")\n" +
                    "    \n" +
                    "    println(numbers)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "[one, two, three, four]\n" +
                    "Kotlin o'zgaruvchan to'plami\n" +
                    "O'zgaruvchan to'plamlar o'qish va yozish usullarini ta'minlaydi.\n" +
                    "\n" +
                    "To'plam turlari\tO'zgarmas yig'ish usullari\n" +
                    "Roʻyxat\tArrayList<T>()\n" +
                    "arrayListOf()\n" +
                    "mutableListOf()\n" +
                    "Xarita\tHashMap\n" +
                    "hashMapOf()\n" +
                    "mutableMapOf()\n" +
                    "Oʻrnatish\thashSetOf()\n" +
                    "mutableSetOf()\n" +
                    "Misol\n" +
                    "fun main() {\n" +
                    "    val numbers = mutableListOf(\"one\", \"two\", \"three\", \"four\")\n" +
                    "    \n" +
                    "    numbers.add(\"five\")\n" +
                    "    \n" +
                    "    println(numbers)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "[one, two, three, four, five]"),
        Lesson("Class and Objects",
            "Kotlin ham funktsional, ham ob'ektga yo'naltirilgan dasturlashni qo'llab-quvvatlaydi. Kotlinning funktsional xususiyatlari haqida gapirganda, bizda Kotlinni funktsional til sifatida ifodalovchi funktsiyalar, yuqori darajadagi funktsiyalar va lambdalar kabi tushunchalar mavjud.\n" +
                    "\n" +
                    "Kotlin, shuningdek, Ob'ektga yo'naltirilgan dasturlashni (OOP) qo'llab-quvvatlaydi va abstraktsiya, inkapsulyatsiya, meros va hokazo kabi xususiyatlarni taqdim etadi. Ushbu qo'llanma sizga Kotlin OOPning barcha xususiyatlarini oddiy qadamlar bilan o'rgatadi.\n" +
                    "\n" +
                    "Ob'ektga yo'naltirilgan dasturlash (OOP) bizga ob'ektlardan foydalangan holda murakkab muammolarni hal qilish imkonini beradi.\n" +
                    "Kotlin sinflari\n" +
                    "Sinf - bu kerakli ob'ektlarni yaratish uchun ishlatiladigan shablonni belgilaydigan ob'ektlar rejasi.\n" +
                    "\n" +
                    "Sinflar har qanday ob'ektga yo'naltirilgan dasturlash tilining asosiy qurilish bloklari hisoblanadi. Kotlin klassi class kalit so'zi yordamida aniqlanadi . Quyida Kotlin sinfini yaratish sintaksisi keltirilgan:\n" +
                    "\n" +
                    "Kotlin sinf deklaratsiyasi Java Programmig dasturiga o'xshaydi, u sinf sarlavhasi va jingalak qavslar bilan o'ralgan sinf tanasidan iborat.\n" +
                    "class ClassName { // Class Header\n" +
                    "\n" +
                    "   //\n" +
                    "   // Variables or data members\n" +
                    "   // Member functions or Methods\n" +
                    "   //\n" +
                    "   ...\n" +
                    "   ...\n" +
                    "}\n" +
                    "Odatiy bo'lib, Kotlin sinflari ommaviydir va biz ko'rinishni o'zgartirish bo'limida o'rganadigan turli modifikatorlar yordamida sinf a'zolarining ko'rinishini nazorat qilishimiz mumkin .\n" +
                    "\n" +
                    "Kotlin ob'ektlari\n" +
                    "Ob'ektlar Kotlin sinfidan yaratilgan va ular mos ravishda ma'lumotlar a'zolari (xususiyatlari) va a'zo funktsiyalari (xulq-atvori) shaklida sinf tomonidan belgilangan umumiy xususiyatlar va xatti-harakatlarga ega.\n" +
                    "\n" +
                    "Klass ob'ektini e'lon qilish sintaksisi:\n" +
                    "\n" +
                    "var varName = ClassName()\n" +
                    "yordamida sinfning xossalari va usullariga kirishimiz mumkin . (nuqta) operatori quyida ko'rsatilganidek:\n" +
                    "\n" +
                    "var varName = ClassName()\n" +
                    "\n" +
                    "varName.property = <Value>\n" +
                    "varName.functionName()\n" +
                    "Misol\n" +
                    "Quyida biz bitta Kotlin sinfini va uning ob'ektini yaratadigan misol keltirilgan, bu orqali biz ushbu sinfning turli ma'lumotlar a'zolariga kirishimiz mumkin.\n" +
                    "\n" +
                    "class myClass {\n" +
                    "   // Property (data member)\n" +
                    "   private var name: String = \"Tutorialspoint.com\"\n" +
                    "\n" +
                    "   // Member function\n" +
                    "   fun printMe() {\n" +
                    "      print(\"The best Learning website - \" + name)\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj = myClass() // Create object obj of myClass class\n" +
                    "   obj.printMe() // Call a member function using object\n" +
                    "}\n" +
                    "Yuqoridagi kod qismi brauzerda quyidagi natijani beradi, bu erda biz o'zining obj ob'ekti yordamida myClassning printMe () usulini chaqiramiz .\n" +
                    "\n" +
                    "The best Learning website - Tutorialspoint.com\n" +
                    "Kotlin o'rnatilgan sinf\n" +
                    "Ta'rifga ko'ra, agar sinf boshqa sinf ichida yaratilgan bo'lsa, u ichki sinf deb ataladi .\n" +
                    "\n" +
                    "Kotlin o'rnatilgan sinf sukut bo'yicha statikdir, shuning uchun unga ushbu sinfning hech qanday ob'ektini yaratmasdan, lekin yordami bilan kirish mumkin . nuqta operatori. Shu bilan birga, biz ichki sinf ichidagi tashqi sinf a'zolariga kira olmaymiz.\n" +
                    "\n" +
                    "Quyida ichki sinf yaratish uchun oddiy sintaksis keltirilgan:\n" +
                    "\n" +
                    "class OuterClass{\n" +
                    "   // Members of Outer Class\n" +
                    "   class NestedClass{\n" +
                    "      // Members of Nested Class\n" +
                    "   }\n" +
                    "}\n" +
                    "Endi biz quyida joylashgan sinf ob'ektini yaratishimiz mumkin:\n" +
                    "\n" +
                    "val object = OuterClass.NestedClass()\n" +
                    "Misol\n" +
                    "Quyida Kotlin o'rnatilgan sinfni qanday izohlashini ko'rsatadigan misol keltirilgan.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj = Outer.Nested()\n" +
                    "\n" +
                    "   print(obj.foo())\n" +
                    "}\n" +
                    "class Outer {\n" +
                    "   class Nested {\n" +
                    "      fun foo() = \"Welcome to The TutorialsPoint.com\"\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Welcome to The TutorialsPoint.com\n" +
                    "Kotlin ichki sinfi\n" +
                    "Ichki sinf ichki kalit so'z bilan belgilangan bo'lsa, u Inner sinf deb ataladi . Ichki sinfga tashqi sinfning ma'lumotlar a'zosi kirishi mumkin.\n" +
                    "\n" +
                    "Ichki sinfdan farqli o'laroq, ichki sinf tashqi sinf a'zolariga kirishi mumkin. Biz to'g'ridan-to'g'ri ichki sinf ob'ektini yarata olmaymiz, lekin uni tashqi sinf ob'ekti yordamida yaratish mumkin.\n" +
                    "\n" +
                    "Quyida ichki sinf yaratish uchun oddiy sintaksis keltirilgan:\n" +
                    "\n" +
                    "class OuterClass{\n" +
                    "   // Members of Outer Class\n" +
                    "   class inner InnerClass{\n" +
                    "      // Members of Inner Class\n" +
                    "   }\n" +
                    "}\n" +
                    "Endi biz quyidagi kabi ichki sinf ob'ektini yaratishimiz mumkin:\n" +
                    "\n" +
                    "val outerObj = OuterClass()\n" +
                    "val innerObj = outerObj.InnerClass()\n" +
                    "Misol\n" +
                    "Quyida Kotlin ichki sinfni qanday izohlashini ko'rsatadigan misol keltirilgan.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj = Outer().Inner()\n" +
                    "\n" +
                    "   print(obj.foo())\n" +
                    "}\n" +
                    "class Outer {\n" +
                    "   private val welcomeMessage: String = \"Welcome to the TutorialsPoint.com\"\n" +
                    "   inner class Inner {\n" +
                    "      fun foo() = welcomeMessage\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Welcome to The TutorialsPoint.com\n" +
                    "Anonim ichki sinf\n" +
                    "Anonim ichki sinf - bu dasturchining hayotini juda osonlashtiradigan juda yaxshi tushuncha. Har doim interfeysni amalga oshirayotganimizda, anonim ichki blok tushunchasi rasmga tushadi. Ish vaqti ob'ektiga havola yordamida interfeys ob'ektini yaratish kontseptsiyasi anonim sinf sifatida tanilgan.\n" +
                    "\n" +
                    "Misol\n" +
                    "Quyida biz interfeysni qanday yaratishimiz va Anonim ichki sinf mexanizmidan foydalangan holda ushbu interfeys ob'ektini qanday yaratishimizni ko'rsatadigan misol keltirilgan.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var programmer :Human = object:Human { // Anonymous class\n" +
                    "      override fun think() { // overriding the think method\n" +
                    "         print(\"I am an example of Anonymous Inner Class \")\n" +
                    "      }\n" +
                    "   }\n" +
                    "   programmer.think()\n" +
                    "}\n" +
                    "interface Human {\n" +
                    "   fun think()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am an example of Anonymous Inner Class\n" +
                    "Kotlin turi taxalluslari\n" +
                    "Kotlin turi taxalluslari mavjud turga muqobil nom berish usulini bildiradi. Taxallus turi ko'proq o'qilishi mumkin bo'lgan kod yozishning toza usulini ta'minlaydi.\n" +
                    "\n" +
                    "Foydalanuvchining ismi, familiyasi va yoshi haqidagi ma'lumotni qaytaradigan quyidagi funktsiyani ko'rib chiqing:\n" +
                    "\n" +
                    "fun userInfo():Triple<String, String, Int>{\n" +
                    "   return Triple(\"Zara\",\"Ali\",21)\n" +
                    "}\n" +
                    "Endi biz berilgan Triple uchun taxallusni quyidagicha kiritishimiz mumkin:\n" +
                    "\n" +
                    "typealias User = Triple<String, String, Int>\n" +
                    "Nihoyat, yuqoridagi funktsiyani quyidagi tarzda yozish mumkin, bu yuqoridagi koddan ko'ra tozaroq ko'rinadi:\n" +
                    "\n" +
                    "fun userInfo():User{\n" +
                    "   return Triple(\"Zara\",\"Ali\",21)\n" +
                    "}\n" +
                    "Misol\n" +
                    "Quyida Kotlindagi taxallus turidan foydalanishni ko'rsatadigan to'liq ish misoli keltirilgan:\n" +
                    "\n" +
                    "typealias User = Triple<String, String, Int>\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    val obj = userInfo()\n" +
                    "\n" +
                    "    print(obj)\n" +
                    "}\n" +
                    "\n" +
                    "fun userInfo():User{\n" +
                    "   return Triple(\"Zara\",\"Ali\",21)\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "(Zara, Ali, 21)"),
        Lesson("Construction",
            "Kotlin konstruktori - bu ob'ekt yaratilganda chaqiriladigan sinfdagi maxsus a'zo funktsiyasi. Ob'ekt yaratilganda, belgilangan konstruktor avtomatik ravishda chaqiriladi va u sinf xususiyatlarini ishga tushirish uchun ishlatiladi.\n" +
                    "\n" +
                    "Har bir Kotlin sinfida konstruktor bo'lishi kerak va agar biz uni aniqlamasak, kompilyator standart konstruktorni yaratadi.\n" +
                    "Kotlin klassi quyidagi ikki turdagi konstruktorlarga ega bo'lishi mumkin:\n" +
                    "\n" +
                    "Asosiy konstruktor\n" +
                    "\n" +
                    "Ikkinchi konstruktorlar\n" +
                    "\n" +
                    "Kotlin klassi asosiy konstruktorga va bir yoki bir nechta qo'shimcha ikkilamchi konstruktorlarga ega bo'lishi mumkin. Kotlin asosiy konstruktori sinfni ishga tushiradi, ikkinchi darajali konstruktor esa sinfni ishga tushirishda qo'shimcha mantiqni kiritishga yordam beradi.\n" +
                    "\n" +
                    "Kotlin asosiy konstruktori\n" +
                    "Birlamchi konstruktor quyidagi misolda ko'rsatilganidek, sinf sarlavhasi darajasida e'lon qilinishi mumkin.\n" +
                    "\n" +
                    "class Person constructor(val firstName: String, val age: Int) {\n" +
                    "   // class body\n" +
                    "}\n" +
                    "Agar umumiy, xususiy yoki himoyalangan kabi izohlar yoki kirish oʻzgartirish moslamalari boʻlmasa, konstruktor kalit soʻzini oʻtkazib yuborish mumkin.\n" +
                    "\n" +
                    "class Person (val firstName: String, val age: Int) {\n" +
                    "   // class body\n" +
                    "}\n" +
                    "Ushbu misolda biz val kalit so'zi orqali xususiyatlarni faqat o'qish uchun e'lon qildik. Agar ularning qiymatlarini keyinroq o'zgartirish kerak bo'lsa, bu xususiyatlar var kalit so'zi yordamida aniqlanishi mumkin .\n" +
                    "\n" +
                    "Initializer bloki\n" +
                    "The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks prefixed with the init keyword. There could be more than one init blocks and during the initialization of an instance, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:\n" +
                    "\n" +
                    "Following is an example with a usage of initializer block:\n" +
                    "\n" +
                    "class Person (val _name: String, val _age: Int) {\n" +
                    "   // Member Variables\n" +
                    "   var name: String\n" +
                    "   var age: Int\n" +
                    "\n" +
                    "   // Initializer Block\n" +
                    "   init {\n" +
                    "      this.name = _name\n" +
                    "      this.age = _age\n" +
                    "      println(\"Name = $name\")\n" +
                    "      println(\"Age = $age\")\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val person = Person(\"Zara\", 20)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Name = Zara\n" +
                    "Age = 20\n" +
                    "Default Values\n" +
                    "Kotlin allows to initialize the constructor parameters with some default values. Following is a working example for the same:\n" +
                    "\n" +
                    "class Person (val _name: String, val _age: Int=20) {\n" +
                    "   // Member Variables\n" +
                    "   var name: String\n" +
                    "   var age: Int\n" +
                    "\n" +
                    "   // Initializer Block\n" +
                    "   init {\n" +
                    "      this.name = _name\n" +
                    "      this.age = _age\n" +
                    "      println(\"Name = $name\")\n" +
                    "      println(\"Age = $age\")\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val zara = Person(\"Zara\")\n" +
                    "   val nuha = Person(\"Nuha\", 11)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Name = Zara\n" +
                    "Age = 20\n" +
                    "Name = Nuha\n" +
                    "Age = 11\n" +
                    "Kotlin Secondary Constructor\n" +
                    "As mentioned earlier, Kotlin allows to create one or more secondary constructors for your class. This secondary constructor is created using the constructor keyword. It is required whenever you want to create more than one constructor in Kotlin or whenever you want to include more logic in the primary constructor and you cannot do that because the primary constructor may be called by some other class.\n" +
                    "\n" +
                    "Example\n" +
                    "Take a look at the following example, here we have created a secondary constructor to implement the above example once again:\n" +
                    "\n" +
                    "class Person{\n" +
                    "   // Member Variables\n" +
                    "   var name: String\n" +
                    "   var age: Int\n" +
                    "\n" +
                    "   // Initializer Block\n" +
                    "   init {\n" +
                    "      println(\"Initializer Block\")\n" +
                    "   }\n" +
                    "\n" +
                    "   // Secondary Constructor\n" +
                    "   constructor ( _name: String, _age: Int) {\n" +
                    "      this.name = _name\n" +
                    "      this.age = _age\n" +
                    "      println(\"Name = $name\")\n" +
                    "      println(\"Age = $age\")\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val zara = Person(\"Zara\", 20)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Initializer Block\n" +
                    "Name = Zara\n" +
                    "Age = 20\n" +
                    "Secondary constructor do not allow to use val or var with secondary constructor parameters. Now let's see one example with two secondary constructors:\n" +
                    "\n" +
                    "class Person{\n" +
                    "   // Member Variables\n" +
                    "   var name: String\n" +
                    "   var age: Int\n" +
                    "   var salary:Double\n" +
                    "\n" +
                    "   // First Secondary Constructor\n" +
                    "   constructor ( _name: String, _age: Int) {\n" +
                    "      this.name = _name\n" +
                    "      this.age = _age\n" +
                    "      this.salary = 0.00\n" +
                    "      println(\"Name = $name\")\n" +
                    "      println(\"Age = $age\")\n" +
                    "   }\n" +
                    "\n" +
                    "   // Second Secondary Constructor\n" +
                    "   constructor ( _name: String, _age: Int, _salary: Double) {\n" +
                    "      this.name = _name\n" +
                    "      this.age = _age\n" +
                    "      this.salary = _salary\n" +
                    "      println(\"Name = $name\")\n" +
                    "      println(\"Age = $age\")\n" +
                    "      println(\"Salary = '$'salary\")\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val nuha = Person(\"Nuha\", 12)\n" +
                    "   val zara = Person(\"Zara\", 20, 2000.00)\n" +
                    "}\n" +
                    "When you run the above Kotlin program, it will generate the following output:\n" +
                    "\n" +
                    "Name = Nuha\n" +
                    "Age = 12\n" +
                    "Name = Zara\n" +
                    "Age = 20\n" +
                    "Salary = 2000.0"),
        Lesson("Inheritance",
            "Merosni bir sinf boshqa sinfning a'zolarini (usullari va xususiyatlarini) olish jarayoni sifatida ta'riflanishi mumkin. Merosdan foydalangan holda ma'lumotlar ierarxik tartibda boshqariladi.\n" +
                    "\n" +
                    "Boshqa sinf a'zolarini meros qilib olgan sinf pastki sinf (hosil sinf yoki bola sinf) deb nomlanadi va a'zolari meros bo'lib o'tadigan sinf yuqori sinf (asosiy sinf yoki ota-ona sinf) deb nomlanadi.\n" +
                    "\n" +
                    "Meros ob'ektga yo'naltirilgan dasturlashning asosiy xususiyatlaridan biri bo'lib, foydalanuvchiga mavjud sinfdan yangi sinf yaratish imkonini beradi. Meros biz asosiy sinfdan barcha xususiyatlarni meros qilib olishimiz va o'ziga xos qo'shimcha xususiyatlarga ega bo'lishimiz mumkin.\n" +
                    "\n" +
                    "Kotlindagi barcha sinflar Any deb nomlangan umumiy supersinfga ega , bu supertiplar e'lon qilinmagan sinf uchun standart supersinfdir:\n" +
                    "\n" +
                    "class Example // Implicitly inherits from Any\n" +
                    "Kotlin superclass Any uchta usulga ega: equals() , hashCode() va toString() . Shunday qilib, bu usullar barcha Kotlin sinflari uchun aniqlanadi.\n" +
                    "\n" +
                    "Kotlindagi hamma narsa sukut bo'yicha finaldir , shuning uchun biz uni boshqa sinflar uchun meros qilib olish uchun sinf deklaratsiyasi oldida ochiq kalit so'zdan foydalanishimiz kerak. Kotlin sinfni meros qilib olish uchun \":\" operatoridan foydalanadi.\n" +
                    "\n" +
                    "Misol:\n" +
                    "Quyidagi meros misolini ko'rib chiqing.\n" +
                    "\n" +
                    "open class ABC {\n" +
                    "   fun think () {\n" +
                    "      println(\"Hey!! i am thiking \")\n" +
                    "   }\n" +
                    "}\n" +
                    "class BCD: ABC(){ // inheritence happend using default constructor \n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var  a = BCD()\n" +
                    "   a.think()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Hey!! i am thiking\n" +
                    "Qayta belgilash usullari\n" +
                    "Endi, agar biz bolalar sinfidagi think() usulini bekor qilmoqchi bo'lsak -chi? Keyin, biz ikkita sinf yaratayotgan va uning funksiyalaridan birini bolalar sinfiga bekor qiladigan quyidagi misolni ko'rib chiqishimiz kerak.\n" +
                    "\n" +
                    "open class ABC {\n" +
                    "   open fun think () {\n" +
                    "      println(\"Hey!! i am thinking \")\n" +
                    "   }\n" +
                    "}\n" +
                    "class BCD: ABC() { // inheritance happens using default constructor \n" +
                    "   override fun think() {\n" +
                    "      println(\"I am from Child\")\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var  a = BCD()\n" +
                    "   a.think()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am from Child\n" +
                    "Kalit so'zni bekor qilish bilan belgilangan a'zoning o'zi ochiq , shuning uchun u pastki sinflarda bekor qilinishi mumkin. Agar siz uni qayta belgilashni taqiqlamoqchi bo'lsangiz, uni quyidagicha yakunlashingiz kerak :\n" +
                    "\n" +
                    "class BCD: ABC() {\n" +
                    "   final override fun think() {\n" +
                    "      println(\"I am from Child\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Qayta belgilash xususiyatlari\n" +
                    "Qayta belgilash mexanizmi usullarda bo'lgani kabi xususiyatlarda ham ishlaydi. Yuqori sinfda e'lon qilingan va keyin hosil bo'lgan sinfda qayta e'lon qilinadigan xususiyatlar override kalit so'zi bilan oldindan yozilishi kerak va ular mos turga ega bo'lishi kerak.\n" +
                    "\n" +
                    "open class ABC {\n" +
                    "   open val count: Int = 0\n" +
                    "   \n" +
                    "   open fun think () {\n" +
                    "      println(\"Hey!! i am thinking \")\n" +
                    "   }\n" +
                    "}\n" +
                    "class BCD: ABC() {\n" +
                    "   override val count: Int\n" +
                    "   \n" +
                    "   init{\n" +
                    "      count = 100\n" +
                    "   }\n" +
                    "\n" +
                    "   override fun think() {\n" +
                    "      println(\"I am from Child\")\n" +
                    "   }\n" +
                    "   \n" +
                    "   fun displayCount(){\n" +
                    "      println(\"Count value is '$'count\")\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var  a = BCD()\n" +
                    "   a.displayCount()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Count value is 100\n" +
                    "Bundan tashqari, val xususiyatini var xususiyati bilan bekor qilishingiz mumkin, lekin aksincha emas. Bunga ruxsat berilgan, chunki val xossasi asosan get usulini e'lon qiladi va uni var sifatida bekor qilish qo'shimcha ravishda olingan sinfdagi to'siq usulini e'lon qiladi.\n" +
                    "Shuningdek, biz override kalit so'zidan asosiy konstruktorda mulk deklaratsiyasining bir qismi sifatida foydalanishimiz mumkin. Quyidagi misolda count xususiyatini bekor qilish uchun asosiy konstruktordan foydalaniladi , agar biz konstruktorga hech qanday qiymat bermasak, standart qiymat 400 sifatida qabul qilinadi:\n" +
                    "\n" +
                    "open class ABC {\n" +
                    "   open val count: Int = 0\n" +
                    "   \n" +
                    "   open fun think () {\n" +
                    "      println(\"Hey!! i am thinking \")\n" +
                    "   }\n" +
                    "}\n" +
                    "class BCD(override val count: Int = 400): ABC() {\n" +
                    "\n" +
                    "   override fun think() {\n" +
                    "      println(\"I am from Child\")\n" +
                    "   }\n" +
                    "   \n" +
                    "   fun displayCount(){\n" +
                    "      println(\"Count value is '$'count\")\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var a = BCD(200)\n" +
                    "   var b = BCD()\n" +
                    "   a.displayCount()\n" +
                    "   b.displayCount()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Count value is 200\n" +
                    "Count value is 400\n" +
                    "Olingan sinfni ishga tushirish tartibi\n" +
                    "Biz olingan sinf ob'ektini yaratganimizda, konstruktorni ishga tushirish asosiy sinfdan boshlanadi. Bu degani, birinchi navbatda, asosiy sinf xususiyatlari ishga tushiriladi, shundan so'ng har qanday hosila sinf o'qituvchisi chaqiriladi va xuddi shu narsa boshqa olingan sinflarga ham tegishli.\n" +
                    "\n" +
                    "Bu shuni anglatadiki, asosiy sinf konstruktori bajarilganda, olingan sinfda e'lon qilingan yoki bekor qilingan xususiyatlar hali ishga tushirilmagan.\n" +
                    "\n" +
                    "open class Base {\n" +
                    "   init{\n" +
                    "      println(\"I am in Base class\")\n" +
                    "   }\n" +
                    "}\n" +
                    "open class Child: Base() {\n" +
                    "   init{\n" +
                    "      println(\"I am in Child class\")\n" +
                    "   }\n" +
                    "}\n" +
                    "class GrandChild: Child() {\n" +
                    "   init{\n" +
                    "      println(\"I am in Grand Child class\")\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var a = GrandChild()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am in Base class\n" +
                    "I am in Child class\n" +
                    "I am in Grand Child class\n" +
                    "Super Class a'zolariga kirish\n" +
                    "Olingan sinfdagi kod super kalit so'z yordamida o'zining yuqori sinf funktsiyalari va xususiyatlarini bevosita chaqirishi mumkin :\n" +
                    "\n" +
                    "open class Base() {\n" +
                    "   open val name:String\n" +
                    "   init{\n" +
                    "      name = \"Base\"\n" +
                    "   }\n" +
                    "   open fun displayName(){\n" +
                    "      println(\"I am in \" +  this.name)\n" +
                    "   }\n" +
                    "}\n" +
                    "class Child(): Base() {\n" +
                    "   override fun displayName(){\n" +
                    "      super.displayName()\n" +
                    "      println(\"I am in \" + super.name)\n" +
                    "  \n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var a = Child()\n" +
                    "   a.displayName()\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "I am in Base\n" +
                    "I am in Base\n" +
                    "Qoidalarni bekor qilish\n" +
                    "Agar bola sinf o'zining bevosita yuqori sinflaridan bir xil a'zoning bir nechta ilovalarini meros qilib olsa, u bu a'zoni bekor qilishi va o'zining amalga oshirilishini ta'minlashi kerak.\n" +
                    "\n" +
                    "Bu bitta ota-onadan a'zolarni meros qilib olgan bolalar sinfidan farq qiladi, bunday holatda bolalar sinfi barcha ochiq a'zolarni amalga oshirishni ta'minlashi shart emas.\n" +
                    "\n" +
                    "open class Rectangle {\n" +
                    "    open fun draw() { /* ... */ }\n" +
                    "}\n" +
                    "\n" +
                    "interface Polygon {\n" +
                    "    fun draw() { /* ... */ } // interface members are 'open' by default\n" +
                    "}\n" +
                    "\n" +
                    "class Square() : Rectangle(), Polygon {\n" +
                    "    // The compiler requires draw() to be overridden:\n" +
                    "    override fun draw() {\n" +
                    "        super<Rectangle>.draw() // call to Rectangle.draw()\n" +
                    "        super<Polygon>.draw() // call to Polygon.draw()\n" +
                    "    }\n" +
                    "}\n" +
                    "Rectangle va Polygon dan meros qilib olish yaxshi , lekin ularning ikkalasida ham draw() usuli mavjud, shuning uchun kvadratda draw() ni bekor qilib, noaniqlikni bartaraf etish uchun alohida dasturni taqdim etishingiz kerak."),
        Lesson("Abstract Classes",
            "Kotlin mavhum klassi Java abstrakt sinfiga o'xshaydi, uni yaratish mumkin emas. Bu biz mavhum sinf ob'ektlarini yarata olmasligimizni anglatadi. Biroq, biz Kotlin mavhum sinfidan kichik sinflarni meros qilib olishimiz mumkin.\n" +
                    "\n" +
                    "Kotlin mavhum sinfi sinf nomi oldidagi abstrakt kalit so'z yordamida e'lon qilinadi . Mavhum sinfning xossalari va usullari mavhum emas, agar biz ularni mavhum qilish uchun mavhum kalit so'zni aniq ishlatmasak. Agar biz bolalar sinfidagi ushbu a'zolarni bekor qilmoqchi bo'lsak, biz bolalar sinfida ularning oldida bekor qilish kalit so'zidan foydalanishimiz kerak.\n" +
                    "\n" +
                    "abstract class Person {\n" +
                    "   var age: Int = 40\n" +
                    "\n" +
                    "   abstract fun setAge()   // Abstract Method\n" +
                    "\n" +
                    "   fun getAge() {          // Non-Abstract Method\n" +
                    "      return age\n" +
                    "   }\n" +
                    "} \n" +
                    "Abstrakt darslar doimo ochiq. Ulardan kichik sinflarni meros qilib olish uchun ochiq kalit so'zdan aniq foydalanish shart emas .\n" +
                    "Misol\n" +
                    "Quyida Kotlin Abstract sinfi va uning bolalar sinfi orqali amalga oshirilishini ko'rsatadigan oddiy misol keltirilgan:\n" +
                    "\n" +
                    "abstract class Person(_name: String) {\n" +
                    "   var name: String\n" +
                    "   abstract var age: Int \n" +
                    "   \n" +
                    "   // Initializer Block\n" +
                    "   init {\n" +
                    "      this.name = _name\n" +
                    "   }\n" +
                    "   \n" +
                    "   abstract fun setPersonAge(_age:Int)\n" +
                    "   abstract fun getPersonAge():Int\n" +
                    "   \n" +
                    "   fun getPersonName(){\n" +
                    "       println(\"Name = $name\")\n" +
                    "   }\n" +
                    "}\n" +
                    "class Employee(_name: String): Person(_name) {\n" +
                    "    override var age: Int = 0\n" +
                    "\n" +
                    "    override fun setPersonAge(_age: Int) {\n" +
                    "       age = _age\n" +
                    "    }\n" +
                    "    override fun getPersonAge():Int {\n" +
                    "       return age\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val employee = Employee(\"Zara\")\n" +
                    "   var age : Int\n" +
                    "   \n" +
                    "   employee.setPersonAge(20)\n" +
                    "   \n" +
                    "   age = employee.getPersonAge()\n" +
                    "    \n" +
                    "   employee.getPersonName()\n" +
                    "   println(\"Age = $age\")\n" +
                    "   \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Zara\n" +
                    "Age = 20\n" +
                    "Bu yerda xodim mavhum sinfdan Person sinfidan olingan . Biz bir mavhum xususiyat va ikkita mavhum usulni bolalar sinfida amalga oshirdik Employee . Bu erda diqqatga sazovor jihat shundaki, barcha mavhum a'zolar bolalar sinfida override yordamida bekor qilingan , agar u abstrakt sinfni meros qilib olsa, bolalar sinfi uchun majburiy hisoblanadi.\n" +
                    "\n" +
                    "Xulosa qilib aytadigan bo'lsak, deklaratsiyasida mavhum kalit so'zni o'z ichiga olgan Kotlin sinfi mavhum sinf sifatida tanilgan.\n" +
                    "\n" +
                    "Mavhum sinflar mavhum usullarni o'z ichiga olishi yoki bo'lmasligi mumkin , ya'ni tanasiz usullar ( public void get(); )\n" +
                    "\n" +
                    "Ammo, agar sinfda kamida bitta mavhum usul bo'lsa, u holda sinf mavhum deb e'lon qilinishi kerak .\n" +
                    "\n" +
                    "Agar sinf mavhum deb e'lon qilingan bo'lsa, uni instantsiya qilib bo'lmaydi.\n" +
                    "\n" +
                    "Mavhum sinfdan foydalanish uchun siz uni boshqa sinfdan meros qilib olishingiz, undagi mavhum usullarni amalga oshirishingiz kerak.\n" +
                    "\n" +
                    "Agar siz mavhum sinfni meros qilib olsangiz, undagi barcha mavhum usullarni amalga oshirishni ta'minlashingiz kerak."),
        Lesson("Interface",
            "Ushbu bobda biz Kotlindagi interfeys haqida bilib olamiz. Kotlinda interfeys aynan Java 8 ga o'xshash ishlaydi, ya'ni ular usullarni amalga oshirish bilan bir qatorda mavhum usullar deklaratsiyasini ham o'z ichiga olishi mumkin. Interfeys sinf tomonidan belgilangan funksionallikdan foydalanish uchun amalga oshirilishi mumkin. Biz allaqachon 6-bobda - \"anonim ichki sinf\" bo'limida interfeysga misol keltirdik. Ushbu bobda biz bu haqda ko'proq bilib olamiz. \"Interfeys\" kalit so'zi quyidagi kod qismida ko'rsatilganidek, Kotlindagi interfeysni aniqlash uchun ishlatiladi.\n" +
                    "\n" +
                    "interface ExampleInterface {\n" +
                    "   var myVar: String     // abstract property\n" +
                    "   fun absMethod()       // abstract method\n" +
                    "   fun sayHello() = \"Hello there\" // method with default implementation\n" +
                    "}\n" +
                    "Yuqoridagi misolda biz \"ExampleInterface\" deb nomlangan bitta interfeys yaratdik va uning ichida bizda bir nechta mavhum xususiyatlar va usullar mavjud. Amalga oshirilgan usul bo'lgan \"sayHello()\" nomli funktsiyaga qarang.\n" +
                    "\n" +
                    "Quyidagi misolda biz yuqoridagi interfeysni sinfda amalga oshiramiz.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "interface ExampleInterface  {\n" +
                    "   var myVar: Int            // abstract property\n" +
                    "   fun absMethod():String    // abstract method\n" +
                    "   \n" +
                    "   fun hello() {\n" +
                    "      println(\"Hello there, Welcome to TutorialsPoint.Com!\")\n" +
                    "   }\n" +
                    "}\n" +
                    "class InterfaceImp : ExampleInterface {\n" +
                    "   override var myVar: Int = 25\n" +
                    "   override fun absMethod() = \"Happy Learning \"\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj = InterfaceImp()\n" +
                    "   println(\"My Variable Value is = '$'{obj.myVar}\")\n" +
                    "   print(\"Calling hello(): \")\n" +
                    "   obj.hello()\n" +
                    "   \n" +
                    "   print(\"Message from the Website-- \")\n" +
                    "   println(obj.absMethod())\n" +
                    "}\n" +
                    "Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "My Variable Value is = 25\n" +
                    "Calling hello(): Hello there, Welcome to TutorialsPoint.Com!\n" +
                    "Message from the Website-- Happy Learning\n" +
                    "Yuqorida aytib o'tilganidek, Kotlin bir nechta merosni qo'llab-quvvatlamaydi, ammo bir vaqtning o'zida ikkitadan ortiq interfeyslarni amalga oshirish orqali bir xil narsaga erishish mumkin.\n" +
                    "\n" +
                    "Quyidagi misolda biz ikkita interfeys yaratamiz va keyin ikkala interfeysni sinfga kiritamiz.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "interface A {\n" +
                    "   fun printMe() {\n" +
                    "      println(\" method of interface A\")\n" +
                    "   }\n" +
                    "}\n" +
                    "interface B  {\n" +
                    "   fun printMeToo() {\n" +
                    "      println(\"I am another Method from interface B\")\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "// implements two interfaces A and B\n" +
                    "class multipleInterfaceExample: A, B\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj = multipleInterfaceExample()\n" +
                    "   obj.printMe()\n" +
                    "   obj.printMeToo()\n" +
                    "}\n" +
                    "Yuqoridagi misolda biz A, B ikkita namunaviy interfeys yaratdik va “multipleInterfaceExample” nomli sinfda avval e’lon qilingan ikkita interfeysni amalga oshirdik. Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "method of interface A\n" +
                    "I am another Method from interface B"),
        Lesson("Visibility Controll",
            "Kotlin ko'rinishini o'zgartiruvchilari sinflar, ob'ektlar, interfeys, konstruktorlar, funktsiyalar, shuningdek xususiyatlar va ularning sozlagichlarining ko'rinishini o'rnatadigan kalit so'zlardir. Garchi qabul qiluvchilar har doim ularning xususiyatlari bilan bir xil ko'rinishga ega bo'lsalar ham, biz ularning ko'rinishini o'rnatolmaymiz.\n" +
                    "\n" +
                    "Sozlagichlar - bu xususiyatlarning qiymatlarini o'rnatish uchun ishlatiladigan funktsiyalar, bu erda qabul qiluvchilar - bu xususiyatlarning qiymatlarini olish uchun ishlatiladigan funktsiyalar.\n" +
                    "Kotlinda to'rtta ko'rinishni o'zgartiruvchi mavjud:\n" +
                    "\n" +
                    "ommaviy\n" +
                    "\n" +
                    "xususiy\n" +
                    "\n" +
                    "himoyalangan\n" +
                    "\n" +
                    "ichki\n" +
                    "\n" +
                    "Birlamchi koʻrinish ochiq. Ushbu modifikatorlar sinf sarlavhasi yoki usul tanasi kabi bir nechta joylarda ishlatilishi mumkin. Keling, ushbu modifikatorlarning tafsilotlarini ko'rib chiqaylik:\n" +
                    "\n" +
                    "Umumiy modifikator\n" +
                    "Umumiy modifikatorga loyiha ish maydonining istalgan joyidan kirish mumkin. Agar kirish modifikatori ko'rsatilmagan bo'lsa, sukut bo'yicha u umumiy doirada bo'ladi. Oldingi barcha misollarimizda biz hech qanday modifikatorni tilga olmadik, shuning uchun ularning barchasi ommaviy doirada. Ommaviy o'zgaruvchi yoki usulni qanday e'lon qilish haqida ko'proq tushunish uchun quyida misol keltirilgan.\n" +
                    "\n" +
                    "class publicExample {\n" +
                    "   val i = 1\n" +
                    "   \n" +
                    "   fun doSomething() {\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi misolda biz hech qanday modifikator haqida gapirmadik, shuning uchun bu erda aniqlangan usul va o'zgaruvchilar sukut bo'yicha ommaviydir. Yuqoridagi misolni ochiq modifikator bilan quyidagicha yozish mumkin:\n" +
                    "\n" +
                    "public class publicExample {\n" +
                    "   public val i = 1\n" +
                    "   \n" +
                    "   public fun doSomething() {\n" +
                    "   }\n" +
                    "}\n" +
                    "Shaxsiy modifikator\n" +
                    "Sinflar, usullar, paketlar va boshqa xususiyatlar xususiy modifikator bilan e'lon qilinishi mumkin. Ushbu modifikator ommaviy so'zining deyarli teskari ma'nosiga ega, ya'ni shaxsiy a'zoga uning doirasidan tashqarida kirish mumkin emas. Biror narsa shaxsiy deb e'lon qilingandan so'ng, unga faqat uning bevosita doirasida kirish mumkin. Masalan, shaxsiy paketga ma'lum bir fayl ichida kirish mumkin. Shaxsiy sinf yoki interfeysga faqat uning ma'lumotlar a'zolari va boshqalar kirishi mumkin.\n" +
                    "\n" +
                    "private class privateExample {\n" +
                    "   private val i = 1\n" +
                    "   \n" +
                    "   private val doSomething() {\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi misolda privateExample sinfiga faqat bir xil manba fayl ichidan kirish mumkin va i o'zgaruvchisiga va doSomething usuliga faqat privateExample sinfi ichidan kirish mumkin.\n" +
                    "\n" +
                    "Misol\n" +
                    "Shaxsiy a'zolardan foydalanishni ko'rsatadigan oddiy misolni ko'rib chiqaylik:\n" +
                    "\n" +
                    "open class A() {\n" +
                    "   private val i = 1\n" +
                    "   \n" +
                    "   fun doSomething(){\n" +
                    "      println(\"Inside doSomething\" )\n" +
                    "      println(\"Value of i is '$'i\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "class B : A() {\n" +
                    "   fun printValue(){\n" +
                    "       doSomething()\n" +
                    "       // println(\"Value of i is '$'i\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {  \n" +
                    "   val a = A()\n" +
                    "   val b = B()\n" +
                    "   \n" +
                    "   b.printValue()\n" +
                    "}  \n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Inside doSomething\n" +
                    "Value of i is 1\n" +
                    "Bu erda biz B sinfidagi i o'zgaruvchisiga kira olmaymiz, chunki u xususiy deb belgilangan, ya'ni unga sinfning o'zida kirish mumkin, boshqa joyda emas.\n" +
                    "\n" +
                    "Himoyalangan modifikator\n" +
                    "Himoyalangan - bu Kotlin uchun boshqa kirish modifikatori bo'lib, u hozirda yuqori darajadagi deklaratsiya uchun mavjud emas, chunki har qanday paketni himoya qilib bo'lmaydi. Himoyalangan sinf yoki interfeys yoki xususiyatlar yoki funktsiya sinfning o'ziga va faqat quyi sinflarga ko'rinadi.\n" +
                    "\n" +
                    "package one;\n" +
                    "\n" +
                    "class A() {\n" +
                    "   protected val i = 1\n" +
                    "}\n" +
                    "class B : A() {\n" +
                    "   fun getValue() : Int {\n" +
                    "      return i\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi misolda i o'zgaruvchisi himoyalangan deb e'lon qilingan, shuning uchun u faqat sinfning o'ziga va uning pastki sinflariga ko'rinadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Himoyalangan a'zolardan foydalanishni ko'rsatadigan oddiy misolni ko'rib chiqaylik:\n" +
                    "\n" +
                    "open class A() {\n" +
                    "   protected val i = 1\n" +
                    "   \n" +
                    "   protected fun doSomething(){\n" +
                    "      println(\"Inside doSomething\" )\n" +
                    "      println(\"Value of i is '$'i\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "class B : A() {\n" +
                    "   fun printValue(){\n" +
                    "       doSomething()\n" +
                    "       println(\"Value of i is '$'i\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {  \n" +
                    "   val a = A()\n" +
                    "   val b = B()\n" +
                    "   \n" +
                    "   //a.doSomething()\n" +
                    "   \n" +
                    "   b.printValue()\n" +
                    "}  \n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Inside doSomething\n" +
                    "Value of i is 1\n" +
                    "Value of i is 1\n" +
                    "Bu erda biz doSomething() ni A sinf ob'ekti yordamida ham chaqira olmaymiz , chunki u himoyalangan deb belgilangan, ya'ni unga sinfning o'zida yoki faqat uning pastki sinflarida kirish mumkin.\n" +
                    "\n" +
                    "Ichki modifikator\n" +
                    "Ichki - Kotlin-ga yangi qo'shilgan modifikator. Agar biror narsa ichki deb belgilangan bo'lsa, u holda maxsus maydon ichki maydon sifatida belgilanadi. Ichki paket faqat u amalga oshirilgan modul ichida ko'rinadi. Ichki sinf interfeysi faqat bitta paket yoki modul ichidagi boshqa sinf tomonidan ko'rinadi. Quyidagi misolda biz ichki usulni qanday amalga oshirishni ko'rib chiqamiz.\n" +
                    "\n" +
                    "package one\n" +
                    "\n" +
                    "internal class InternalExample {\n" +
                    "}\n" +
                    "\n" +
                    "class publicExample{\n" +
                    "    internal val i = 1\n" +
                    "\n" +
                    "    internal fun doSomething() {\n" +
                    "    }\n" +
                    "}\n" +
                    "Yuqoridagi misolda InternalExample sinfiga faqat bitta modul ichidan kirish mumkin, shunga o'xshash i o'zgaruvchisi va doSomething() funksiyasiga ham faqat bitta modul ichidan kirish mumkin, garchi publicExample sinfiga istalgan joydan kirish mumkin, chunki bu sinf umumiy ko'rinishga ega. avvalboshdan.\n" +
                    "\n" +
                    "Misol\n" +
                    "Keling, ichki a'zolardan foydalanishni ko'rsatadigan oddiy misolni ko'rib chiqaylik:\n" +
                    "\n" +
                    "package com.tutorialspoint.modifiers\n" +
                    "\n" +
                    "open class A() {\n" +
                    "   internal val i = 1\n" +
                    "   \n" +
                    "   internal fun doSomething(){\n" +
                    "      println(\"Inside doSomething\" )\n" +
                    "      println(\"Value of i is '$'i\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "class B : A() {\n" +
                    "   fun printValue(){\n" +
                    "       doSomething()\n" +
                    "       println(\"Value of i is '$''i'\" )\n" +
                    "   }\n" +
                    "}\n" +
                    "\n" +
                    "fun main(args: Array<String>) {  \n" +
                    "   val a = A()\n" +
                    "   val b = B()\n" +
                    "   \n" +
                    "   a.doSomething()\n" +
                    "   \n" +
                    "   b.printValue()\n" +
                    "}  \n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Inside doSomething\n" +
                    "Value of i is 1\n" +
                    "Inside doSomething\n" +
                    "Value of i is 1\n" +
                    "Value of i is 1"),
        Lesson("Extension",
            "Kotlin kengaytmalari sinf tomonidan meros kontseptsiyasini amalga oshirmasdan yoki Dekorator kabi dizayn naqshlaridan foydalanmasdan sinfni yangi funksionallik bilan kengaytirish imkoniyatini beradi. Ushbu kengaytmalar asosan sinfni kengaytirmasdan mavjud sinfga ba'zi funksiyalarni qo'shadi.\n" +
                    "\n" +
                    "Kotlin kengaytmasi sinfni o'zgartirmasdan uchinchi tomon kutubxonasidan sinf uchun yangi funktsiyalarni yozish imkonini beradi. Kengaytma funktsiyalarining go'zalligi shundaki, ularni odatiy tarzda chaqirish mumkin, go'yo ular asl sinfning usullari va bu yangi funktsiyalar Kengaytma funktsiyalari deb ataladi .\n" +
                    "\n" +
                    "Xuddi shunday, biz mavjud Kotlin sinfi uchun kengaytma xususiyatlarini ham aniqlashimiz mumkin .\n" +
                    "\n" +
                    "Kengaytma funktsiyasi\n" +
                    "Kotlin kengaytmasi funksiyasi sinfning a'zo funktsiyasi bo'lib, u sinfdan tashqarida aniqlanadi. Yaratilgan kengaytma funktsiyalari o'sha sinf ichida muntazam funksiya sifatida ishlatiladi.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "Quyida kengaytma funksiyasini aniqlash sintaksisi keltirilgan . Bu yerda kengaytma funksiyasi sinf nomi va metod nomi yordamida e'lon qilinadi.\n" +
                    "\n" +
                    "fun <class_name>.<method_name>(){\n" +
                    " ....\n" +
                    " function body\n" +
                    "}\n" +
                    "Misol\n" +
                    "Funktsiyani kengaytirishda Kotlin asosiy sinfdan tashqarida usulni aniqlashga imkon beradi. Quyidagi misolda biz kengaytmaning funktsional darajada qanday amalga oshirilishini ko'rib chiqamiz.\n" +
                    "\n" +
                    "class Alien {\n" +
                    "   var skills : String = \"null\"\n" +
                    "\t\n" +
                    "   fun printMySkills() {\n" +
                    "      print(skills)\n" +
                    "   }\t\t\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var  a1 = Alien()\n" +
                    "   a1.skills = \"JAVA\"\n" +
                    "   //a1.printMySkills()\n" +
                    "\t\n" +
                    "   var  a2 = Alien()\n" +
                    "   a2.skills = \"SQL\"\n" +
                    "   //a2.printMySkills()\n" +
                    "\t\n" +
                    "   var  a3 = Alien()\n" +
                    "   a3.skills = a1.addMySkills(a2)\n" +
                    "   a3.printMySkills()\n" +
                    "}\n" +
                    "fun Alien.addMySkills(a:Alien):String{\n" +
                    "   var a4 = Alien()\n" +
                    "   a4.skills = this.skills + \" \" +a.skills\n" +
                    "   return a4.skills\n" +
                    "}\n" +
                    "Yuqoridagi misolda bizda “addMySkills()” deb nomlangan “Alien” sinfida hech qanday usul yo‘q, ammo biz hali ham sinfdan tashqari boshqa joyda xuddi shu usulni qo‘llayapmiz, bu kengaytmaning sehridir.\n" +
                    "\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "JAVA SQL\n" +
                    "Kengaytirilgan kutubxona darslari\n" +
                    "Kotlin standart kutubxona sinflarini, shuningdek, foydalanuvchi tomonidan belgilangan sinflarni kengaytirish imkonini beradi. Misol uchun, agar sizga satrda mavjud unlilar sonini qaytaradigan standart Kotlin String sinfi uchun maxsus funksiya kerak bo'lsa, bunday usul String sinfida allaqachon mavjud emas, lekin bu vazifani bajarish uchun kengaytma funksiyasidan foydalanishingiz mumkin.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val str = \"Good morning Kotlin\"\n" +
                    "   \n" +
                    "   val result = str.countVowels()\n" +
                    "   println(\"Number of vowels: '$'result\")\n" +
                    "}\n" +
                    "fun String.countVowels(): Int{\n" +
                    "   var vowels = 0\n" +
                    "   for (i in 0.. this.length - 1) {\n" +
                    "      val ch = this[i]\n" +
                    "      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {\n" +
                    "         ++vowels\n" +
                    "      }\n" +
                    "   }\n" +
                    "   return vowels; \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Number of vowels: 6\n" +
                    "Yordamchi ob'ekt kengaytmalari\n" +
                    "Kotlin Java-ning statik funksiyalarini amalga oshirishning yana bir mexanizmini taqdim etadi. Bunga sinf ichida e'lon qilingan va hamroh kalit so'zi bilan belgilangan qo'shimcha ob'ekt yordamida erishish mumkin . Ushbu mexanizmdan foydalanib, biz zavod usuli ichida sinf ob'ektini yaratishimiz mumkin va keyinchalik sinf nomiga havoladan foydalanib, bu usulni chaqirishimiz mumkin.\n" +
                    "\n" +
                    "Quyidagi misolda biz \"hamroh ob'ektini\" yaratamiz.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   println(\"Heyyy!!!\"+A.show())\n" +
                    "}\n" +
                    "class A {\n" +
                    "   companion object {\n" +
                    "      fun show():String {\n" +
                    "         return(\"You are learning Kotlin from TutorialsPoint.com\")\n" +
                    "      }\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Heyyy!!! You are learning Kotlin from TutorialsPoint.com\n" +
                    "Yuqoridagi misol Java-da statik ko'rinadi, ammo real vaqtda biz ob'ektni o'sha sinfning a'zo o'zgaruvchisi sifatida yaratmoqdamiz. Shuning uchun u kengaytma xususiyatiga ham kiritilgan va uni muqobil ravishda ob'ekt kengaytmasi deb atash mumkin. Siz asosan bir xil sinf ob'ektini ba'zi a'zo funktsiyalaridan foydalanish uchun kengaytirasiz.\n" +
                    "\n" +
                    "Nullable qabul qiluvchi bilan kengaytma\n" +
                    "Kotlin kengaytma funksiyalarini null sinf turi bilan aniqlash imkonini beradi . Ushbu kengaytma funksiyasi null bo'ladigan ob'ekt o'zgaruvchisida chaqirilishi mumkin.\n" +
                    "\n" +
                    "Null qabul qiluvchi uchun kengaytmani aniqlash uchun biz kengaytma funksiyasi ichida null qabul qiluvchini tekshirishni qo'shishimiz kerak va tegishli qiymat qaytariladi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   var str1 = \"Good morning Kotlin\"\n" +
                    "   var str2 : String? = null\n" +
                    "   \n" +
                    "   var result = str1.countVowels()\n" +
                    "   println(\"Number of vowels in str1 : '$'result\")\n" +
                    "   \n" +
                    "   result = str2.countVowels()\n" +
                    "   println(\"Number of vowels in str2 : '$'result\")\n" +
                    "}\n" +
                    "fun String?.countVowels(): Any{\n" +
                    "   if (this == null) return \"null\"\n" +
                    "   \n" +
                    "   var vowels = 0\n" +
                    "   for (i in 0.. this.length - 1) {\n" +
                    "      val ch = this[i]\n" +
                    "      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {\n" +
                    "         ++vowels\n" +
                    "      }\n" +
                    "   }\n" +
                    "   return vowels; \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Number of vowels in str1 : 6\n" +
                    "Number of vowels in str2 : null\n" +
                    "Kengaytma xususiyatlari\n" +
                    "Kotlin , biz kengaytma funksiyasini belgilaganimiz kabi, kengaytma xususiyatlarini juda o'xshash tarzda aniqlashga imkon beradi. Kengaytma xususiyatlari sinfdan tashqarida ham aniqlanadi. Kengaytmalar aslida a'zolarni sinflarga kiritmagani uchun kengaytma xususiyatining qo'llab-quvvatlash maydoniga ega bo'lishining samarali usuli yo'q. Shuning uchun kengaytma xususiyatlari uchun ishga tushiruvchilarga ruxsat berilmaydi.\n" +
                    "\n" +
                    "Biz kengaytma funktsiyalaridan boshqa narsa bo'lmagan xususiyat bilan birga getter va setterni qo'shishimiz mumkin.\n" +
                    "\n" +
                    "class Temperature(var celsius: Float)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val t = Temperature(40f)\n" +
                    "   println(t.fahrenheit)\n" +
                    "\n" +
                    "   t.fahrenheit = 85f\n" +
                    "   println(t.celsius)\n" +
                    "}\n" +
                    "var Temperature.fahrenheit: Float\n" +
                    "    get() = (celsius * 9 / 5) + 32\n" +
                    "    set(value) {\n" +
                    "        celsius = (value - 32) * 5 / 9\n" +
                    "    }\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "104.0\n" +
                    "29.444445"),
        Lesson("Data Classes",
            "Ushbu bobda biz Kotlin ma'lumotlar sinflari haqida bilib olamiz. Kotlin ma'lumotlar klassi faqat ma'lumotlarni saqlash uchun ishlatiladi va u ma'lumotlarni saqlashdan tashqari boshqa hech qanday funksiyani ta'minlamaydi.\n" +
                    "\n" +
                    "Kotlin sinfining ma'lumotlar klassi sifatida belgilanishi uchun quyidagi shartlar mavjud:\n" +
                    "\n" +
                    "Asosiy konstruktor kamida bitta parametrga ega bo'lishi kerak.\n" +
                    "\n" +
                    "Barcha asosiy konstruktor parametrlari val yoki var sifatida belgilanishi kerak.\n" +
                    "\n" +
                    "Ma'lumotlar sinflari mavhum, ochiq, muhrlangan yoki ichki bo'lishi mumkin emas.\n" +
                    "\n" +
                    "Sinf boshqa sinflarni kengaytirishi yoki interfeyslarni amalga oshirishi mumkin. Agar siz 1.1 dan oldingi Kotlin versiyasidan foydalansangiz, sinf faqat interfeyslarni amalga oshirishi mumkin.\n" +
                    "\n" +
                    "Sintaksis\n" +
                    "Kotlin ma'lumotlar sinfini aniqlash juda oddiy. Agar Kotlin klassi data kalit so'zi bilan belgilangan bo'lsa, u ma'lumotlar sinfiga aylanadi. Masalan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "Kotlin ma'lumotlar sinfining yaxshi tomoni shundaki, siz Kotlin ma'lumotlar sinfini e'lon qilganingizda, kompilyator Konstruktor, toString(), equals(), hashCode() va qo'shimcha copy() va komponentN() funksiyalarini avtomatik ravishda yaratadi.\n" +
                    "\n" +
                    "Misol\n" +
                    "Kotlin ma'lumotlar klassi boshqa Kotlin sinflari bilan bir xil tarzda yaratilgan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   val book = Book(\"Kotlin\", \"Tutorials Point\", 10)\n" +
                    "   \n" +
                    "   println(\"Name = '$'{book.name}\")\n" +
                    "   println(\"Publisher = '$'{book.publisher}\")\n" +
                    "   println(\"Score = '$'{book.reviewScore}\")\n" +
                    "\t  \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Kotlin\n" +
                    "Publisher = Tutorials Point\n" +
                    "Score = 10\n" +
                    "Nusxalash funksiyasi\n" +
                    "Kotlin ma'lumotlar sinfini aniqlaganimizda copy() funksiyasi avtomatik ravishda yaratiladi. Ushbu nusxa ko'chirish funksiyasi ob'ektni uning ba'zi xususiyatlarini o'zgartirib, qolganlarini o'zgarmagan holda nusxalash uchun ishlatilishi mumkin. Quyida misol keltirilgan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   val original = Book(\"Kotlin\", \"Tutorials Point\", 10)\n" +
                    "   \n" +
                    "   val copied = original.copy(reviewScore=5)\n" +
                    "   \n" +
                    "   println(\"Original Book\")\n" +
                    "   println(\"Name = '$'{original.name}\")\n" +
                    "   println(\"Publisher = '$'{original.publisher}\")\n" +
                    "   println(\"Score = '$'{original.reviewScore}\")\n" +
                    "   \n" +
                    "   println(\"Copied Book\")\n" +
                    "   println(\"Name = '$'{copied.name}\")\n" +
                    "   println(\"Publisher = '$'{copied.publisher}\")\n" +
                    "   println(\"Score = '$'{copied.reviewScore}\")\n" +
                    "\t\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Original Book\n" +
                    "Name = Kotlin\n" +
                    "Publisher = Tutorials Point\n" +
                    "Score = 10\n" +
                    "Copied Book\n" +
                    "Name = Kotlin\n" +
                    "Publisher = Tutorials Point\n" +
                    "Score = 5\n" +
                    "toString funktsiyasi\n" +
                    "Kotlin ma'lumotlar sinfini aniqlaganimizda toString() funksiyasi ham avtomatik ravishda yaratiladi. Bu funksiya ob'ektning satr tasvirini qaytaradi. Quyida misol keltirilgan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   val book = Book(\"Kotlin\", \"Tutorials Point\", 10)\n" +
                    "\n" +
                    "   \n" +
                    "   println(book.toString())\n" +
                    "\t\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Book(name=Kotlin, publisher=Tutorials Point, reviewScore=10)\n" +
                    "hashCode() va teng() funksiyalari\n" +
                    "hasCode() funksiyasi ob'ekt uchun xesh kodini qaytaradi. Agar ikkita ob'ekt teng bo'lsa, hashCode() ob'ektlar uchun bir xil butun son qiymatini qaytaradi.\n" +
                    "\n" +
                    "Agar ikkita ob'ekt teng bo'lsa yoki ular bir xil hasCode qiymatiga ega bo'lsa, equals() funksiyasi true qiymatini qaytaradi, aks holda u false ni qaytaradi .\n" +
                    "\n" +
                    "Quyida misol keltirilgan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   val original = Book(\"Kotlin\", \"Tutorials Point\", 10)\n" +
                    "   \n" +
                    "   val copy1 = original.copy(reviewScore=5)\n" +
                    "   val copy2 = original.copy(reviewScore=7)\n" +
                    "   \n" +
                    "   println(\"Original Hashcode = '$'{original.hashCode()}\")\n" +
                    "   println(\"Copy1 Hashcode = '$'{copy1.hashCode()}\")\n" +
                    "   println(\"Copy2 Hashcode = '$'{copy2.hashCode()}\")\n" +
                    "   \n" +
                    "   if( copy1.equals(copy2)){\n" +
                    "      println(\"Copy1 is equal to Copy2.\")\n" +
                    "   }else{\n" +
                    "      println(\"Copy1 is not equal to Copy2.\")\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Original Hashcode = 1957710662\n" +
                    "Copy1 Hashcode = 1957710657\n" +
                    "Copy2 Hashcode = 1957710659\n" +
                    "Copy1 is not equal to Copy2.\n" +
                    "Tuzilishi to'g'risidagi deklaratsiyalar\n" +
                    "Biz ob'ektni destruktsiya deklaratsiyasidan foydalanib, bir nechta o'zgaruvchilarga o'zgartirishimiz mumkin. Masalan:\n" +
                    "\n" +
                    "data class Book(val name: String, val publisher: String, var reviewScore: Int)\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "\n" +
                    "   val book = Book(\"Kotlin\", \"Tutorials Point\", 10)\n" +
                    "   \n" +
                    "   val( name, publisher,reviewScore ) = book\n" +
                    "   \n" +
                    "   println(\"Name = $name\")\n" +
                    "   println(\"Publisher = '$'publisher\")\n" +
                    "   println(\"Score = '$'reviewScore\")\n" +
                    "\t  \n" +
                    "}\n" +
                    "Yuqoridagi Kotlin dasturini ishga tushirganingizda, u quyidagi natijani yaratadi:\n" +
                    "\n" +
                    "Name = Kotlin\n" +
                    "Publisher = Tutorials Point\n" +
                    "Score = 10"),
        Lesson("Sealed Class",
            "Ushbu bobda biz \"Muhrlangan\" sinf deb ataladigan boshqa sinf turi haqida bilib olamiz. Ushbu turdagi sinf cheklangan sinf ierarxiyasini ifodalash uchun ishlatiladi. Muhrlangan dastur ishlab chiquvchilarga oldindan belgilangan turdagi ma'lumotlar turini saqlashga imkon beradi. Muhrlangan sinfni yaratish uchun biz ushbu sinfning modifikatori sifatida \"muhrlangan\" kalit so'zidan foydalanishimiz kerak. Muhrlangan sinf o'zining kichik sinfiga ega bo'lishi mumkin, ammo barcha quyi sinflar muhrlangan sinf bilan bir xil Kotlin faylida e'lon qilinishi kerak. Quyidagi misolda biz muhrlangan sinfdan qanday foydalanishni ko'rib chiqamiz.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "sealed class MyExample {\n" +
                    "   class OP1 : MyExample() // MyExmaple class can be of two types only\n" +
                    "   class OP2 : MyExample()\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val obj: MyExample = MyExample.OP2() \n" +
                    "   \n" +
                    "   val output = when (obj) { // defining the object of the class depending on the inuputs \n" +
                    "      is MyExample.OP1 -> \"Option One has been chosen\"\n" +
                    "      is MyExample.OP2 -> \"option Two has been chosen\"\n" +
                    "   }\n" +
                    "   \n" +
                    "   println(output)\n" +
                    "}\n" +
                    "Yuqoridagi misolda bizda \"MyExample\" nomli bitta muhrlangan sinf bor, u faqat ikkita turdagi bo'lishi mumkin - biri \"OP1\" va boshqasi \"OP2\". Asosiy sinfda biz sinfimizda ob'ekt yaratmoqdamiz va uning turini ish vaqtida tayinlaymiz. Endi, bu \"MyExample\" klassi muhrlanganligi sababli, yakuniy natijani amalga oshirish uchun ish vaqtida \"qachon\" bandini qo'llashimiz mumkin.\n" +
                    "\n" +
                    "Muhrlangan sinfda kodni murakkablashtirish uchun keraksiz \"alse\" iborasidan foydalanishimiz shart emas. Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "option Two has been chosen"),
        Lesson("Generics",
            "Istisnolarni qayta ishlash dasturlash tilining juda muhim qismidir. Ushbu uslub bizning ilovamizni ish vaqtida noto'g'ri natija yaratishni cheklaydi. Ushbu bobda biz Kotlinda ish vaqti istisnosini qanday hal qilishni o'rganamiz. Kotlindagi istisnolar Java-dagi istisnolarga juda o'xshaydi. Barcha istisnolar \"Throwable\" sinfining avlodlari. Quyidagi misol Kotlinda istisnolardan foydalanish texnikasidan qanday foydalanishni ko'rsatadi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   try {\n" +
                    "      val myVar:Int = 12;\n" +
                    "      val v:String = \"Tutorialspoint.com\";\n" +
                    "      v.toInt();\n" +
                    "   } catch(e:Exception) {\n" +
                    "      e.printStackTrace();\n" +
                    "   } finally {\n" +
                    "      println(\"Exception Handeling in Kotlin\");\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi kod qismida biz Stringni e'lon qildik va keyinchalik bu satrni butun songa bog'ladik, bu aslida ish vaqtining istisnosidir. Shunday qilib, biz brauzerda quyidagi natijani olamiz.\n" +
                    "\n" +
                    "val myVar:Int = 12;\n" +
                    "Exception Handeling in Kotlin\n" +
                    "Eslatma - Java kabi, Kotlin ham catch blokini bajargandan so'ng finally blokini bajaradi."),
        Lesson("Delegation",
            "Kotlin yangi \"by\" kalit so'zini kiritish orqali \"delegatsiya\" dizayn naqshini qo'llab-quvvatlaydi . Ushbu kalit so'z yoki delegatsiya metodologiyasidan foydalanib, Kotlin olingan sinfga ma'lum bir ob'ekt orqali interfeysning barcha amalga oshirilgan umumiy usullariga kirish imkonini beradi. Quyidagi misol Kotlinda bu qanday sodir bo'lishini ko'rsatadi.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "interface Base {\n" +
                    "   fun printMe() //abstract method\n" +
                    "}\n" +
                    "class BaseImpl(val x: Int) : Base {\n" +
                    "   override fun printMe() { println(x) }   //implementation of the method\n" +
                    "}\n" +
                    "class Derived(b: Base) : Base by b  // delegating the public method on the object b\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val b = BaseImpl(10)\n" +
                    "   Derived(b).printMe() // prints 10 :: accessing the printMe() method \n" +
                    "}\n" +
                    "Misolda, bizda \"printme()\" deb nomlangan mavhum usuli bilan bitta \"Baza\" interfeysi mavjud. BaseImpl sinfida biz ushbu \"printme()\" ni qo'llaymiz va keyinroq boshqa sinfdan \"by\" kalit so'zidan foydalanib, ushbu ilovadan foydalanamiz.\n" +
                    "\n" +
                    "Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "10\n" +
                    "Mulk delegatsiyasi\n" +
                    "Oldingi bo'limda biz \"by\" kalit so'zidan foydalangan holda delegatsiya dizayni naqshini bilib oldik. Ushbu bo'limda biz Kotlin kutubxonasida eslatib o'tilgan ba'zi standart usullardan foydalangan holda mulklarni delegatsiya qilish haqida bilib olamiz.\n" +
                    "\n" +
                    "Delegatsiya mas'uliyatni boshqa sinf yoki usulga topshirishni anglatadi. Mulk ba'zi joylarda allaqachon e'lon qilingan bo'lsa, biz ularni ishga tushirish uchun bir xil kodni qayta ishlatishimiz kerak. Quyidagi misollarda biz misollarimizda delegatsiyani amalga oshirishda Kotlin tomonidan taqdim etilgan ba'zi standart delegatsiya metodologiyasidan va ba'zi standart kutubxona funksiyalaridan foydalanamiz.\n" +
                    "\n" +
                    "Lazy() dan foydalanish\n" +
                    "Lazy - bu lambda funktsiyasi bo'lib, u xususiyatni kirish sifatida qabul qiladi va buning evaziga Lazy<T> misolini beradi , bu erda <T> asosan u foydalanadigan xususiyatlar turidir. Bu qanday ishlashini tushunish uchun keling, quyidagilarni ko'rib chiqaylik.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "val myVar: String by lazy {\n" +
                    "   \"Hello\"\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   println(myVar +\" My dear friend\")\n" +
                    "}\n" +
                    "Yuqoridagi kod qismida biz \"myVar\" o'zgaruvchisini Lazy funksiyasiga o'tkazmoqdamiz, bu esa o'z evaziga o'z ob'ektiga qiymat beradi va xuddi shu narsani asosiy funktsiyaga qaytaradi. Quyida brauzerdagi chiqish ko'rsatilgan.\n" +
                    "\n" +
                    "Hello My dear friend\n" +
                    "Delegatsiya.Observable()\n" +
                    "Observable() ob'ektni ishga tushirish uchun ikkita argument oladi va xuddi shu narsani chaqirilgan funktsiyaga qaytaradi. Quyidagi misolda delegatsiyani amalga oshirish uchun Observable() usulidan qanday foydalanishni ko'rib chiqamiz.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "import kotlin.properties.Delegates\n" +
                    "class User {\n" +
                    "   var name: String by Delegates.observable(\"Welcome to Tutorialspoint.com\") {\n" +
                    "      prop, old, new ->\n" +
                    "      println(\"'$'old -> '$'new\")\n" +
                    "   }\n" +
                    "}\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val user = User()\n" +
                    "   user.name = \"first\"\n" +
                    "   user.name = \"second\"\n" +
                    "}\n" +
                    "Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "first -> second\n" +
                    "Umuman olganda, sintaksis \"by\" kalit so'zi vakolat berilgandan keyingi ifodadir. p o'zgaruvchisining get() va set() usullari uning Delegat sinfida belgilangan getValue() va setValue() usullariga topshiriladi.\n" +
                    "\n" +
                    "class Example {\n" +
                    "   var p: String by Delegate()\n" +
                    "}\n" +
                    "Yuqoridagi kod qismi uchun p o'zgaruvchisiga qiymatni belgilash uchun biz yaratishimiz kerak bo'lgan delegatlar klassi quyida keltirilgan .\n" +
                    "\n" +
                    "class Delegate {\n" +
                    "   operator fun getValue(thisRef: Any?, property: KProperty<*>): String {\n" +
                    "      return \"'$'thisRef, thank you for delegating '$'{property.name} to me!\"\n" +
                    "   }\n" +
                    "   operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {\n" +
                    "      println(\"'$'value has been assigned to '$'{property.name} in '$'thisRef.'\")\n" +
                    "   }\n" +
                    "}\n" +
                    "O'qish paytida getValue() usuli chaqiriladi va o'zgaruvchini o'rnatishda setValue() usuli chaqiriladi."),
        Lesson("Destructuring Declarations",
            "Kotlin boshqa dasturlash tillarining ko'plab xususiyatlarini o'z ichiga oladi. Bu bir vaqtning o'zida bir nechta o'zgaruvchilarni e'lon qilish imkonini beradi. Ushbu uslub destruktiv deklaratsiya deb ataladi.\n" +
                    "\n" +
                    "Quyida buzilish deklaratsiyasining asosiy sintaksisi keltirilgan.\n" +
                    "\n" +
                    "val (name, age) = person\n" +
                    "Yuqoridagi sintaksisda biz ob'ekt yaratdik va ularning barchasini bitta bayonotda aniqladik. Keyinchalik, biz ularni quyidagicha ishlatishimiz mumkin.\n" +
                    "\n" +
                    "println(name)\n" +
                    "println(age)\n" +
                    "Keling, real hayotdagi ilovamizda qanday qilib xuddi shunday foydalanishimiz mumkinligini ko'rib chiqaylik. Quyidagi misolni ko'rib chiqing, bu erda biz ba'zi atributlarga ega bitta Student sinfini yaratamiz va keyinroq ob'ekt qiymatlarini chop etish uchun ulardan foydalanamiz.\n" +
                    "\n" +
                    "Jonli demo\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   val s = Student(\"TutorialsPoint.com\",\"Kotlin\")\n" +
                    "   val (name,subject) = s\n" +
                    "   println(\"You are learning \"+subject+\" from \"+name)\n" +
                    "}\n" +
                    "data class Student( val a :String,val b: String ){\n" +
                    "   var name:String = a\n" +
                    "   var subject:String = b\n" +
                    "}\n" +
                    "Yuqoridagi kod qismi brauzerda quyidagi natijani beradi.\n" +
                    "\n" +
                    "You are learning Kotlin from TutorialsPoint.com"),
        Lesson(" Exception Handling",
            "Istisnolarni qayta ishlash dasturlash tilining juda muhim qismidir. Ushbu uslub bizning ilovamizni ish vaqtida noto'g'ri natija yaratishni cheklaydi. Ushbu bobda biz Kotlinda ish vaqti istisnosini qanday hal qilishni o'rganamiz. Kotlindagi istisnolar Java-dagi istisnolarga juda o'xshaydi. Barcha istisnolar \"Throwable\" sinfining avlodlari. Quyidagi misol Kotlinda istisnolardan foydalanish texnikasidan qanday foydalanishni ko'rsatadi.\n" +
                    "\n" +
                    "fun main(args: Array<String>) {\n" +
                    "   try {\n" +
                    "      val myVar:Int = 12;\n" +
                    "      val v:String = \"Tutorialspoint.com\";\n" +
                    "      v.toInt();\n" +
                    "   } catch(e:Exception) {\n" +
                    "      e.printStackTrace();\n" +
                    "   } finally {\n" +
                    "      println(\"Exception Handeling in Kotlin\");\n" +
                    "   }\n" +
                    "}\n" +
                    "Yuqoridagi kod qismida biz Stringni e'lon qildik va keyinchalik bu satrni butun songa bog'ladik, bu aslida ish vaqtining istisnosidir. Shunday qilib, biz brauzerda quyidagi natijani olamiz.\n" +
                    "\n" +
                    "val myVar:Int = 12;\n" +
                    "Exception Handeling in Kotlin\n" +
                    "Eslatma - Java kabi, Kotlin ham catch blokini bajargandan so'ng finally blokini bajaradi.")
    )
    val videos= arrayListOf<VideoLesson>(
        VideoLesson("Kotlin for Beginners - Part 1 - WHY LEARN KOTLIN?","k9K71QkrHGE"),
        VideoLesson("Kotlin for Beginners - Part 2.1 - INSTALL INTELLIJ IDEA ON WINDOWS","fwZyfudxnNo"),
        VideoLesson("Kotlin for Beginners - Part 3 - HELLO WORLD!","1676actiiME"),
        VideoLesson("Kotlin for Beginners - Part 4 - VARIABLES","kYO7YWVB3jY"),
        VideoLesson("Kotlin for Beginners - Part 5 - BASIC DATA TYPES","b_qtmAL9540"),
        VideoLesson("Kotlin for Beginners - Part 6 - ARITHMETIC OPERATORS","zzYKHR7nTe0"),
        VideoLesson("Kotlin for Beginners - Part 7 - READ, EVAL, PRINT, LOOP (REPL)","lUiePALzrQs"),
        VideoLesson("Kotlin for Beginners - Part 8 - COMMENTS","4CjchnS02ys"),
        VideoLesson("Kotlin for Beginners - Part 9 - ARRAYS","lWd6TYhnJAk"),
        VideoLesson("Kotlin for Beginners - Part 10 - FOR-LOOP & RANGES","N0p2XUqmU1k"),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),
        VideoLesson("",""),

    )

}