package com.Home_PageLink.Anudip_Link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnudipLinkApplication {
	
	@RequestMapping("/link")
	public String index()
	{
		return "<body bgcolor='Red',text='Blue'><center><h1>#####: Anudip Foundation :#####</h1></center>"
				+"<center><h2>****** Home Page Link******</h2></center>"
				+"<center><h3><a href=aln.anudip.org style='color:'Yellow'>https.aln.anudip.org</a></h3></center></body>";
				
	}

	public static void main(String[] args) {
		SpringApplication.run(AnudipLinkApplication.class, args);
	}

}
