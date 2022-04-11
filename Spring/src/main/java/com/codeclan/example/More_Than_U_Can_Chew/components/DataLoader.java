package com.codeclan.example.More_Than_U_Can_Chew.components;


import com.codeclan.example.More_Than_U_Can_Chew.models.*;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BakeryRepository bakeryRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BakeryItemRepository bakeryItemRepository;

    @Autowired
    ImageRepository imageRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Bakery pita = new Bakery("Pain in the Ass","G208QR", "hello@painintheass.com", LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);
        Bakery bakeThat = new Bakery("Bake That","GEO2", "gary@bakethat.com", LocalTime.parse("17:30:00"));
        bakeryRepository.save(bakeThat);
        Bakery cakeMyDay = new Bakery("Cake My Day!","GEO3", "harry@cakemyday.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(cakeMyDay);
        Bakery poc = new Bakery("Piece Of Cake","GEO4", "homer@pieceofcake.com", LocalTime.parse("16:00:00"));
        bakeryRepository.save(poc);
        Bakery bb = new Bakery("Breaking Bread","GEO5", "babs@bornandbread.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(bb);
        Bakery wkyd = new Bakery("We Knead Your Dough","GEO6", "richie@kneadyourdough.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(wkyd);
        Bakery poyr = new Bakery("The Path Of Yeast Resistance","GEO7", "bill@yeastresistance.com", LocalTime.parse("18:10:00"));
        bakeryRepository.save(poyr);
        Bakery hitb = new Bakery("History In The Baking","GEO8", "james@historicbakers.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(hitb);
        Bakery aac = new Bakery("Accept All Cookies","GEO9", "choc@chipcookies.com", LocalTime.parse("17:00:00"));
        bakeryRepository.save(aac);



        User terry = new User("Terry Rex", "GEO1", "T@rex.com");
        userRepository.save(terry);
        User jambo = new User("Jambo the Elephant", "GEO2", "G@rex.com");
        userRepository.save(jambo);
        User arnie = new User("Arnie Pye", "GEO3", "arnie@pyeinthesky.com");
        userRepository.save(arnie);
        User patty = new User("Patty Cake", "GEO4", "paddycake@gmail.com");
        userRepository.save(patty);
        User tori = new User("Tori Sponge", "GEO5", "tsponge@aol.com");
        userRepository.save(tori);
        User cara = new User("Cara Melle", "GEO6", "caramelle@hotmail.co.uk");
        userRepository.save(cara);
        User geoff = new User("Geoff Bredd", "GEO7", "geoffb@rocketmail.com");
        userRepository.save(geoff);
        User sarah = new User("Sarah Do", "GEO8", "sarahdo@yahoo.com");
        userRepository.save(sarah);
        User blondie = new User("Blondie", "GEO9", "tophits@yahoo.com");
        userRepository.save(blondie);
        User mads = new User("Madeleine Busby", "GE1O", "madeleine@gmail.com");
        userRepository.save(mads);
        User cc = new User("Cookie Crumboule", "GE11", "sweetlikechocolate@aol.com");
        userRepository.save(cc);
        User anna = new User("Anna S Foster", "GE12", "foster@me.com");
        userRepository.save(anna);
        User jule = new User("Jule Logg", "GE13", "julelogg@hotmail.com");
        userRepository.save(jule);



        BakeryItem croissant = new BakeryItem("Croissant", "gluten, lactose", 1L, 1L, 0);
        bakeryItemRepository.save(croissant);
        BakeryItem roll = new BakeryItem("Roll", "gluten", 2L, 1L, 3);
        bakeryItemRepository.save(roll);
        BakeryItem loaf = new BakeryItem("White Loaf", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(loaf);
        BakeryItem chocCake  = new BakeryItem("A slice of Chocolate Cake", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(chocCake);
        BakeryItem pain = new BakeryItem("Pain aux chocolate", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(pain);
        BakeryItem sour = new BakeryItem("Sourdough loaf", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(sour);
        BakeryItem whole = new BakeryItem("Wholemeal loaf", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(whole);
        BakeryItem cinn = new BakeryItem("Cinnamon Brioche", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(cinn);
        BakeryItem cinn2 = new BakeryItem("Cinnamon Swirl", "gluten", 123L, 1L, 0);
        bakeryItemRepository.save(cinn2);
//
//
//        BakeryItem bagel = new BakeryItem("Plain Bagel", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bagel);
//        BakeryItem bagel2 = new BakeryItem("Cinnamon Bagel", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bagel2);
//        BakeryItem bagel3 = new BakeryItem("Everything Bagel", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bagel3);
//        BakeryItem bagel4 = new BakeryItem("Poppyseed Bagel", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bagel4);
//        BakeryItem bs = new BakeryItem("Billionaire's Shortbread", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bs);
//        BakeryItem dcb = new BakeryItem("Dark Chocolate Brownie", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(dcb);
//        BakeryItem empire = new BakeryItem("Empire Biscuit", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(empire);
//        BakeryItem bakew = new BakeryItem("Bakewell Slice", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(bakew);
//        BakeryItem fruits = new BakeryItem("Fruit Scone", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(fruits);
//        BakeryItem plains = new BakeryItem("Plain Scone", "gluten", 123L, bakeThat, 0);
//        bakeryItemRepository.save(plains);
//
//
//        BakeryItem lemcran = new BakeryItem("Lemon & Cranberry Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(lemcran);
//        BakeryItem mangpass = new BakeryItem("Mango & Passionfruit Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(mangpass);
//        BakeryItem carrotc = new BakeryItem("Carrot Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(carrotc);
//        BakeryItem orangec = new BakeryItem("Orange Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(orangec);
//        BakeryItem mangpass2 = new BakeryItem("Mango & Passionfruit Volcano Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(mangpass2);
//        BakeryItem darkchoc = new BakeryItem("Dark Chocolate Volcano Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(darkchoc);
//        BakeryItem minilem = new BakeryItem("Mini Lemon Meringue Pie", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(minilem);
//        BakeryItem pecpie = new BakeryItem("Pecan Pie", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(pecpie);
//
//
//
//        BakeryItem chococ = new BakeryItem("Chocolate Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(chococ);
//        BakeryItem chocar = new BakeryItem("Chocolate Caramel Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(chocar);
//        BakeryItem redvel = new BakeryItem("Red Velvet Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(redvel);
//        BakeryItem vicspo = new BakeryItem("Victoria Sponge Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(vicspo);
//        BakeryItem lemspo = new BakeryItem("Lemon Sponge Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(lemspo);
//        BakeryItem whicra = new BakeryItem("White Chocolate & Cranberry Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(whicra);
//        BakeryItem passcak = new BakeryItem("Passionfruit Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(passcak);
//        BakeryItem bancak = new BakeryItem("Banana Cake With Cream Cheese", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(bancak);
//        BakeryItem newcak = new BakeryItem("New York Cheesecake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(newcak);
//        BakeryItem choccoca = new BakeryItem("Chocolate Coconut Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(choccoca);
//        BakeryItem floora = new BakeryItem("Flourless Orange Cake", "none", 123L, poc, 0);
//        bakeryItemRepository.save(floora);
//
//
//
//        BakeryItem bague = new BakeryItem("Baguette", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(bague);
//        BakeryItem brioch = new BakeryItem("Brioche", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(brioch);
//        BakeryItem chall = new BakeryItem("Challah", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(chall);
//        BakeryItem ciaba = new BakeryItem("Ciabatta", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(ciaba);
//        BakeryItem cornb = new BakeryItem("Cornbread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(cornb);
//        BakeryItem focac = new BakeryItem("Focaccia", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(focac);
//        BakeryItem multi = new BakeryItem("Multigrain", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(multi);
//        BakeryItem pitab = new BakeryItem("Pita Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(pitab);
//        BakeryItem potab = new BakeryItem("Potato Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(potab);
//        BakeryItem ryebr = new BakeryItem("Rye Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(ryebr);
//        BakeryItem sodab = new BakeryItem("Soda Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(sodab);
//
//
//
//        BakeryItem whibr = new BakeryItem("White Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(whibr);
//        BakeryItem brobr = new BakeryItem("Brown Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(brobr);
//        BakeryItem vedbr = new BakeryItem("Veda Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(vedbr);
//        BakeryItem soubr = new BakeryItem("Sourdough Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(soubr);
//        BakeryItem corbr = new BakeryItem("Corn Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(corbr);
//        BakeryItem yeabr = new BakeryItem("Yeast Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(yeabr);
//        BakeryItem sofro = new BakeryItem("Soft Roll", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(sofro);
//        BakeryItem morro = new BakeryItem("Morning Roll", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(morro);
//
//
//
//        BakeryItem savta = new BakeryItem("Savoury Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(savta);
//        BakeryItem frata = new BakeryItem("Frangipane Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(frata);
//        BakeryItem cwcak = new BakeryItem("Carrot & Walnut Cake", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(cwcak);
//        BakeryItem lemta = new BakeryItem("Lemon Meringue Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(lemta);
//        BakeryItem gfcbc = new BakeryItem("Gluten Free Chocolate Brownie Cake", "none", 123L, poyr, 0);
//        bakeryItemRepository.save(gfcbc);
//        BakeryItem chbrc = new BakeryItem("Chocolate Brownie Cake", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(chbrc);
//        BakeryItem chcrt = new BakeryItem("Chocolate Caramel Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(chcrt);
//        BakeryItem whcht = new BakeryItem("White Chocolate Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(whcht);
//
//
//
//        BakeryItem msbdb = new BakeryItem("Millionaire's Shortbread", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(msbdb);
//        BakeryItem mabak = new BakeryItem("Mars Bar Krispy", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(mabak);
//        BakeryItem cheba = new BakeryItem("Cherry Bakewell", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(cheba);
//        BakeryItem roros = new BakeryItem("Rocky Road Slice", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(roros);
//        BakeryItem biscc = new BakeryItem("Biscoff Cake", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(biscc);
//        BakeryItem sausr = new BakeryItem("Sausage Roll", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(sausr);
//        BakeryItem scotp = new BakeryItem("Scotch Pie", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(scotp);
//        BakeryItem beefp = new BakeryItem("Beef & Vegetable Pasty", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(beefp);
//        BakeryItem steas = new BakeryItem("Steak Slice", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(steas);
//        BakeryItem fscon = new BakeryItem("Fruit Scone", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(fscon);
//
//
//
//
//        BakeryItem crbrd = new BakeryItem("Creme Brulee Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(crbrd);
//        BakeryItem chmid = new BakeryItem("Chocolate Millionaire Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(chmid);
//        BakeryItem sahor = new BakeryItem("Salted Honey Ring", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(sahor);
//        BakeryItem pihir = new BakeryItem("Pistachio & Hibiscus Ring", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(pihir);
//        BakeryItem pbjri = new BakeryItem("Peanut Butter and Jam Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(pbjri);
//        BakeryItem almoo = new BakeryItem("Almond Glaze Buttermilk 'Old Fashioned'", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(almoo);
//        BakeryItem lempd = new BakeryItem("Lemon & Poppyseed Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(lempd);
//        BakeryItem dbwcd = new BakeryItem("Double Blueberry & White Chocolate Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(dbwcd);
//        BakeryItem ffjfd = new BakeryItem("Forest Fruits Jam filled Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(ffjfd);
//        BakeryItem mvbgd = new BakeryItem("Madagascar Vanilla Bean Glaze Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(mvbgd);



        Image imageCroissant = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Croissant-Petr_Kratochvil.jpg/320px-Croissant-Petr_Kratochvil.jpg");
        imageRepository.save(imageCroissant);

        Image imageRoll = new Image("https://i2-prod.glasgowlive.co.uk/incoming/article20880009.ece/ALTERNATES/s810/0_image2-4.png");
        imageRepository.save(imageRoll);



//        pita.clearAvailableItems();
//        bakeryRepository.save(pita);



//
        Order order1 = new Order(1L, 1L, false);
        orderRepository.save(order1);
        croissant.setOrderId(order1.getId());
        bakeryItemRepository.save(croissant);
        orderRepository.save(order1);
//
//
//        Order order2 = new Order(pita, jambo, false);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(roll);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(croissant);
//        orderRepository.save(order2);




    }
}
