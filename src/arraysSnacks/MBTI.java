package arraysSnacks;

import java.util.ArrayList;
import java.util.Scanner;

public class MBTI {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        MBTI mbti = new MBTI();
        System.out.println("What is your name: ");
        mbti.name = scanner.nextLine();
        mbti.quest1();

    }
ArrayList<String> answers = new ArrayList<>();
    String type = "";

    String name;
    String[] questions = new String[20];
    public void quest1(){
        questions[0] = "A. expend energy, enjoy groups     B. conserve energy, enjoy one-on-one";
        questions[1] = "A. Interpret literally     B. look for meaning and possibilities";
        questions[2] = "A. logical, thinking, questioning     B. empathetic feeling, accommodating";
        questions[3] = "A. organized, orderly     B. flexible, adaptable ";
        questions[4] = "A. more outgoing, think out loud     B. more reserved, think to yourself";
        questions[5] = "A. practical, realistic, experimental     B. imaginative, innovative, theoretical ";
        questions[6] = "A. candid, straight forward, frank     B. tactful, kind encouraging";
        questions[7] = "A. plan, scheduled     B. unplanned, spontaneous ";
        questions[8] = "A. seek many tasks, public activities, interaction with others     B. seek private, solitary activities with quiet to concentrate";
        questions[9] = "A. standard, usual, conventional     B. different, novel, unique ";
        questions[10] = "A. firm, tend to criticize, hold the line     B. gentle, tend to appreciate, conciliate";
        questions[11] = "A. regulated, structured     B. easy-going, live and let live! ";
        questions[12] = "A. external, communicative, express yourself     B. internal, reticent, keep to yourself";
        questions[13] = "A. focus on here-and-now     B. look to the future, global perspective, 'big picture' ";
        questions[14] = "A. tough-minded, just     B. tender-hearted, merciful ";
        questions[15] = "A. preparation, plan ahead     B. go with the flow, adapt as you go";
        questions[16] = "A. active, initiate     B. reflective, deliberate ";
        questions[17] = "A. facts, things, what is     B. ideas, dreams, what could be, philosophical";
        questions[18] = "A. matter of fact, issue-oriented     B. sensitive, people-oriented, compassionate";
        questions[19] = "A. control, govern     B. latitude, freedom";



        answerEntered();
        aBCounter();
    }

    public void answerEntered(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        for (int i = 0; i <= 19; i++) {
            System.out.println(questions[i]);
            System.out.println("Select (A or B)");
            answer = scanner.nextLine().toUpperCase();
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")){
                System.out.println("Expected A or B as a response");
                System.out.println("I know this is an error, please retry again");
                System.out.println(questions[i]);
                answer = scanner.nextLine().toUpperCase();
            }
            answers.add(answer.toUpperCase());
        }
    }


    public void aBCounter(){
        System.out.println();
        System.out.printf("""
                Hello %s you selected
                """,this.name);
        int countA = 0;
        int countB = 0;
        int k = 0;
        int m = 0;
        int n = 5;
        for (int i = 0; i < answers.size() / 5; i++) {
            String[] question;
            for (int j = m; j < n; j++) {
                if(answers.get(j).equals("A")){
                    question = questions[k].split(" {5}");
                    System.out.println(question[0]);
                    countA++;
                }else {
                    question = questions[k].split(" {5}");
                    System.out.println(question[1]);
                    countB++;
                }
                k++;
            }
            m += 5;
            n += 5;
            System.out.println("Numbers of A " + countA);
            System.out.println("Number of B " + countB);

            personalityType(countA, countB, i);

            System.out.println();
            countA = 0;
            countB = 0;
        }

        System.out.println(type);
        personalityTypeResult(type);

    }

    public void personalityType(int countA, int countB, int i){
        if (countA > countB && i == 0){
            type = type.concat("E");
        }else if (countA < countB && i == 0){
            type = type.concat("I");
        }else if (countA > countB && i == 1){
            type = type.concat("S");
        } else if (countA < countB && i == 1) {
            type = type.concat("N");
        } else if (countA > countB && i == 2){
            type = type.concat("T");
        } else if (countA < countB && i == 2) {
            type = type.concat("F");
        } else if (countA > countB && i == 3) {
            type = type.concat("J");
        } else if (countA < countB && i == 3) {
            type = type.concat("P");
        }
    }

    public void personalityTypeResult(String type){
        switch (type) {
            case "INFP" -> System.out.println("""
                   \s
                    MEDIATOR
                                       \s
                    A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits.
                    These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
                    Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. Creative and imaginative,
                    they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their minds.
                    These personalities are known for their sensitivity – Mediators can have profound emotional responses to music, art, nature, and the people around them.
                    Few things make Mediators more uneasy than pretending to be someone they aren’t.
                                       \s
                      STRENGTHS                \s
                    * Generous – Mediators rarely enjoy succeeding at other people’s expense.
                    They feel called to share the good things in their lives, give credit where it’s due, and uplift the people around them.
                    These personalities want to contribute to a world where every voice is heard and no one’s needs go unmet.
                                       \s
                    * Passionate – When an idea or movement captures their imagination, Mediators want to give their whole heart to it.
                    People with this personality type may not always be outspoken,\s
                    but that doesn’t diminish their strong feelings for a cause that speaks to their beliefs and convictions.
                   \s
                     WEAKNESSES\s
                    * Unrealistic – Nothing in this world is perfect – and that can be a difficult truth for Mediators to accept.
                    People with this personality type can be hopeless romantics, with rose-colored visions of what their lives should be like.
                    This can set Mediators up for disappointment when reality inevitably falls short of their dreams.
                     \s
                    * Self-Isolating – Mediators long to connect with others, but they don’t always know how.
                    Especially in new environments, Mediators may be reluctant to put themselves out there in ways that would help them make new friends or become involved in a new community.
                    As a result, people with this personality type may sometimes feel lonely or isolated.
                     \s
                    * Desperate to Please – Conflict tends to be stressful for Mediators, who yearn for harmony and acceptance.
                    When someone dislikes or disapproves of them, these personalities may become fixated on trying to clear the air and change that person’s mind.
                    Unfortunately, Mediators’ desire to please others can drain their energy, eclipsing their inner wisdom and their awareness of their own needs.
                   \s
                        ROMANTIC RELATIONSHIPS
                    Mediators (INFPs) are dreamers and idealists, especially when it comes to romance.
                    People with this personality type believe in the power and beauty of true love, and they sincerely hope never to settle for anything less.
                    It’s fair to say, then, that Mediators approach the world of romance with high expectations.
                    They may have spent years daydreaming about the perfect relationship, imagining how it would feel to share their innermost selves with another person.
                    But the reality of dating can come as something of a shock to Mediators, forcing them to grapple with a challenging question:
                    If they want to be in a relationship, will they have to compromise on their ideals?
                    Mediators don’t just want to find a partner – they want to connect with a soul mate.
                    Thoughtful and open-minded, these personalities are generally willing to consider going out with all sorts of people.
                    Mediators pride themselves on their ability to look past a potential partner’s superficial traits – such as appearance, social status, or possessions – and focus on deeper, more meaningful signals of compatibility.
                      \s
                       FRIENDSHIPS               \s
                    When it comes to their social lives, Mediators (INFPs) may find themselves caught in a web of contradictions.
                    People with this personality type crave alone time, but they’re also vulnerable to loneliness.
                    They long to feel accepted and well-liked, but they hate the idea of pretending to be anyone but their authentic selves.
                    And while they hesitate to draw attention to themselves, they don’t want to be invisible, either.
                                       \s
                      CAREER PATHS
                    Many Mediators (INFPs) long for a career that doesn’t just take care of the bills but also feels fulfilling.
                    They want to spend their days doing something they genuinely love, preferably without too much stress or drama.
                                                        \s
                   \s""");
            case "INTJ" -> System.out.println("""
                                 ARCHITECT
                    An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits.
                    These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do.
                    Their inner world is often a private, complex one.
                    Architects can be both the boldest of dreamers and the bitterest of pessimists.
                    They believe that, through willpower and intelligence, they can achieve even the most challenging goals.
                    But these personalities may be cynical about human nature more generally, assuming that most people are lazy, unimaginative, or simply doomed to mediocrity.
                                       \s
                               FRIENDSHIP
                    Sharp-witted and darkly funny, Architects (INTJs) aren’t everyone’s cup of tea – and they’re okay with that.
                    For the most part, people with this personality type aren’t obsessed with being popular.
                    They don’t spend their time and energy on just anyone, and they can be difficult to get to know.
                                        
                              CAREER PATHS
                    Architects (INTJs) are rarely satisfied by work that feels easy or comfortable.
                    They want a career that fires up their curiosity and leverages their intellect,\s
                    allowing them to expand their prowess as they tackle meaningful challenges and problems.
                    If a job’s description makes the average person think, Wow, that sounds hard, then it might just be a good fit for an Architect.
                    Creative and visionary, Architects want to find a career that takes advantage of their unique gifts.
                    Few personality types, if any, can match their ability to transform complex principles into clear, actionable strategies.
                    Architects know how much they can offer the world through their work – and their priority is to ensure that their position,\s
                    whatever it may be, makes full use of their skills, knowledge, and intellect.
                                        
                               STRENGTHS
                    ** Curious – Architects are open to new ideas – as long as those ideas are rational and evidence-based, that is.
                    Skeptical by nature, Architects are especially drawn to offbeat or contrarian points of view.
                    And if the facts prove them wrong, they are generally happy to revise their opinions.
                    
                    ** Original – Without Architects, the world would be a far less interesting place.
                    This personality type’s rebellious streak is responsible for some of history’s most unconventional ideas and inventions.
                    Even in their everyday lives, Architects force the people around them to consider new (and sometimes startling) ways of looking at things.
                    
                    ** Informed – Few personality types are as devoted as Architects to developing rational, correct, and evidence-based opinions.
                    Rather than hunches or half-baked assumptions, they base their conclusions on research and analysis.
                    This gives them the conviction that they need to stand up for their ideas, even in the face of disagreement.
                          
                                WEAKNESSES
                    ** Arrogant – Architects might be knowledgeable, but they’re not infallible.
                    Their self-assurance can blind them to useful input from other people,
                    especially anyone they deem to be intellectually inferior.
                    These personalities can also come across as needlessly harsh or single-minded in trying to prove others wrong.
                                     \s
                    ** Dismissive of Emotions – For Architects, rationality is king.
                    But emotional context often matters more than people with this personality type care to admit.
                    Architects can get impatient with anyone who seems to value feelings more than facts.
                    Unfortunately, ignoring emotion is its own type of bias – one that can cloud Architects’ judgment.
                                            
                    """);
            case "INTP" -> System.out.println("""
                              LOGICIAN
                    A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits.
                    These flexible thinkers enjoy taking an unconventional approach to many aspects of life.
                    They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                    Logicians often lose themselves in thought – which isn’t necessarily a bad thing.
                    People with this personality type hardly ever stop thinking.
                    From the moment they wake up, their minds buzz with ideas, questions, and insights. At times,
                    they may even find themselves conducting full-fledged debates in their own heads.
                                        
                           STRENGTHS
                    * Analytical – Logicians analyze everything that they come across, from research data to the behavior of the people around them.
                    This gives them a knack for spotting unexpected patterns and connections that other personality types might overlook.
                                           
                    * Open-Minded – Logicians are driven by curiosity and an intense desire to learn everything that they can.
                    People with this personality type tend to be receptive to new ideas and ways of doing things,
                    as long as those ideas are supported by sound reasoning.
                                        
                    * Objective – Logicians care about the truth. Rather than taking comfort in ideology or received ideas,
                    they want to understand what’s really going on beneath the surface of things. As a result,
                    they can be relied upon to combat bias and misinformation, even when it isn’t easy to do so,
                    and they expect other people to be honest with them in return.
                     
                             WEAKNESS
                    * Insensitive – People with this personality type see rationality as the key to a better, happier world.
                    At times, they may underestimate the importance of such irrational values as emotion, compassion, etiquette, and tradition.
                    As a result, they may inadvertently come across as insensitive or unkind, even though their intentions are generally good.
                                        
                    * Impatient – Logicians take pride in their knowledge and in sharing their ideas.
                    When it comes to explaining their rationale, however, they aren’t always patient.
                    If their conversation partner doesn’t follow along or seem sufficiently interested, Logicians may give up with a dismissive “never mind.”
                     
                    * Perfectionistic – Logicians want to get things done, but their quest for perfection can get in the way.
                    At times, these personalities may get so lost in analyzing various options that they never reach a decision.
                    They may also give up on projects that don’t match the ideal vision in their mind.
                      
                               ROMANTIC RELATIONSHIPS
                    Logicians’ unusual combination of traits often comes as a pleasant surprise to their romantic partners.
                    People with this personality type may seem cerebral and reserved, but once they let their guard down,\s
                    they have a playful, creative side as well.
                    As Introverts, Logicians appreciate alone time, but that doesn’t mean that they don’t crave companionship.
                                        
                    For people with this personality type, the ideal romantic partner isn’t just someone to pass the time with but an equal who can challenge their ideas.
                    Logicians want to spend their life in pursuit of learning and growth.
                    They hope that the person they love will not just share this mission but also actively encourage it.
                     
                    Few people love conflict, but Logicians are especially prone to shutting down when emotional disagreements arise.
                    Rather than slowing down and really listening, they may use their powers of logic to try to prove their partner wrong.
                    Alternatively, they might offer easy, logical solutions, not wanting to delve into the messiness of deeper issues and feelings.
                                        
                                 FRIENDSHIPS             \s
                    Like anyone, Logicians look to their friends for companionship and support.
                    But people with this personality type prize something else as well: intellectual depth. Not everyone,
                    will meet Logicians’ standards for a potential friend,
                    but when someone does,
                    the connection can spark instantly, surprising everyone who thought they had this seemingly distant personality type pegged.
                      
                    Perhaps because they don’t mind the company of their own thoughts, Logicians don’t surround themselves with people just for the sake of it.
                    As a result, it’s not always easy to become close friends with these personalities. But when Logicians do open up, they can be lively,
                    imaginative friends who always have something interesting or unexpected to say.
                                        
                                CAREER PATHS          \s
                    Freethinking and eccentric, Logicians may struggle to find jobs and career paths that really suit them.
                    Logicians are unusual personalities with unique perspectives on the world, and few work environments,
                    are designed with them in mind.
                                      
                    """);
            case "ENTJ" -> System.out.println("""
                                   COMMANDER
                    A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits.
                    They are decisive people who love momentum and accomplishment.
                    They gather information to construct their creative visions but rarely hesitate for long before acting on them.                              \s
                    Your time is limited, so don’t waste it living someone else’s life.
                                
                    Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence,
                    and project authority in a way that draws crowds together behind a common goal.
                    However, Commanders are also characterized by an often ruthless level of rationality,\s
                    using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves.
                    Perhaps it is best that they make up only three percent of the population,\s
                    lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world,
                    but we have Commanders to thank for many of the businesses and institutions we take for granted every day.
                                        
                                 STRENGTHS       \s
                    * Efficient – Commanders see inefficiency not just as a problem in its own right, but as something,
                    that pulls time and energy away from all their future goals,
                    an elaborate sabotage consisting of irrationality and laziness.
                    People with the Commander personality type will root out such behavior wherever they go.
                      
                    * Energetic – Rather than finding this process taxing Commanders are energized by it,\s
                    genuinely enjoying leading their teams forward as they implement their plans and goals.
                      
                                WEAKNESSES
                    * Stubborn and Dominant – Sometimes all this confidence and willpower can go too far,
                    and Commanders are all too capable of digging in their heels, trying to win every single debate and pushing their vision, and theirs alone.
                                        
                    * Arrogant – Commander personalities respect quick thoughts and firm convictions,\s
                    their own qualities, and look down on those who don’t match up.
                    This relationship is a challenge for most other personality types who are perhaps not timid in their own right,\s
                    but will seem so beside overbearing Commanders.
                                        
                              ROMANTIC RELATIONSHIPS
                    As in other areas of their lives, Commanders approach dating and relationships with a set of goals and a plan to achieve them,
                    and proceed to do so with impressive energy and enthusiasm. People with the Commander personality type are in it to win,
                    and will gladly take leading roles in relationships from the start,\s
                    assuming personal responsibility for how smoothly things go and working actively to ensure a mutually rewarding experience.\s
                    Romantic relationships are a serious business, and Commanders are in it for the long haul.
                                        
                              FRIENDSHIPS           \s
                    As in most aspects of their lives, in friendship Commanders seek personal growth and inspiration,\s
                    and they often have a plan for how to accomplish it.
                    Friendships of circumstance, built on things like shared routines, are not Commanders’ preferred method,
                    rather, they pursue their friends, seek out individuals who share their passion for deep, meaningful discussions,\s
                    and who enjoy learning and development as much as they do.
                    It is not always easy to be Commanders’ friends – they demand a lot from these relationships,\s
                    but they pay a great deal of attention to their friendships, and it is unlikely that it will ever feel stagnant.
                                        
                              CAREER PATHS    \s
                    It is in the world of careers that Commanders’ boldness and drive are truly at their best.
                    No other personality type is better suited than Commanders to be the respected leader of an organization or team,\s
                    and no other personality type enjoys it quite so much.
                    Combining their vision, intelligence and determination to push ideas through to completion no matter the obstacles,\s
                    Commanders are a force to be reckoned with.
                        
                    """);
            case "ENTP" -> System.out.println("""
                                    DEBATER
                    A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits.\s
                    They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.\s
                    They pursue their goals vigorously despite any resistance they might encounter.
                                        
                    Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact,
                    they’re not afraid to disagree with pretty much anything or anyone. Few things light up people with,
                    this personality type more than a bit of verbal sparring –
                    and if the conversation veers into controversial terrain, so much the better.
                     
                    It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited. Instead,
                    people with this personality type are knowledgeable and curious, with a playful sense of humor,
                    and they can be incredibly entertaining.
                    They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate.
                                        
                                        STRENGTHS
                    * Knowledgeable – Debaters rarely pass up a good opportunity to learn something new, especially abstract concepts.
                    This information isn’t usually absorbed for any planned purpose as with dedicated studying,
                    people with the Debater personality type just find it fascinating.
                    
                    * Quick Thinkers – Debaters have tremendously flexible minds,
                    and are able to shift from idea to idea without effort,
                    drawing on their accumulated knowledge to prove their points, or their opponents’, as they see fit.
                                             
                    * Excellent Brainstormers – Nothing is quite as enjoyable to Debaters as analyzing problems,
                    from every angle to find the best solutions.
                    Combining their knowledge and originality to splay out every aspect of the subject at hand,
                    rejecting without remorse options that don’t work and presenting ever more possibilities,
                    Debaters are irreplaceable in brainstorming sessions.
                      
                              WEAKNESSES
                    * Very Argumentative – If there’s anything Debaters enjoy, it’s the mental exercise of debating an idea,
                    and nothing is sacred. More consensus-oriented personality types rarely appreciate the vigor with which,
                    Debater personalities tear down their beliefs and methods, leading to a great deal of tension.
                    
                    * Insensitive – Being so rational, Debaters often misjudge others feelings and push their debates well past others’ tolerance levels.
                    People with this personality type don’t really consider emotional points to be valid in such debates either,
                    which magnifies the issue tremendously.
                    
                    * Dislike Practical Matters – Debaters are interested in what could be – malleable concepts like ideas,
                    and plans that can be adapted and debated.
                    When it comes to hard details and day-to-day execution where creative flair isn’t just unnecessary but actually counter-productive,
                    Debater personalities lose interest, often with the consequence of their plans never seeing the light of day.
                     
                             ROMANTIC RELATIONSHIPS
                    If there’s one thing Debaters are good at,
                    it’s coming up with a never-ending stream of innovations and ideas to keep things moving forward,
                    and this is evident in their romantic relationships as well.
                    For people with the Debater personality type growth is key,
                    and even before they’ve found a dating partner,
                    they imagine all the ways that they can experience new things together,
                    to grow in tandem. This can be an overwhelming process if their partner doesn’t match up,
                    but when Debaters find someone who shares their love of intellectual exploration, watch out.
                                        
                    From the earliest dates, Debaters test their partners’ limits for this kind of potential,
                    pushing boundaries and traditions, looking for open-mindedness and spontaneity.
                    Dating Debater personalities is hardly a boring experience,
                    and they make use of their enthusiasm and creativity by delighting and surprising their partners with new ideas and experiences.
                        
                              FRIENDSHIPS          \s
                    Loyalty, support, emotional feedback – these are not what Debaters look for in their friendships.
                    The last thing people with the Debater personality type want to hear is “you’re right”,
                    not unless they have absolutely earned the distinction in a heated round of intellectual debate.
                    If they’re wrong, Debaters want to be told so, and they want every detail of the faults in their logic to be laid bare,
                    partly in their quest for oftentimes arbitrary truth, and partly just so they have to work to defend that logic with counterpoint and parry.                         \s
                     
                              CAREER PATHS         \s
                    In the world of careers,
                    Debaters have the benefit of being naturally engaged and interested in being productive and helpful.
                    But rather than the sort of people-oriented helpfulness that Diplomat personality types bring to the table,
                    Debater personalities are focused on developing solutions to interesting and diverse technical and intellectual problems.
                    Debaters are a versatile personality type,
                    and while it may take time for them to get to a point where they can fully utilize their skillset and qualities,
                    they are likely to find that those qualities translate well into pretty much any career that so much as piques their interest.
                                                       
                    """);
            case "INFJ" -> System.out.println("""
                                ADVOCATE
                    An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits.
                    They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values,
                    and a quiet, principled version of humanism guide them in all things.
                                        
                    Advocates (INFJs) may be the rarest personality type of all,
                    but they certainly leave their mark on the world. Idealistic and principled,
                    they aren’t content to coast through life – they want to stand up and make a difference.
                    For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment,
                    helping others, and being a force for good in the world.
                                        
                                STRENGTHS
                    * Creative – Advocates aren’t exactly like everyone else – and that’s a wonderful thing.
                    People with this personality type embrace their creative side,
                    always on the lookout for opportunities to express themselves and think outside the box.                    \s
                                        
                    * Principled – Advocates tend to have strong beliefs and values,
                    particularly when it comes to matters of ethics.
                    When Advocates talk about topics close to their heart,
                    their conviction and heartfelt idealism can inspire and persuade even the sternest of skeptics.
                                        
                    * Passionate – Advocates crave a sense of purpose in life.
                    Rather than living on autopilot or sticking to the status quo,\s
                    they want to chase after their ideals. This isn’t a personality type that shies away from big dreams,
                    in fact, Advocates are energized and impassioned by the beauty of their visions for the future.
                         
                              WEAKNESSES
                    * Sensitive to Criticism – Advocates aren’t averse to feedback – that is,
                    unless they believe that someone is challenging their most cherished principles or values.
                    When it comes to the issues that are near and dear to them,
                    people with this personality type can become defensive or dismissive.
                    
                    * Reluctant to Open Up – Advocates value honesty and authenticity,
                    but they’re also private. They may find it difficult to open up and be vulnerable about their struggles,
                    not wanting to burden someone else with their issues. Unfortunately, when Advocates don’t ask for help,
                    they may inadvertently hold themselves back or create distance in their relationships.
                       
                            ROMANTIC RELATIONSHIP    \s
                    Advocates (INFJs) look for depth and meaning in their relationships,
                    and their romantic relationships are no different.
                    This is a personality type known for having a vibrant, vivid imagination,
                    but few Advocates can imagine themselves settling for a match founded on anything less than true love.
                                        
                    It can take time for Advocates to find a compatible partner.
                    Some people might think that Advocates are too choosy,
                    and it’s true that these personalities can be prone to unrealistic expectations.
                    With their perfectionistic, idealistic nature, Advocates might be tempted to hold out for a “perfect”
                    partner or relationship that ultimately doesn’t exist. The good news? Advocates’ idealism –
                    if balanced with just enough realism – can actually enhance their love life.
                                        
                            FRIENDSHIPS             \s
                    Advocates (INFJs) rarely settle for shallow, superficial friendships.
                    When it comes to social fulfillment, they aren’t satisfied by casual interactions with colleagues or classmates.
                    Advocate personalities crave authentic, meaningful friendships – friendships that allow them to share their dreams,
                    bare their souls, and feel understood and accepted for who they are.
                    And if that means having just one or two confidants rather than a wide circle of acquaintances, so be it.
                                        
                    While Advocates may seem quiet or reserved to the world at large,
                    they absolutely light up around their close friends.
                    Few things bring them more pleasure or delight than talking through their passions,\s
                    interests, and beliefs with a kindred spirit. People with this personality type enjoy the pleasure of their own company,\s
                    but Advocates still find it liberating to let their guard down and be completely and utterly themselves with a friend they know they can trust.
                                        
                              CAREER PATHS
                    Advocates (INFJs) long to find a career that aligns with their values and their dreams –
                    a career that allows them to fulfill their unique mission in this world. For these personalities,
                    a job isn’t satisfying if it doesn’t offer a deeper sense of purpose – no matter how good the salary is.
                    The good news is that people with this personality type can use their creativity and determination to find work that suits their needs in just about any field.
                                        
                    In fact, Advocates have trouble deciding which job is best for them because they’re able to imagine so many possibilities.
                    They may see half a dozen wildly different paths forward, each with its own set of rewards.
                    This can be exciting but also stress-inducing, because picking just one means letting go of so many others.
                    Advocates may even feel a sense of loss when so many doors close because one was selected.
                                                         
                    """);
            case "ISFP" -> System.out.println("""
                                ADVENTURER
                    An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits.
                    They tend to have open minds, approaching life, new experiences, and people with grounded warmth.
                    Their ability to stay in the moment helps them uncover exciting potentials.
                                        
                    In their relationships, Adventurers are warm, friendly, and caring,
                    taking wholehearted enjoyment in the company of their nearest and dearest.
                    But make no mistake: this is an Introverted personality type,
                    meaning that Adventurers need dedicated alone time to recharge their energy after socializing with others.
                    This alone time is what allows Adventurers to reestablish a sense of their own identity –
                    in other words, to reconnect with who they truly are.
                                        
                                  STRENGTHS
                    * Charming – People with the Adventurer personality type are relaxed and warm,
                    and their “live and let live” attitude naturally makes them likable and popular.
                    
                    * Sensitive to Others – Adventurers easily relate to others’ emotions,
                    helping them to establish harmony and good will, and minimize conflict.
                    
                    * Imaginative – Being so aware of others’ emotions,
                    Adventurer personalities use creativity and insight to craft bold ideas that speak to people’s hearts.
                    While it’s hard to explain this quality on a resume,
                    this vivid imagination and exploratory spirit help Adventurers in unexpected ways.
                     
                            WEAKNESSES
                    * Fiercely Independent – Freedom of expression is often Adventurers’ top priority.
                    Anything that interferes with that, like traditions and hard rules, creates a sense of oppression for Adventurer personalities.\s
                    This can make more rigidly structured academics and work a challenge.
                    
                    * Unpredictable – Adventurers’ dislike long-term commitments and plans.
                    The tendency to actively avoid planning for the future can cause strain in Adventurers’
                    romantic relationships and financial hardship later in life.
                    
                    * Easily Stressed – Adventurers live in the present, full of emotion.
                    When situations get out of control, people with this personality type (especially Turbulent ones) can shut down,
                    losing their characteristic charm and creativity in favor of gnashing teeth.
                                            
                            ROMANTIC RELATIONSHIPS
                    Adventurers are quite mysterious and difficult to get to know.
                    While very emotional individuals, they guard this sensitive core carefully, preferring to listen than to express.
                    People with the Adventurer personality type focus instead on their partners,
                    with little interest in dictating the mood of a situation with their own feelings.
                    While this can sometimes be frustrating, if they are accepted for who they are,
                    Adventurers prove to be warm, enthusiastic partners.
                    
                    It’s important for their partners to make it clear that this love and attention is valued.
                    Adventurers would never ask for such thanks, but it can really hurt their feelings if they don’t hear it.
                    Such expressions don’t have to be verbal – Adventurers believe in actions, not words –
                    but it’s crucial that they know their feelings are shared. On the other side of the spectrum,
                    there are few types more vulnerable to criticism and conflict, and it’s necessary to provide a certain level of emotional support.
                                        
                    If they do feel appreciated, Adventurers are more than happy to reciprocate in any way they know how.
                    People with the Adventurer personality type are very sensual, and in no aspect of their lives is this clearer than in their sex lives.
                    Intimacy is an opportunity for Adventurers to satisfy their partners, and they involve every sense available in enjoying these moments.
                    Adventurers may be shy in public, but alone with a partner they trust, the masks come off – few people get to see this side,
                    and it’s always a pleasant surprise.
                                        
                               FRIENDSHIPS
                    In friendship, Adventurers are some of the most comfortable people around.
                    Laid back and spontaneous, people with the Adventurer personality type won’t bog things down with arguments or structured long-term plans.
                    Intellectually exhausting pastimes like debates over European economic policy won’t hold their attention long.
                    The here-and-now is what’s important to Adventurers, and they love spending time with their friends doing casual, fun activities.
                                        
                                CAREER PATHS
                    When it comes to the career world, Adventurers need more than just a job.
                    Wealth, power, structure, advancement and security are all lesser goals to Adventurer personalities’ greatest need: creative freedom.
                    Adventurers crave a tangible outlet for their imagination, a chance to express themselves artistically.
                                                          
                    """);
            case "ENFJ" -> System.out.println("""
                                    PROTAGONIST
                    A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits.
                    These warm, forthright types love helping others, and they tend to have strong ideas and values.
                    They back their perspective with the creative energy to achieve their goals.
                                        
                    Protagonists (ENFJs) feel called to serve a greater purpose in life.
                    Thoughtful and idealistic, these personality types strive to have a positive impact on other people and the world around them.
                    They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                                        
                                STRENGTHS
                    * Receptive – Protagonists have strong opinions, but they’re far from closed-minded.
                    They recognize the importance of allowing others to express themselves fully.
                    Even when Protagonists don’t agree with someone, they recognize that person’s right to voice their truth.
                    
                    * Reliable – Few things bother Protagonists more than the prospect of letting down a person or cause that they believe in.
                    People with this personality type can be counted on to see their promises and responsibilities through – even when it’s difficult to do so.
                    
                    * Passionate – Protagonists are far from being boring do-gooders.
                    These types brim with interests, and they take great pleasure in pursuing their hobbies –
                    whether that’s hiking, cooking, dancing, growing houseplants, or something else entirely.
                    As a result, they rarely find themselves at a loss for something interesting to do.
                      
                               WEAKNESSES
                    * Overly Idealistic – Protagonists tend to have clear ideas about what’s right and what’s wrong.
                    They often think that everyone shares these fundamental principles – or, at least, that everyone should share these principles.
                    So it can come as a genuine shock to Protagonists when people violate their core values, such as truth or justice.
                    
                    * Condescending – People with this personality type enjoy teaching others,
                    particularly about the causes and beliefs that matter so much to them.
                    But, at times, Protagonists’ attempts to “enlighten” others may come across as patronizing –
                    not the most effective strategy for persuading other people, unfortunately.
                    
                    * Intense – When it comes to self-improvement,
                    Protagonists are rarely short on energy or determination.
                    But they may not recognize that not everyone shares these qualities.
                    At times, Protagonists may push others to make changes that they aren’t ready for –
                    or simply aren’t interested in making in the first place.                   \s
                          
                          ROMANTIC RELATIONSHIPS             \s
                    Protagonists (ENFJs) can be intense when it comes to matters of the heart –
                    and they wouldn’t have it any other way. People with this personality type rarely settle for anything that falls short of their ideals,
                    and their romantic relationships are no exception.
                    When Protagonists fall for someone, they tend to fall hard – and they’re not coy about it.
                    Protagonists are among the personality types that most readily express how they feel,
                    so they often find themselves making the first move, rather than playing games or waiting for reassurance that the other person feels the same way.
                                        
                    In the dating world, Protagonists’ willingness to put themselves out there can be refreshing and more than a little unusual.
                    This, along with the intensity of their passion, is incredibly appealing to many people.
                    That said, because Protagonists do so often make the first move,
                    they may encounter their share of rejection as they search for a kindred spirit.
                                        
                             FRIENDSHIPS
                    Connecting with other people makes Protagonists (ENFJs) feel alive and purposeful.
                    It’s no surprise, then, that they are anything but apathetic about friendship.
                    Protagonists put sincere, dedicated effort into staying close with their friends.
                    For these personalities, friendships are far from expendable or insignificant – instead,
                    they’re a key component of a life well lived.
                       
                            CAREER PATHS           \s
                    When it comes to choosing a career, Protagonists (ENFJs) find fulfillment in doing what they love most –
                    helping other people. And with their creativity and drive,
                    they can find ways to serve and uplift others in nearly any work environment,
                    whether they’re behind a gleaming table in a corporate boardroom or behind the counter at a beloved local coffee shop.
                                                          
                    """);
            case "ENFP" -> System.out.println("""
                    A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits.
                    These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.
                    Their vibrant energy can flow in many directions.
                    
                    Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded.
                    With their lively, upbeat approach to life, they stand out in any crowd.
                    But even though they can be the life of the party, Campaigners don’t just care about having a good time.
                    These personality types run deep – as does their longing for meaningful, emotional connections with other people.
                                        
                             STRENGTHS
                    * Curious – Campaigners can find beauty and fascination in nearly anything.
                    Imaginative and open-minded,
                    these personalities aren’t afraid to venture beyond their comfort zones in search of new ideas,
                    experiences, and adventures.
                    
                    * Perceptive – To people with this personality type, no one is unimportant –
                    which might explain how they can pick up on even the subtlest shifts in another person’s mood or expression.
                    Because they’re so sensitive to other people’s feelings and needs,
                    Campaigners can make full use of their caring, considerate nature.
                    
                    * Enthusiastic – When something captures their imagination and inspires them,
                    Campaigners want to share it with anyone who will listen.
                    And they’re just as eager to hear other people’s ideas and opinions –
                    even if those thoughts are wildly different from their own.
                      
                               WEAKNESSES              \s
                    * People-Pleasing – Most Campaigners are uncomfortable with the prospect of being disliked.
                    To maintain the peace, they may compromise on things that matter to them or allow other people to treat them poorly.
                    And when they fail to win someone over, they might lose sleep trying to figure out what to do about it.
                    
                    * Unfocused – The thrill of a new project – especially one that involves collaborating with other people –
                    can bring out the best in Campaigners. But this personality type is known for having ever-evolving interests,
                    meaning that Campaigners may find it challenging to maintain discipline and focus over the long term.
                    
                    * Disorganized – Campaigners’ enthusiasm is legendary, but it doesn’t extend to everything.
                    Specifically, people with this personality type may try to avoid boring, practical matters,
                    such as chores, maintenance, or paperwork.
                    The resulting sense of disorganization can become a major source of stress in their lives.
                     
                              ROMANTIC RELATIONSHIPS
                    When Campaigners are interested in someone, they rarely hold back.
                    People with this personality type tend to fall in love easily – and they fall hard.
                    Campaigners shower their new flame with affection, trusting that the devotion and passion that they feel are real.
                                        
                    Optimists at heart, Campaigners are undaunted by the practical challenges and inconveniences of a new partnership.
                    This might explain why they generally don’t shy away from long-distance relationships – in their minds,
                    physical distance is no match for the power of true love. Rather than focusing on potential issues,
                    Campaigners sink into the joys of a relationship’s honeymoon stage, constantly looking for ways to prove their dedication and delight their partner.
                                        
                              FRIENDSHIPS
                    As friends, Campaigners (ENFPs) are cheerful and supportive.
                    They’re nearly always up for a little lighthearted banter – or a deep, heartfelt,
                    emotional discussion about anything and everything.
                                        
                    Generous and giving, Campaigners have much to offer in the realm of friendship.
                    At times, however, they may struggle with a suspicion that they care more about their friends than their friends care about them –
                    a suspicion that can leave these sociable, warmhearted personalities feeling more than a little lonely.
                                        
                              CAREER PATHS
                    Maybe I could…fly helicopters and be an oceanographer who writes songs and cooks?”
                    Campaigners (ENFPs) are known for having a wealth of ideas, interests, and hobbies –
                    to the extent that they may struggle to fit everything that they care about into their lives.
                                        
                    It’s no surprise, then, that choosing a career path can leave people with this personality type feeling overwhelmed or scattered.
                    They may feel pulled in multiple directions, uncertain of how to honor their passions and keep their options open while pulling in a steady paycheck.
                                                 
                    """);
            case "ISFJ" -> System.out.println("""
                    A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits.
                    These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible,
                    giving careful attention to practical details in their daily lives.
                    
                    In their unassuming, understated way, Defenders help make the world go round.
                    Hardworking and devoted, people with this personality type feel a deep sense of responsibility to those around them.
                    Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions,
                    and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do,
                    preferring instead to operate behind the scenes.                   \s
                          
                            STRENGTHS
                    * Supportive – Defenders truly enjoy helping others, and they happily share their knowledge, attention,
                    and expertise with anyone who needs it. People with this personality type strive for win-win situations,
                    choosing teamwork over competition whenever possible.
                    
                    * Reliable – Rather than working in sporadic, excited bursts that leave things half finished,
                    Defenders are meticulous and careful. They take a steady approach,
                    ensuring that things are done to the highest standard – and often going well beyond what is required.
                    
                    * Observant – Defender personalities have a talent for noticing things, particularly about other people.
                    They pay attention to the smallest details of what someone says and does,
                    giving them unexpected insights into other people’s lives and emotions.
                    
                            WEAKNESSES
                    * Overly Humble – Defenders are so concerned with other people’s feelings that they may refuse to,
                    make their thoughts known or to take any duly earned credit for their contributions.
                    And they often downplay their efforts entirely when they think that they could have done some minor aspect of a task better.
                    
                    * Taking Things Personally – Although they might try to hide it, people with this personality type are deeply sensitive to others’ opinions,
                    and they can be thrown off-balance if someone doesn’t appreciate, approve of, or agree with them.
                    When they encounter criticism or disagreement – even if it’s well intentioned –
                    Defenders may feel as if they’re experiencing a personal attack.
                    
                    * Repressing Their Feelings – Private and reserved, Defenders tend to internalize their feelings, particularly negative ones.
                    This can create misunderstandings in their relationships. Eventually,
                    all of their repressed feelings and resentments may boil over in a sudden, uncharacteristic outburst of frustration.
                                         
                            ROMANTIC RELATIONSHIPS
                    Romantic relationships bring out a side of this personality type that may not be obvious at first glance.
                    Beneath their mild, unassuming exteriors, Defenders thrum with passionate commitment and loyalty toward the people they love.
                    At times, Defenders themselves may be surprised by the intensity of their feelings,
                    especially their fierce desire to protect and care for their partner.
                                                          
                    Defenders’ emotions run deep – so deep that people with this personality type may struggle to find the words to express just how much their partner means to them.
                    But Defenders show their affection in a million little ways on a daily basis.
                    Always eager to make their loved ones’ lives better and more pleasant,
                    Defenders can transform even the most prosaic of tasks – from cooking dinner to organizing a weekend trip – into a heartfelt gesture of love and care.\s
                                        
                              FRIENDSHIPS
                     Given how warm, supportive, and generous Defenders are, it’s not surprising that others gravitate toward them as friends.
                     But while people with this personality type value and even cherish their friendships,
                     they don’t find it easy to bond with just anyone.
                     
                     Defenders tend to be private and a bit protective of themselves,
                     and it can take them a while to feel comfortable enough to open up to someone new.
                     This explains why most of Defenders’ friendships don’t start as random encounters on a wild night out,
                     but rather through comfortable and consistent contact – for example, at school or at work.
                     Defenders appreciate the opportunity to deepen their connection with another person over time,
                     with the two friends gradually sharing more and more of themselves with each other.
                     
                            CAREER PATHS
                    Defenders are often the backbone of their workplace: reliable, hardworking, and always ready to lend a hand.
                    People with this personality type take pride in getting the job done and getting it done well,
                    rarely cutting corners or balking at a time-consuming task. This unshakable work ethic, combined with a genuine desire to be of service to others,
                    makes Defenders invaluable in a range of careers.
                    
                    With their natural humility, Defender personalities tend to feel especially fulfilled by careers that allow them to facilitate others’ growth, healing, and progress.
                    Teaching is a prime example of this, as are speech therapy, occupational therapy, physical therapy, medicine, and social work.
                    Defenders’ patience and ability to stay present in the moment enable them to be incredibly attuned to the needs of the people they are serving.
                                                                 
                    """);
            case "ESTJ" -> System.out.println("""
                    EXECUTIVE
                    An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits.
                    They possess great fortitude, emphatically following their own sensible judgment.
                    They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                    
                    Executives are representatives of tradition and order, utilizing their understanding of what is right,
                    wrong and socially acceptable to bring families and communities together.
                    Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance,
                    and they happily lead the way on difficult paths. Taking pride in bringing people together,
                    Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished local events,
                    or in defense of the traditional values that hold families and communities together.
                                        
                              STRENGTHS
                    ** Dedicated – Seeing things to completion borders on an ethical obligation for Executives.
                    Tasks aren’t simply abandoned because they’ve become difficult or boring –
                    people with the Executive personality type take them up when they are the right thing to do,
                    and they will be finished so long as they remain the right thing to do.
                    
                    ** Strong-willed – A strong will makes this dedication possible,
                    and Executives don’t give up their beliefs because of simple opposition.
                    Executives defend their ideas and principles relentlessly, and must be proven clearly and conclusively wrong for their stance to budge.
                    
                    ** Direct and Honest – Executives trust facts far more than abstract ideas or opinions.
                    Straightforward statements and information are king,
                    and Executive personalities return the honesty (whether it’s wanted or not).
                      
                           WEAKNESSES
                    ** Inflexible and Stubborn – The problem with being so fixated on what works is that Executives too often dismiss what might work better.
                    Everything is opinion until proven, and Executive personalities are reluctant to trust an opinion long enough for it to have that chance.
                    
                    ** Uncomfortable with Unconventional Situations – Executives are strong adherents to tradition and when suddenly forced to try unvetted solutions,
                    they become uncomfortable and stressed. New ideas suggest that their methods weren’t good enough,
                    and abandoning what has always worked before in favor of something that may yet fail risks their image of reliability.
                    
                    ** Judgmental – Executives have strong convictions about what is right, wrong, and socially acceptable.
                    Executives’ compulsion to create order often extends to all things and everyone,
                    ignoring the possibility that there are two right ways to get things done.
                    Executives do not hesitate to let these “deviants” know what they think, considering it their duty to set things right.
                                         
                           ROMANTIC RELATIONSHIPS
                    Executives are fairly unique in that their relationships don’t really change as they progress from the dating phase into more steady,
                    long-term relationships and further into marriage. Because they value honesty and straightforwardness so highly,
                    people with the Executive personality type are likely to be clear about who they are,
                    what they’re like and what their goals are from the start, and to stick to those statements long-term.
                    So long as their partner is able to take them at their word and follow suit, they are bound to be extremely stable relationships.
                    
                    This may all sound a little stale, and indeed Executives are not spontaneous or unpredictable people,
                    but they do very much enjoy taking their partners out and having fun. Social events and activities are Executives’ idea of a good time,\s
                    and while they may rely on familiar people and places, they do bring lots of energy and enthusiasm, which helps keep things interesting.
                                        
                    Executives approach intimacy with similarly physical, active intentions, and from fairly traditional ones as well.
                    Wild ideas and poetry are for less mature personalities, or so Executives might say,
                    though they do appreciate recognition and well-placed compliments to maintain high self-esteem.
                    They may look for more stability in their sex lives than most, but Executives never fail to bring their characteristic vigor.
                                        
                            FRIENDSHIPS
                    Executives are strong, traditional friends who appreciate loyalty and shared values.
                    Friendships with the Executive personality type are often defined by their mutual activities and routines,
                    by external factors, more so than the sense of intellectual or mystical compatibility that many Analyst and Diplomat personalities share among themselves.
                    But this in no way diminishes the relationships – Executives’ friendships of dependability and mutual interest can be powerful connections that endure life’s changes with immutable constancy.
                    Among their established friends, Executives show themselves to be outgoing and enthusiastic,
                    always more than happy to bring others along for some healthy sport and outdoor activity.
                    Executives sometimes get a little overbearing in their push for participation,
                    but it’s just because they want everyone to have a good time.
                    Executives’ friends are never short on invites to social activities and events, from tickets to a local ball game, to a weekend camping trip, to Sunday BBQ.
                                        
                            CAREER PATHS
                    Executives’ career paths are often as clear and straightforward as they are themselves.
                    Though there are many directions they can choose to go,
                    people with the Executive personality type almost always end up in situations where they have the opportunity to exercise their affinity for organization,
                    structure, and follow-through. Providing further focus, Executives share a profound respect for tradition, stability and security,
                    qualities which lend themselves well to progressing along clear paths to increased responsibility and dependability.
                    
                    Executives’ sense of loyalty results in them staying with a single employer as long as possible,
                    and their reverence for established institutions often leads to work with well-respected organizations.
                    Law enforcement, military service, hospitals and prominent legal firms are all able to recognize Executives’ long years of service.
                                                         
                    """);
            case "ESFJ" -> System.out.println("""
                    CONSUL
                    A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits.
                    They are attentive and people-focused, and they enjoy taking part in their social community.
                    Their achievements are guided by decisive values, and they willingly offer guidance to others.
                    
                    For Consuls, life is sweetest when it’s shared with others.
                    People with this personality type form the bedrock of many communities,
                    opening their homes – and their hearts – to friends, loved ones, and neighbors.
                                        
                    This doesn’t mean that Consuls like everyone, or that they’re saints.
                    But Consuls do believe in the power of hospitality and good manners,
                    and they tend to feel a sense of duty to those around them. Generous and reliable,
                    people with this personality type often take it upon themselves – in ways both large and small –
                    to hold their families and their communities together.
                                        
                          STRENGTHS
                    ** Strong Practical Skills – Consuls are excellent managers of day-to-day tasks and routine maintenance,
                    enjoying making sure that those who are close to them are well cared for.
                    
                    ** Strong Sense of Duty – People with the Consul personality type have a strong sense of responsibility and strive to meet their obligations,
                    though this may sometimes be more from a sense of social expectations than intrinsic drive.
                    
                    ** Very Loyal – Valuing stability and security very highly, Consuls are eager to preserve the status quo,
                    which makes them extremely loyal and trustworthy partners and employees.
                    Consuls are true pillars of any groups they belong to – whether it is their family or a community club,
                    people with this personality type can always be relied upon.
                       
                          WEAKNESSES
                    ** Worried about Their Social Status – These Strengths are related to a chief Weakness: Consuls’ preoccupation with social status and influence,\s
                    which affects many decisions they make, potentially limiting their creativity and open-mindedness.
                    ** Inflexible – Consuls place a lot of importance on what is socially acceptable, and can be very cautious,
                    even critical of anything unconventional or outside the mainstream.
                    People with this personality type may also sometimes push their own beliefs too hard in an effort to establish them as mainstream.
                    ** Reluctant to Innovate or Improvise – Just as they can be critical of others’ “unusual” behavior,
                    Consuls may also be unwilling to step out of their own comfort zones, usually for fear of being (or just appearing) different.
                       
                        ROMANTIC RELATIONSHIPS
                    Prizing social validation and a sense of belonging so highly, romantic relationships hold a special level of importance for Consuls.
                    No other kind of relationship provides people with the Consul personality type with the same level of support and devotion,
                    and the feelings of security and stability that come with strong romantic relationships are extremely warming.
                    If they feel like this support isn’t there, such as when their partners deliver criticism, Consuls can feel extremely hurt.
                    People with the Consul personality type dislike conflict and criticism, which can make it challenging to address any problems that come up.
                    Nothing is more hurtful or depressing to Consuls than to realize that their partners don’t respect their dreams or opinions.\s
                    Consuls can be surprisingly tough and tireless in the face of hardship, but they need to know without a doubt that their partners are behind them 100%.
                                        
                           FRIENDSHIPS
                    Consuls are a very social personality type, seeking large circles of friends and proving themselves more than willing to spend the time and energy necessary to maintain these relationships.
                    Loyal and warm, Consuls are known for standing by their friends no matter what, and providing a constant source of emotional support and encouragement.
                    Doing everything they can to make sure their friends are happy, and being so comfortable with introductions and small talk,
                    Consuls are naturally very popular in pretty much any environment. This is a dynamic that Consuls genuinely enjoy, but they also expect their efforts and support to be reciprocated.
                    There’s nothing quite as hurtful to people with the Consul personality type as finding out that a trusted friend is critical of their beliefs or habits, except maybe being told so in a direct confrontation.
                                        
                         CAREER PATHS
                    Because Consuls’ traits are so strongly expressed, leading with practical sense and social vigor,
                    the careers they find most satisfying usually revolve around making the best use of these qualities.
                    Consuls are well-organized, enjoying bringing order and structure to their workplaces, and often work best in environments with clear,
                    predictable hierarchies and tasks. Monotony and routine work are not a challenge for the Consul personality type, as they are happy to do what needs to be done.
                    Careers as administrators are a natural fit, allowing Consuls to organize not just an environment, but the people in it.
                    Their practical skills combine well with their dependability, making Consul personalities surprisingly good accountants – though they often prefer to be personal accountants,
                    helping people and interacting with them directly, instead of corporate accountants crunching numbers in some back room.
                                                       
                    """);
            case "ISTP" -> System.out.println("""
                    VIRTUOSO
                    A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits.
                    They tend to have an individualistic mindset, pursuing goals without needing much external connection.
                    They engage in life with inquisitiveness and personal skill, varying their approach as needed.
                    Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity.
                    People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go.
                    Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before.
                                        
                             STRENGTHS
                    ** Optimistic and Energetic – Virtuosos are usually up to their elbows in some project or other.
                    Cheerful and good-natured, people with the Virtuoso personality type (especially Assertive ones) rarely get stressed out, preferring to go with the flow.
                    ** Creative and Practical – Virtuosos are very imaginative when it comes to practical things, mechanics, and crafts.
                    Novel ideas come easily, and they love using their hands to put them into action.
                    ** Spontaneous and Rational – Combining spontaneity with logic, Virtuosos can switch mindsets to fit new situations with little effort, making them flexible and versatile individuals.
                       
                             WEAKNESSES
                    ** Stubborn – As easily as Virtuosos go with the flow, they can also ignore it entirely, and usually move in another direction with little apology or sensitivity.
                    If someone tries to change Virtuosos’ habits, lifestyle or ideas through criticism, they can become quite blunt in their irritation.
                    ** Insensitive – Virtuosos use logic, and even when they try to meet others halfway with empathy and emotional sensitivity,
                    it rarely seems to quite come out right,
                    if anything is even said at all.
                    ** Private and Reserved – Virtuoso personalities are notoriously difficult to get to know. They are true introverts,
                    keeping their personal matters to themselves, and often just prefer silence to small talk.
                       
                             ROMANTIC RELATIONSHIPS
                    When it comes to romantic relationships with Virtuosos, it’s a bit like nailing Jell-O to a tree.
                    Dating Virtuoso personalities is a tango, complex and interesting, with alternating coldness and detachment, and passion, spontaneity and enjoyment of the moment.
                    Nothing can be forced in Virtuoso relationships, but so long as they are given the space they need to be themselves, they will gladly enjoy the comforts of a steady partner for a lifetime.
                    Early in dating, people with the Virtuoso personality type can be especially flighty – they live in the present, always looking for new activities and experiences.
                    If a potential partner doesn’t measure up, Virtuosos have no real problem walking away. Virtuosos also need a great deal of personal space, both physically and mentally,
                    and any attempts to control them or forcibly schedule their activities only accelerates their departure.
                                        
                             FRIENDSHIPS
                    Early in dating, people with the Virtuoso personality type can be especially flighty – they live in the present, always looking for new activities and experiences.
                    If a potential partner doesn’t measure up, Virtuosos have no real problem walking away. Virtuosos also need a great deal of personal space,
                    both physically and mentally, and any attempts to control them or forcibly schedule their activities only accelerates their departure.
                    A lot of this comes down to Virtuosos simply not wanting to be bound to any particular person or activity.
                    Virtuoso personalities live in the present, enjoying whatever life brings, and feel no real obligation to shift course on account of others’ plans.
                    If friends don’t want to do what Virtuosos are doing, then they are free to go do their own thing, and they’ll hang out some other time.
                    Sometimes their shifts in attitude can catch their friends flat-footed, but Virtuosos’ motto remains “everything can be changed”.
                    Forcing them to constantly commit to scheduled activities is probably the quickest way to end these friendships.
                                        
                        CAREER PATHS
                    The Virtuoso personality type is probably the hardest to pin down in many aspects of life, but especially in their careers.
                    Virtuosos thrive on diversity and unpredictability, on wondering “what’s next?” every morning.
                    This makes Virtuosos one of the most mysterious personality types, but also one of the most versatile in the professional world.
                                        
                    Virtuosos are born problem-solvers with an unwavering focus on practical solutions (though perhaps not always solutions to practical problems).
                    No other type is quite as fascinated by how things work, how tools can be used, and how facts can be put together to create immediate and satisfying results.
                    This combination of curiosity and hands-on vigor make people with the Virtuoso personality type excellent mechanics, engineers, graphic designers, and forensic scientists.
                                                            
                    """);
            case "ESTP" -> System.out.println("""
                    ENTREPRENEUR
                    An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits.
                    They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities,
                    whether socializing with others or in more personal pursuits.
                    Entrepreneurs always have an impact on their immediate surroundings –
                    the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group.
                    Laughing and entertaining with a blunt and earthy humor,
                    Entrepreneur personalities love to be the center of attention.
                    
                    If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.
                                        
                         STRENGTHS
                    ** Bold – People with the Entrepreneur personality type are full of life and energy.
                    There is no greater joy for Entrepreneurs than pushing boundaries and discovering and using new things and ideas.
                    ** Rational and Practical – Entrepreneurs love knowledge and philosophy, but not for their own sake.
                    What’s fun for Entrepreneur personalities is finding ideas that are actionable and drilling into the details so they can put them to use.
                    If a discussion is completely arbitrary, there are better uses for Entrepreneurs’ time.
                    ** Original – Combining their boldness and practicality, Entrepreneurs love to experiment with new ideas and solutions.
                    They put things together in ways no one else would think to.
                       
                       WEAKNESSES
                    ** Insensitive – Feelings and emotions come second to facts and “reality” for Entrepreneurs.
                    Emotionally charged situations are awkward, uncomfortable affairs, and Entrepreneurs’ blunt honesty doesn’t help here.
                    These personalities often have a lot of trouble acknowledging and expressing their own feelings as well.
                    
                    ** Impatient – Entrepreneurs move at their own pace to keep themselves excited.
                    Slowing down because someone else “doesn’t get it” or having to stay focused on a single detail for too long is extremely challenging for Entrepreneurs.
                    
                    ** Risk-prone – This impatience can lead Entrepreneurs to push into uncharted territory without thinking of the long-term consequences.
                    Entrepreneur personalities sometimes intentionally combat boredom with extra risk.
                         
                         ROMANTIC RELATIONSHIPS
                    When it comes to romantic relationships, people with the Entrepreneur personality type can hardly be said to be pining away for their wedding day.
                    Life is fun and full of surprises (something Entrepreneurs have particular skill in delivering),
                    and they enjoy it all in the here and now. Entrepreneurs may not spend a lot of time planning for “someday”,
                    but their enthusiasm and unpredictability make them thrilling dating partners.
                    
                    Entrepreneurs love new ideas and the occasional philosophical discussion –
                    but they need to be topics that can explored through action together, not just idle talk.
                    There’s musing about the causes and effects of epidemic obesity,
                    and there’s training for a marathon together to promote healthy living.
                                        
                         FRIENDSHIPS
                    People with the Entrepreneur personality type are definitely the life of the party.
                    With an enviable imagination and invigorating sense of spontaneity, Entrepreneurs are never boring.
                    They love exploring interesting ideas, both in discussion and by going out and seeing for themselves,
                    which means that Entrepreneurs always seem to have some fun activity hidden up their sleeves.
                    At the same time, Entrepreneur personalities are easy-going, tolerant, and charming, making them naturally quite popular.
                    
                    Hands-on, physical activities like team sports are Entrepreneurs’ idea of fun,
                    and these environments give them plenty of chances to make new friends.
                    There is little difficulty for Entrepreneurs here – they seem to get along with just about everyone,
                    and make new friends wherever they go. Entrepreneurs live in the moment,
                    and as a naturally confident personality type (especially if they are Assertive as well),
                    they don’t worry much about what others think of them.
                    This attracts friends who share their attitude and zest for life.
                                        
                         CAREER PATHS
                    When it comes to Entrepreneurs’ career options, “action” is the word of the day.
                    People with the Entrepreneur personality type think on their feet and are great at making quick decisions in the heat of the moment.
                    At the same time, they’re affable people who always seem to make friends and connections wherever they go.
                    Popularity and solid networking can be huge assets in the working world, and Entrepreneurs nail it.
                    
                    This social intelligence, combined with Entrepreneurs’ natural boldness and improvisational skill,
                    makes sales, business negotiations, marketing, even acting – any tense, competitive environment –
                    a great fit. Entrepreneur personalities trust themselves to make the right call. Risks, big and small,
                    are a part of life, and Entrepreneurs don’t sit around waiting for some boss at the top to tell them what to do.
                    This can get Entrepreneurs into trouble, but often enough it’s exactly what’s needed,
                    and can boost them up the career ladder just as well.
                                                       
                    """);
            case "ESFP" -> System.out.println("""
                    ENTERTAINER
                    An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits.
                    These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
                    They can be very social, often encouraging others into shared activities.
                    If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type.
                    Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too.
                    No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging others,
                    and no other personality type does it with such irresistible style.
                                        
                          STRENGTHS
                    ** Bold – Entertainers aren’t known for holding back.
                    Wanting to experience everything there is to experience,
                    people with the Entertainer personality type don’t mind stepping out of their comfort zones when no one else is willing.
                    
                    ** Original – Traditions and expectations are secondary to Entertainers,
                    if a consideration at all. Entertainer personalities love to experiment with new styles,
                    and constantly find new ways to stick out in the crowd.
                    
                    ** Aesthetics and Showmanship – Not stopping at mere outfits,
                    Entertainers inject artistic creativity into their words and actions, too.
                    Every day is a performance, and Entertainers love to put on a show.
                       
                          WEAKNESSES
                    ** Sensitive – Entertainers (especially Turbulent ones) are strongly emotional,
                    and very vulnerable to criticism – they can feel like they’ve been backed into a corner, sometimes reacting badly.
                    This is probably Entertainers’ greatest weakness, because it makes it so hard to address any other weaknesses brought to light.
                    
                    ** Conflict-Averse – Entertainers sometimes ignore and avoid conflict entirely.
                    They tend to say and do what’s needed to get out of such situations, then move on to something more fun.
                    
                    ** Easily Bored – Without constant excitement, Entertainers find ways to create it themselves. Risky behavior,
                    self-indulgence, and the pleasures of the moment over long-term plans are all things Entertainers get into a little too often.
                         
                         ROMANTIC RELATIONSHIPS
                    Entertainers are social, fun-loving, free-spirited people who live life in the moment and squeeze every little bit of excitement from everything.
                    Naturally, they don’t spare any of this freshness and energy when dating.
                    For people with the Entertainer personality type, relationships aren’t about slowly building foundations for the future,
                    or planning out a life – they are bubbling, unpredictable things to be enjoyed for as long as there’s enjoyment to be had.
                    Of course, when that enjoyment does burn out, it’s gone. Entertainers reevaluate their situations and commitments constantly,
                    regardless of professions of love and dedication today.\s
                    If a week later they just don’t feel the same, that’s it, and Entertainer personalities have no problem seriously considering breaking things off.\s
                    While Entertainers can be willing to work on their relationships rather than swap them out,
                    it takes a great deal of maturity and experience for them to realize that it can be worth the bother.
                                        
                          FRIENDSHIPS
                    Entertainers are known for their irrepressibly social and excited attitudes.\s
                    They don’t internalize much of anything, sharing it all with their extensive circles of friends with wit, style, enthusiasm, and optimism.\s
                    Entertainers are explorers of the pleasures of life, and they take particular pleasure in sharing those experiences with others.\s
                    For Entertainers, there’s no point in living if you can’t feel alive.
                    Entertainers are people of action. Getting out with activities that engage all five senses is Entertainer personalities’ idea of a good time. Sometimes though,\s
                    Entertainers may go too far with risky or careless behaviors, and try to bring others along for the ride.\s
                    People with this personality type are sensitive, and rejecting these pastimes can be taken personally, ending friendships then and there.\s
                    Entertainers don’t have time to be lectured.                   \s
                                        
                            CAREER PATHS
                    Entertainers have a unique quality that makes them exceptional in some careers, and miserable in others – they mirror the mood around them.\s
                    When people with the Entertainer personality type are at a party or concert, they reflect that mood, giving them that “party people” image.\s
                    When their friends are sad, they mirror that with sympathy and empathy. And when there is a crisis, Entertainers adapt as well, matching the intensity of the situation.
                    As a result, just about any career that focuses on working with others is a good fit, and is even essential for Entertainers to be happy and productive.\s
                    Entertainer personalities are natural event planners, sales representatives, trip planners, and tour guides, as each of these creates a sense of excitement, stimulation, and novelty between them and their customers.
                    Entertainers genuinely enjoy spending time with others and getting to know them, and have a knack for making people happy, even in the most frustrating situations.\s
                    A good challenge is always appreciated by Entertainer personalities, and they make wonderful and inspiring counselors, social workers, personal coaches, and consultants who improve employee or customer satisfaction.
                                                          
                    """);
        }

    }



}
