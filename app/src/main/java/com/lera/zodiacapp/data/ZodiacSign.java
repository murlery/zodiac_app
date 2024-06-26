package com.lera.zodiacapp.data;

public class ZodiacSign {

    private static final String[] zodiacSigns = {
            "овен", "телец", "близнецы", "рак", "лев", "дева",
            "весы", "скорпион", "стрелец", "козерог", "водолей", "рыбы"
    };

    public static boolean isValidZodiacSign(String zodiacSign) {
        String zSign = zodiacSign.toLowerCase();
        for (String sign : zodiacSigns) {
            if (sign.equals(zSign)) {
                return true;
            }
        }
        return false;
    }

    public static String calculateCompatibility(String zodiacWoman, String zodiacMan) {
        zodiacWoman = zodiacWoman.toLowerCase();
        zodiacMan = zodiacMan.toLowerCase();

        if (zodiacWoman.equals("овен") && zodiacMan.equals("овен")){
            return  "91%\n В любви много страсти и непредсказуемости, маловато нежности (хотя у них она просто немного другая, как бы они ее сами назвали – активная, горячая нежность, этакая нежность-лава), почти нет стабильности в том понимании, в каком мы привыкли ее рассматривать. Зато все максимально честно: никаких недомолвок и взглядов по сторонам. Они оба знают, что хотят только друг друга.";}
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("телец"))||(zodiacWoman.equals("телец") && zodiacMan.equals("овен"))){
            return "81%\n Они могут полюбить друга друга крепко, нежно, навсегда. Мужчину будет привлекать ее энергия, которой иногда не хватает ему самому (или которую он прячет ото всех, а часто и от себя), а она найдет в нем стабильность, которой ей так не хватает. Но не хватает ли?.. Поначалу кажется, что да. Но постепенно эта размеренность и даже монотонность начинает сводить ее с ума. Его же в свою очередь нервирует ее испульсивность – зачем так нелепо расходовать силы, думает он.";}
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("близнецы"))||(zodiacWoman.equals("близнецы") && zodiacMan.equals("овен"))){
            return "75%\n Отношения между женщиной-Овном и мужчиной-Близнецами нельзя назвать очень близкими и душевными. Cтихия огня подразумевает, что чувства быстро вспыхивают и также быстро остывают, воздушная стихия говорит о том, что чувства легкие и ветренные. Эта кратковременность чувств, эмоций и чего-то еще – то общее, что у них есть. Не то чтобы их отношения были несерьезными, нет – но всегда будет присутствовать момент неполной глубины. Возможно, это идеальный вариант для мужчины.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("рак"))||(zodiacWoman.equals("рак") && zodiacMan.equals("овен"))){
            return "81%\n Овен – яркий и строптивый, рак – нерешительный и сентиментальный. Кажется, они друг для друга именно то, что нужно. Конечно, ссор не избежать – но мириться они будут так сладко, что полюбят эти ссоры.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("лев"))||(zodiacWoman.equals("лев") && zodiacMan.equals("овен"))){
            return "97%\n Оба они приналежат к стихии Огня: яркие и энергичные, вспыхивают быстро и так же быстро сгорают.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("дева"))||(zodiacWoman.equals("дева") && zodiacMan.equals("овен"))){
            return "84%\n Если овен — это пожар, то дева — портативный огнетушитель. Удобный, практичный, своевременный.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("овен"))){
            return "83%\n Стремительность и нежелание покоряться овна находят отклик в сердце весов. Весы словно созданы для того, чтобы показать овну, что такое любовь и нежность.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("овен"))){
            return "76%\n Поскольку оба знака зодиака — и Овен, и Скорпион — находятся под управлением страстного Марса (а Скорпион вдобавок под влиянием еще более страстного Плутона), между ними складываются горячие отношения. Обычно они замечают друг друга очень быстро: какая-то общая искра помогает им опознать друг друга.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("овен"))){
            return "92%\n В их отношениях будет много страсти, ведь и овен, и стрелец принадлежат к стихии Огня. Разница лишь в том, что овен — это такой первичный огонь. А стрелец являет собой ровное пламя, теплое, приятное, не обжигающее.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("овен"))){
            return "84%\n Овен поражает своим напором, козерог — своей упорностью. Такие похожие слова, и такой разный смысл.";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("овен"))){
            return "88%\n Эти двое на протяжении долгого времени будут оставаться непонятными друг для друга. Там, где овен ищет страсть, водолей ищет дружбу. ";
        }
        else if ((zodiacWoman.equals("овен") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("овен"))){
            return "89%\n Овен катастрофически сложно расслабляется. Рыбы знают о расслаблении все. Этакая взаимная медитация — вот как можно назвать отношения.";
        }
        else if (zodiacWoman.equals("телец") && zodiacMan.equals("телец")){
            return  "87%\n Они стоят друг друга. Наконец-то у каждого их них нашелся достойный друг. Или соперник?";}

        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("близнецы"))||(zodiacWoman.equals("близнецы") && zodiacMan.equals("телец"))){
            return "73%\n Телец – приземленный и очень практичный, близнецы – легкие и ветренные. Сумеют ли они надолго задержаться вместе?";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("рак"))||(zodiacWoman.equals("рак") && zodiacMan.equals("телец"))){
            return "88%\n Телец и рак совершенно точно сумеют создать прочные и долгие отношения, ведь у них так много точек соприкосновения.";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("лев"))||(zodiacWoman.equals("лев") && zodiacMan.equals("телец"))){
            return "88%\n Их отношения — это союз земной невозмутимости и огненной страсти. Хотя, постойте — до союза там далеко.";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("дева"))||(zodiacWoman.equals("дева") && zodiacMan.equals("телец"))){
            return "70%\n Oни так похожи. Оба настроены на длительные и честные отношения. Не будет ли им скучно друг с другом?";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("телец"))){
            return "92%\n Между телецом и весами любовь возникает вполне естественно, ведь обоими знаками управляет Венера — планета любви и романтики. Они находят общее довольно быстро: оба жаждут приятного общения, старомодных ухаживаний и свиданий под луной.";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("телец"))){
            return "98%\n Нет ничего удивительного в том, что они влюбятся друг в друга. Скорпион даст тельцу возможность посмотреть на то, что он сам прячет от себя.";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("телец"))){
            return "81%\n Телец — приземленный, спокойный и рассудительный. Стрелец — оптимистичный, неугомонный. Что они смогут друг другу дать?";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("телец"))){
            return "89%\n Оба земные и рассудительные — эта пара может быть очень крепкой. Они ценят долгие и прочные отношения без сильных эмоциональных встрясок ";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("телец"))){
            return "83%\n Телец — земной, стабильной, любит комфорт и удовольствия. Водолей — неземной, нестабильный, и на комфорт ему плевать.";
        }
        else if ((zodiacWoman.equals("телец") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("телец"))){
            return "91%\n Они неплохо подходят друг другу. Телец — приземленный и заботливый, рыбы — отстраненные и чувствительные.";
        }else if (zodiacWoman.equals("близнецы") && zodiacMan.equals("близнецы")){
            return  "84%\n Oба они — воздушны, легкие, любящие общение и развлечения. Кажется, они сумеют найти общий язык.";}
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("рак"))||(zodiacWoman.equals("рак") && zodiacMan.equals("близнецы"))){
            return "67%\n Близнецы – воздушные, переменчивые. Рак – застенчивый, внутренне противоречивый. Близнецы смогут раскрепостить рака, а он обеспечит им нежность и покой.";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("лев"))||(zodiacWoman.equals("лев") && zodiacMan.equals("близнецы"))){
            return "81%\n Отношения между близнецами и львом очень свежие, интересные, в них не будет места рутине. Лев любит яркие развлечения, близнецы обожают новое общение, обилие информации. ";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("дева"))||(zodiacWoman.equals("дева") && zodiacMan.equals("близнецы"))){
            return "93%\n Меркурий — планета, управляющая и знаком Близнецов, и знаком Девы, диктует своим подопечным особое отношение к любви — интеллектуальное.";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("близнецы"))){
            return "89%\n Они оба — воздушные, любят общение и друг друга. Особенно друг друга.";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("близнецы"))){
            return "93%\n Их различие в том, что близнецы пытаются не драматизировать ни при каких обстоятельствах, а скорпион — гуру драматизации.\n";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("близнецы"))){
            return "98%\n Это две противоположности. Которые, как известно, притягиваются. Со страшной силой.";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("близнецы"))){
            return "82%\n Близнецы– легки, несколько поверхностны, козерог – строгий, даже суровый. Кажется, сложно придумать более разных персонажей. Но они встретились и даже захотели быть вместе. Почему?";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("близнецы"))){
            return "93%\n Они очень похожи. Оба принадлежат к стихии Воздуха, отсюда и глубинное взаимопонимание.";
        }
        else if ((zodiacWoman.equals("близнецы") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("близнецы"))){
            return "82%\n Оба они любят поразвлечься. Обожают романтику, творчество и чувство влюбленности. Кажется, из них сложится отличная парочка.";
        }
        else if (zodiacWoman.equals("рак") && zodiacMan.equals("рак")){
            return  "83%\n Женщина-Рак и мужчина-Рак, бесспорно, понимают друг друга. Их интуиция и чувствование развиты так хорошо, что им не приходится даже озвучивать свои желания";}
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("лев"))||(zodiacWoman.equals("лев") && zodiacMan.equals("рак"))){
            return "82%\n Это люди разных стихий, разного склада. Рак — мягкий, нежный, пленительный. Лев — царственный и важный.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("дева"))||(zodiacWoman.equals("дева") && zodiacMan.equals("рак"))){
            return "84%\n Их отношения могут развиваться, как в типичном романе. Долгие свидания, прогулки под луной и так далее.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("рак"))){
            return "94%\n Отношения между раком и весами будут нежными, ведь оба они настоящие романтики. Рак более глубокий, интровертный, весы — легкие, ориентированы на внутреннюю и внешнюю гармонию, любят все красивое и изящное.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("рак"))){
            return "91%\n Они полюбят друг друга. Кому как ни ей будет близка его глубокая эмоциональность; кому как ни ему будет понятна ее сентиментальность и стремление во всем следовать зову сердца.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("рак"))){
            return "82%\n Рак и Стрелец — знаки трудносовместимые: там, где Рак хочет осесть и остепениться, у Стрельца только начинается веселая кочевая жизнь.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("рак"))){
            return "96%\n Они полные противоположности. Любят друг друга, но бегут друг от друга.";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("рак"))){
            return "84%\n Рак и водолей понимают любовь немного по-разному. Раку она представляется как тесное соединение двух людей, которые заботятся друг о друге. Пожалуй, забота — основной атрибут любви, которую ждет рак. Водолей же рассматривает любовь как союз двух свободных личностей, которым просто хорошо и интересно вместе";
        }
        else if ((zodiacWoman.equals("рак") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("рак"))){
            return "90%\n Они оба принадлежат к Водной стихии, так что понимают, чего хотят — они сами и те, кого они любят.";
        }
        else if (zodiacWoman.equals("лев") && zodiacMan.equals("лев")){
            return  "87%\n Это встреча двух царей — точнее, царя и царицы. Скорее всего, они так и не сумеют определить, кто из них победил в соревновании на величественность, но кое-что они все же для себя выяснят.";        }

        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("дева"))||(zodiacWoman.equals("дева") && zodiacMan.equals("лев"))){
            return  "86%\n Любовь между лвом и девой завяжется не сразу: деве потребуется много времени, чтобы присмотреться ко люву и понять, что он что-то чувствует к яркому и напористому льву.";
        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("лев"))){
            return  "76%\n Они достаточно разные, чтобы привлечь внимание друг друга — и достаточно похожие, чтобы продолжить знакомство.";        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("лев"))){
            return  "98%\n Они оба — огненные, порывистые, сложные. Им будет страшно интересно вместе.";        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("лев"))){
            return  "90%\n  Они очень похожи. Яркие, самодостаточные — особенно стрелец.";        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("лев"))){
            return  "76%\n Отношения льва и козерога полны страсти и трудностей. Во-первых, лев большой собственник, а козерог всецело принадлежит себе самому. Во-вторых, лев гиперэмоциональный, козерог же постоянно сдерживает свои порывы, выглядит сухим и бесчувственным. ";        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("лев"))){
            return  "97%\n Лев – полный эгоист, водолей же – законченный альтруист. Как думаете, кто в этой паре будет центром Вселенной?";        }
        else if ((zodiacWoman.equals("лев") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("лев"))){
            return  "83%\n Лев — яркий и страстный, рыбы — нежные и робкие. Они должны неплохо друг другу подойти.";        }
        else if (zodiacWoman.equals("дева") && zodiacMan.equals("дева")){
            return  "75%\n Они так похожи, что просто не могут не заметить друг друга. Но смогут ли они по-настоящему заинтересоваться друг другом – вот это вопрос.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("весы"))||(zodiacWoman.equals("весы") && zodiacMan.equals("дева"))){
            return  "74%\n Дева любит порядок, весы — гармонию. Посмотрим, насколько совместимы эти понятия.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("дева"))){
            return  "98%\n Дева – практична и порядочна. Скорпион – горяч и хладнокровен одновременно. Их встреча похожа на встречу удава и мышки – очень хитрой мышки.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("дева"))){
            return  "75%\n Любовь между девой и стрельцом — явление нечастое. Как правило, дева выбирает себе в спутники кого-то более серьезного, тихого и неприметного. Стрелец же сразу поражает деву своим «размахом»: он заметный, громкий, и не то чтобы очень серьезный.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("дева"))){
            return  "61%\n Когда встречаются дева и козерог, они понимают, что нашли друг друга. Безусловное понимание, общее мировоззрение, одни и те же ценности.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("дева"))){
            return  "72%\n Любовные отношения девой и водолеем могут быть полными романтики — если только дева позволит себе такую роскошь. Дело в том, что для девы водолея — это что-то за гранью.";}
        else if ((zodiacWoman.equals("дева") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("дева"))){
            return  "67%\n Дева – сама рациональность и практичность. Рыбы всегда расслаблены и имеют богатое воображение. Дева привыкла к четкому графику, рыбам же по душе спонтанность и отсутствие рамок.";}
        else if (zodiacWoman.equals("весы") && zodiacMan.equals("весы")){
            return  "95%\n Пожалуй, это самый дипломатичный союз из всех возможных.";}
        else if ((zodiacWoman.equals("весы") && zodiacMan.equals("скорпион"))||(zodiacWoman.equals("скорпион") && zodiacMan.equals("весы"))){
            return  "64%\n Они оба обожают любовь. Только вот представляют ее по-разному. Весы — как что-то легкое, воздушное, единение душ. Скорпион — как страстное, ревнивое, опасное, пронзающее.";   }
        else if ((zodiacWoman.equals("весы") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("весы"))){
            return  "88%\n Если между весами и стрельцом возникли отношения, они будут очень интересными. Дело в том, что и весы, и стрелец обожают новые впечатления и крайне привязчивы к тем, кого они любят.";   }
        else if ((zodiacWoman.equals("весы") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("весы"))){
            return  "98%\n Отношения между женщиной-Весы и мужчиной-Козерогом могут быть очень романтичными. Если они поженятся, то сделают все, чтобы их семейная жизнь была долгой и счастливой. ";   }
        else if ((zodiacWoman.equals("весы") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("весы"))){
            return  "96%\n Они оба не любят долгих выяснений отношений, а любят когда все легко, просто и хорошо.";   }
        else if ((zodiacWoman.equals("весы") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("весы"))){
            return  "81%\n Они обратят внимание друг на друга довольно скоро: рыбам, несомненно, понравится легкость и нежность. Весы же будут заворожены галантностью и мягкостью.";   }
        else if (zodiacWoman.equals("скорпион") && zodiacMan.equals("скорпион")){
            return  "94%\n Это два сгустка кипучей энергии, страсти, завышенных амбиций и глубокой чувствительности. Оказавшись рядом, они вряд ли смогут отказаться от искушения попробовать друг друга на вкус.";}
        else if ((zodiacWoman.equals("скорпион") && zodiacMan.equals("стрелец"))||(zodiacWoman.equals("стрелец") && zodiacMan.equals("скорпион"))){
            return  "86%\n Любовные отношения между скорпионом и стрельцом будут очень интересными. Они будут гнаться друг за другом по очереди.";}
        else if ((zodiacWoman.equals("скорпион") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("скорпион"))){
            return  "100%\n Их отношения — искренние и настоящие. Дело в том, что пробудить любовь козерога не так-то просто, и вот именно скорпион может достучаться до него.";}
        else if ((zodiacWoman.equals("скорпион") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("скорпион"))){
            return  "88%\n Безусловно, они сразу обратят друг на друга внимание. Такие смелые, дерзкие и в то же время глубокие и ранимые.";}
        else if ((zodiacWoman.equals("скорпион") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("скорпион"))){
            return  "97%\n  Они оба — чувственные, страстные и нежные. Романтики между этими двумя будет море.";}
        else if (zodiacWoman.equals("стрелец") && zodiacMan.equals("стрелец")){
            return  "100%\n Если вы когда-нибудь видели людей, которые отражают друг друга, словно в зеркале, вероятно, это были женщина и мужчина - стрелецы.";}
         else if ((zodiacWoman.equals("стрелец") && zodiacMan.equals("козерог"))||(zodiacWoman.equals("козерог") && zodiacMan.equals("стрелец"))){
            return  "79%\n Главной ценностью стрельца является умение не унывать и непрекращающийся поток оптимизма. Главной ценностью козерога является умение все доводить до конца и брать самые большие высоты, пусть окольными путями.";}
        else if ((zodiacWoman.equals("стрелец") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("стрелец"))){
            return  "100%\n Они оба порывистые, свободные и энергичные. Их пара похожа на союз солнца и ветра — звучит очень привлекательно, правда?";}
        else if ((zodiacWoman.equals("стрелец") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("стрелец"))){
            return  "71%\n Часто они думают одинаково. Общее мировоззрение значит для них больше, чем страсть и влечение.";}
        else if (zodiacWoman.equals("козерог") && zodiacMan.equals("козерог")){
            return  "84%\n Они стоят друг друга. Оба практичные, целеустремленные и… зацикленные на себе.";}
         else if ((zodiacWoman.equals("козерог") && zodiacMan.equals("водолей"))||(zodiacWoman.equals("водолей") && zodiacMan.equals("козерог"))){
            return  "82%\n Это очень интересная пара. Козерог пытается ограничить водолея, а он никак не ограничивается.";}
        else if ((zodiacWoman.equals("козерог") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("козерог"))){
            return  "67%\n Любовь между козерогом и рыбами может быть очень крепкой. У них похожие ценности, и семья является приоритетной. Скорее всего, они заключат брак не в молодом, а достаточно зрелом возрасте";}
        else if (zodiacWoman.equals("водолей") && zodiacMan.equals("водолей")){
            return  "77%\n Планета Уран, которая управляет знаком Водолея, обязывает его любить все странное, необычное, непривычное и свободно. Вот поэтому-то женщина и мужчина-Водолей, едва завидя друг друга, влюбляются страстно и бесповоротно.";}
        else if ((zodiacWoman.equals("водолей") && zodiacMan.equals("рыбы"))||(zodiacWoman.equals("рыбы") && zodiacMan.equals("водолей"))){
            return  "100%\n У них похожие взгляды. Кажется, они сумеют понять друг друга достаточно глубоко.";}
        else if (zodiacWoman.equals("рыбы") && zodiacMan.equals("рыбы")){
            return  "100%\n  Это союз двух неуловимых и загадочных личностей, одна из которых к тому же и женщина.";}
        else return " ";

}}
