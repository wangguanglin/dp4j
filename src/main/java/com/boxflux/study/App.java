package com.boxflux.study;


import com.boxflux.study.dp.decorator.AfterDecortor;
import com.boxflux.study.dp.decorator.BeforeDecortor;
import com.boxflux.study.dp.decorator.Source;
import com.boxflux.study.dp.decorator.Sourceable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println(new BigDecimal(String.valueOf("")));
        LocalDateTime data = LocalDateTime.now();
        List<String> lists = new ArrayList<String>(10);
        lists.add("sss");
        lists.add("a");
        lists.add(data.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        lists.stream().filter(e->e.equals("a") || e.startsWith("20"))
                .forEach(System.out::println);

    }
}
