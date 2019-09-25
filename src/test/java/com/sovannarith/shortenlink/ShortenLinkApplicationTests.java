package com.sovannarith.shortenlink;

import com.sovannarith.shortenlink.service.IUrlShortenService;
import net.bytebuddy.utility.RandomString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortenLinkApplicationTests {

    @Autowired
    private IUrlShortenService shortenService;
    @Test
    public void contextLoads() {
        shortenService.save("https://www.google.com.kh/search?q=short.url&oq=short.url&aqs=chrome..69i57j0l5.5823j0j0&client=ubuntu&sourceid=chrome&ie=UTF-8");
    }

    @Test
    public void givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect() {
        String generatedString = RandomString.make(10);

        System.out.println(generatedString);
    }

}
