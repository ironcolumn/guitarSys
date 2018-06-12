package com.example.demo;

import com.example.demo.dao.GuitarRepository;
import com.example.demo.model.Guitar;
import com.example.demo.model.GuitarSpec;
import com.example.demo.service.BuilderService;
import com.example.demo.service.GuitarService;
import com.example.demo.service.TypeService;
import com.example.demo.service.WoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith ( SpringRunner.class )
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    GuitarService guitarService;

    @Autowired
    WoodService woodService;

    @Autowired
    BuilderService builderService;

    @Autowired
    TypeService typeService;

    @Autowired
    GuitarRepository guitarRepository;

    @Test
    public void contextLoads ( ) {

    }

    @Test
    public void testFindAllGuitars ( ) {

        guitarService.getAll ( ).forEach ( guitar -> {
            System.out.println ( guitar.toString ( ) );
        } );
    }

    @Test
    public void saveGuitars ( ) throws InterruptedException {

        List < String > builders = new ArrayList <> ( );
        builders.add ( "江苏" );
        builders.add ( "上海" );
        builders.add ( "北京" );
        builders.add ( "徐州" );
        builders.add ( "重庆" );
        builders.add ( "河北" );
        builders.add ( "天津" );

        List < String > woods = new ArrayList <> ( );
        woods.add ( "白橡木" );
        woods.add ( "桦木" );
        woods.add ( "红松" );
        woods.add ( "印度玫瑰木" );
        woods.add ( "马达加斯加玫瑰木" );
        woods.add ( "洪都拉斯桃花芯木" );
        woods.add ( "欧洲枫木" );

        List < String > types = new ArrayList <> ( );
        types.add ( "民谣吉他" );
        types.add ( "古典吉他" );
        types.add ( "电吉他" );
        types.add ( "尤克里里" );
        types.add ( "电贝司" );
        types.add ( "爵士吉他" );
        types.add ( "弗拉明戈吉他" );
        for ( int i = 0 ; i < 10; i++ ) {
            Thread.sleep(100);
            Guitar guitar = new Guitar ( );
            guitar.setPrice ( Math.round ( Math.random ( ) * 1000 ) );
            Random random = new Random ( );
            guitar.setSpec ( new GuitarSpec ( builders.get ( random.nextInt ( builders.size ( ) ) ) , "" , types.get ( random.nextInt ( builders.size ( ) ) ) , woods
                    .get ( random.nextInt ( builders.size ( ) ) ) , woods.get ( random.nextInt ( builders.size ( ) ) ) , random.nextInt ( 100000 ) ) );
            guitarService.save ( guitar );
        }
    }
}
