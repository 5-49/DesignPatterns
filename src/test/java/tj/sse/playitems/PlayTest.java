package tj.sse.playitems;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.playItems.decorator.RobotGame;
import tj.sse.playItems.facade.Booking;
import tj.sse.playItems.observer.PotionsClass;
import tj.sse.playItems.resChain.WandGame;
import tj.sse.playItems.route.iterator.Route;
import tj.sse.playItems.route.iterator.SpotsName;
import tj.sse.playItems.state.QuidditchGame;
import tj.sse.playItems.template.templatemethod;


/**
 * 娱乐项目的测试
 */
public class PlayTest {
    @Test
    public void test(){
        System.out.println("---------------- [Playitems Test] --------------");
        //一些变量声明
        tj.sse.playItems.Route.strategy.strategyA Route=new tj.sse.playItems.Route.strategy.strategyA();
        String[] path = Route.provideSuggestions();

        SpotsName spotsName=new SpotsName();

        if(AppTest.input){
            System.out.println("\n【Do you want to do some playitems？（Y/N）】");
            while (true){
                String choice;
                choice = AppTest.scanner.next();
                if(choice.equals("N"))
                    break;
                else if(choice.equals("Y")){
                    //交互模式
                    Booking book = new Booking();
                    for(int i = 0; i < path.length; i++){
                        book.book(path[i]);
                    }

                    System.out.println("THE GAME SEQUENCE:");
                    for(Route route = spotsName.getRoute(); route.hasNext();){
                        String name=(String)route.next();
                        System.out.println("Game Name:"+name);
                    }
                    System.out.println("-----Quidditch----");
                    QuidditchGame quidditch = new QuidditchGame();
                    quidditch.play();

                    System.out.println("----WandGame----");
                    WandGame wandGame = new WandGame();
                    wandGame.play();

                    System.out.println("-----PotionClass------");
                    PotionsClass potionClass = new PotionsClass();
                    potionClass.play();


                    templatemethod coaster = new templatemethod();
                    System.out.println("-----JurassicFlyerscoaster------");
                    coaster.playJurassicFlyersCoaster();
                    System.out.println("-----DeceptiCoaster----");
                    coaster.playDecepticoaster();

                    System.out.println("-----Robot Game------");
                    RobotGame robotGame = new RobotGame();
                    robotGame.play();

                    break;
                }
                else
                    System.out.println("error");
            }
        }else{
            //无交互
            Booking book = new Booking();
            for(int i = 0; i < path.length; i++){
                book.book(path[i]);
            }

            System.out.println("THE GAME SEQUENCE:");
            for(tj.sse.playItems.route.iterator.Route route = spotsName.getRoute(); route.hasNext();){
                String name=(String)route.next();
                System.out.println("Game Name:"+name);
            }
            System.out.println("-----Quidditch----");
            QuidditchGame quidditch = new QuidditchGame();
            quidditch.play();

            System.out.println("----WandGame----");
            WandGame wandGame = new WandGame();
            wandGame.play();

            System.out.println("-----PotionClass------");
            PotionsClass potionClass = new PotionsClass();
            potionClass.play();

            templatemethod coaster = new templatemethod();
            System.out.println("-----JurassicFlyerscoaster------");
            coaster.playJurassicFlyersCoaster();
            System.out.println("-----DeceptiCoaster----");
            coaster.playDecepticoaster();

            System.out.println("-----Robot Game------");
            RobotGame robotGame = new RobotGame();
            robotGame.play();

            return;
        }
        System.out.println("-----------------------[End]--------------------------");

    }





}
