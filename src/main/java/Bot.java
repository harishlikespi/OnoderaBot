import javax.security.auth.login.LoginException;
import java.io.*;
import java.nio.file.Path;
import java.util.*;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.entities.Invite.Channel;

public class Bot extends ListenerAdapter{
	
	public static int[] sauce = {255308, 211648, 278153, 269542, 273447, 147746, 271062, 179267, 171091, 
			206409, 220901, 92807, 86879, 92056, 148080, 223146, 199827, 271048, 253993, 268793, 266987,
			277677, 268920, 239463, 253993, 186780 , 209775, 129071, 285275, 284566, 255772, 280890, 168479, 262711, 265918,
			275485, 269673, 103269, 241790, 281709, 255869, 89514, 152067, 97730, 285504, 255662, 204958, 250647, 222798, 260605,
			226861, 245503, 264298, 223147, 67462, 255744, 245737, 170727, 272298, 246448, 179687, 187343, 245131, 123361, 272129,
			129281, 217727, 178468, 155365, 274917, 280297, 261063, 228708, 285588, 16316, 214054, 240543, 233321, 203367, 233878, 
			245942, 246144, 242056, 253992 , 283737, 283101, 210010, 118282, 128773, 298547, 318145, 285504, 326395, 319484, 174835,
			327745, 275840, 326987, 328474, 328105, 242558, 248306, 173393, 236265, 329609, 330909, 290886, 323627, 223544, 226970,
			283975};
	
	public static LinkedList<String> Basic_Codes = new LinkedList<String>();
	//0 - 34 Wholesome
	//35 - 88 Basic
	//89 - 110
	
	public static JDABuilder builder;
	
	public static JDA jda;
	
	
	public static void readBasic() throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader("codes.txt"));
        while (s.hasNext()) {
        	Basic_Codes.add(s.nextLine());       
        }
	}
	
	
	
	public static void main(String[] args) throws LoginException, InterruptedException, FileNotFoundException {
		readBasic();
		final JDABuilder builder = JDABuilder.createDefault("NzQ2NDAwNzgxMTI4Njk1ODk5.Xz_x5Q.Tfdk5KI--un_RCcqOSnkt59MLxc");
		builder.setAutoReconnect(true);
		builder.addEventListeners(new Bot());
		builder.build();	


		
	}

	@Override
	public void onReady(ReadyEvent event) {
		System.out.println("I'm alive");
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) {
			return;
		}
		
		
		MessageChannel channel = event.getChannel();
		Message message = event.getMessage();
		String content = message.getContentRaw();
		
		if(content.contains("who's best girl")) {
			
		channel.sendMessage("I am").queue();
		
		} else if (content.contains("chitoge")) {
			
			channel.sendMessage("why are you talking about Chitoge when you could talk about me : (").queue();
			
		} else if (content.equals("hey")) {
			
			channel.sendMessage("hello").queue();
			
		} else if(content.contains("c.rateme")) {
			if(event.getAuthor().getName().equals("harishlikespi")) {
				channel.sendMessage(event.getAuthor().getName() + " is a " + 10 + "/10").queue();
			}
			int a = (int)(Math.random()*(10-0+1)+0);
			channel.sendMessage(event.getAuthor().getName() + " is a " + a + "/10").queue();
			
		} else if (content.contains("test--")) {
			
			channel.sendMessage("These people are wierd").queue();
			
		} else if (content.contains("c.sauce")) {
			
			if(content.contains("wholesome")) {
				
				int a = (int)(Math.random()*(34-0+1)+0);
				channel.sendMessage("Here's your sauce: "+ sauce[a]).queue();
				
			} else if(content.contains("basic")) {
				
				int a = (int)(Math.random()*(88-35+1)+35);
				channel.sendMessage("Here's your sauce: " + sauce[a]).queue();
				
			} else if(content.contains("Christien's collection")) {
				
				int a = (int)(Math.random()*(110-88+1)+88);
				channel.sendMessage("Here's your sauce: " + sauce[a]).queue();		
			}		
			
		} else if (content.contains("c.help")) {	
			
			EmbedBuilder result = new EmbedBuilder();
			channel.sendMessage("```" + 
			"Hey there fellow weeb! Here's a list of all the cool things I can do:\n\n\n"
			+ "     c.sauce: gives you a random 'cultured text with visual aid'. Can be \n     filtered with tags (type c.shelp for more)\n\n\n"
			+ "     c.rateme: determines the chances of you ever finding love in life" 
			+"```").queue();
			
		} else if (content.equals("c.shelp")) {
			
			channel.sendMessage("``` Sauce commands:\n\n\n " + "     c.sauce wholesome\n\n\n" + "      c.sauce basic\n\n\n" + "      c.sauce Christien's collection" + "```" ).queue();
			
		} else if (content.contains("What's the best music ever?")) {
			
			channel.sendMessage("I think this is what you're looking for :\n" + "https://youtu.be/_IC0UNxhoGw").queue();
			
		} else if (content.contains("c.zerotwo")) {
			
	        EmbedBuilder result= new EmbedBuilder();
	        result.setImage("https://th.bing.com/th/id/OIP.5k4pXLrZxn_ykBHzXksidgHaI7?w=206&h=249&c=7&o=5&dpr=1.25&pid=1.7");
	        event.getChannel().sendMessage(result.build()).queue();
			
		} else if ( content.contains("c.christien")) {
			
			 EmbedBuilder result= new EmbedBuilder();
		     result.setImage("https://media-exp1.licdn.com/dms/image/C5603AQFFlGtPh2neOQ/profile-displayphoto-shrink_400_400/0/1606412206500?e=1617235200&v=beta&t=XtszRGhAq6ouGl3eWQuAP5gD33yM1w5ExCam3Hn5Y-s");
		     event.getChannel().sendMessage(result.build()).queue();
		     
		} else if (content.contains("c.shri")) {
			
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://th.bing.com/th/id/OIP.j_VOxgk1i_1MGeKQu96WvgHaJ4?w=137&h=183&c=7&o=5&dpr=1.25&pid=1.7");
			event.getChannel().sendMessage(result.build()).queue();
			
		} else if (content.startsWith("c.mathew")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3eB5_OIhozgSbUYoN80szDYs8cPY9djGvOIL5_hm7xwueik2J4kQ7UA7R9zet8FNnNw0LNWAe8CFykv-ac-iuC2-kAtRlHEtcSId9hm0KhP1-VjV9tfXSf382iGJlD2TAL2W3lvHu8KxUwHBzZwoth2=w603-h877");
			event.getChannel().sendMessage(result.build()).queue();
		} else if (content.contains("c.2shri")) {
			
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://th.bing.com/th/id/OIP.5YnARS5IBm9Y_ZmQ4srzMQHaEE?w=333&h=183&c=7&o=5&dpr=1.25&pid=1.7");
			event.getChannel().sendMessage(result.build()).queue();
		} else if (content.contains("c.addsauce")) {
			handleAddSauce(content, channel);
		} else if(content.contains("c.slist")) {
	
			String msg = listToString(Basic_Codes);
			channel.sendMessage(msg).queue();
		} else if(content.contains("who's the best boy in the whole entire world")) {
			channel.sendMessage("harish is").queue();
		} else if(content.startsWith("c.kaz")) {
			
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3cvA_6DWLjJ6IgrnF7MVjwZNeOFVpdTmaWxU1r5pRHafGol3ZLcnGSxXkf-aT4Q7pdwPwLjF2kHO22oA2oJc9tgnyPDT-oEfTR-d08hXc06fpWIUsDg6I6fuEZ2pg-vjUtzkBHyN7b8mGBGSFQ6G8tQ=w698-h943");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.startsWith("c.2mathew")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3d6sh0Ys2rqPd9hv_yFoKXPRFJ4byRo1L6SvqZa9bkG8wP5AQwU_aSoSuqWBQaQwBmt3jSpIjRl-5hzTbv2xiiPrRC3Pi6MMJEiGKOKG9KxbUaBnNSQuZF77GIoyFWoMj8sU6fy5LEof7UuKPoEjCB4=w627-h671");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.theboys")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3dU1c7SkegITpXZcGyhR_5ZeekP1DbsWiQyDUHwKKRU_q22YQ_M_1YWBZh0fQkhYXLC1OiU7ijUl5UoZGjnru_CwZ1rXKXia28I6dvu8IgYz1X0NVV-_2gJpVUOh_sMs82YJQn-fu-UK2j7nXTqrYhd=w1920-h934");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.felix")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3chqTWOJijYnVDOf8Nv9O9NnVc09gZiwQVgsjPvdf4n4LY62onso606276pTicgQh88f1EiVdHWN40MHy6wzjjMiUtyssUQ5qeucsGX_kKY8wIGPhA0WyxDwXeVJ9XUy32I8j-ViaicpIPXUzSmjcYf=w685-h943");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.2theboys")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3dOtrBgljHG4BniHKRwmAO53auNHMojx8cJktXm9bIOK5XNn-ff72Xx8b0yrENLRPQIw1V_OLSnwuLtOig3YW90hwdcEw5CGzoi3mnzmK64xZgXDi86WZUFTdy-b4uXJycGjmfn_6ilPROhS-X4xt_M=w1920-h938");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.3theboys")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3feobp3Ra1pE9JMY1cA4yaV2W9yDAxyvzACeFM8XFZqFponCBen_Lnnfo-uFmvQvfDTeTrTxMyKd3YMjNT5Bp98_sX8yKUkoAJv06fdwjJKFrO5xHi_a5POopSQFbtFrpQQ7QvUUs4xjLeKMEJs857r=w1510-h943");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.3mathew")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3fEvRZ-fVml1DYAwr5JhocvFwrKl7aUmVYV5kml8rhrzKLNMnb3_lgG7nAVsWDxf215NyRq6UebnYH9WYPtk-RwKFHhCTheLsj7WBwvP5zBOkT_ZiwEvfFGnDwQ6bBSt5o5zlFnKVuyrs9TGjGaXQlK=w1920-h934-no?authuser=0");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.4mathew")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3djBh6-udHWSOQz_tlrpPlAQd60FEr-tVdNyV47WBjeabAmBbM0JeME0pJEtqDrP0PZR9W7cnQfDu9PesOe9IcJ7Cf7CjUbFBpIRCZGnkUh-FFBzmqoW3BlH6FrJV6QvH-g5m0_w_iVzwzwigLL81YC=w1920-h934-no?authuser=0");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.2christien")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3cQuc3Oj9ZCq_-SGS01OnLwFnnmBup1VwzS8iPtHSx8GucebiKP_DLnbPTBdMZg-avtn6Mht5ArcBr-ZJuAhJTtefhbvq-cwW9LDuosikO6uRk-znceX8O7z8nODhAiQ5hcd1zxbzqUE6V8_-tvgceZ=w708-h943-no?authuser=0");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.whee")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.google.com/pw/ACtC-3dyUlP_zHEJsoRf8-YldP3DFgjoFj-qUxK3Iv61UPro459RIsl7qzHkKc5VLLLPkxeIALfVG1fsZyW_a_JAK3ZC9ChVN4k=w708-h943");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.truelove")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3eTT-ii-jZlBuSu_fnJJ3OKyE7aq-WZH32tAXMzGPzpwRnliGFu_F-kLPEtm7wa6ALpNoHprGYYcda7YYfW-aF_NZhmYbW52_F9NKl0z0MmOTZExitjVppFHXM5dyaBGt0Z3FyGPwofe8bQzwg9dA6F=w137-h196-no?authuser=0");
			event.getChannel().sendMessage(result.build()).queue();	
		} else if(content.contains("c.hot")) {
			EmbedBuilder result = new EmbedBuilder();
			result.setImage("https://lh3.googleusercontent.com/pw/ACtC-3cB9sq7BUiLFxbUU_5PugEwjGeuunPfDp73qG44CePn6zZGygrI2PSHdZ0yWr6Vd_saRReSZqc9Bb3GKWLdHLR2JR3YzJYGc4Dy6UShclAZ97s9te_UgA0qnyP5CQLqeSSSYWvmxSZXilOzYZjLKaur=w147-h153-no?authuser=0");
			event.getChannel().sendMessage(result.build()).queue();
		}
		else if(message.getAuthor().getName().equals("harishlikedspi")) {
			
			event.getChannel().sendMessage("Do you like my new pfp : D").queue();
	}
		
		
	}
	
	
	public String listToString(LinkedList<String> list) {
		String message = " ";
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			message += listIterator.next() + ", " ;
		}

		return message;
	}
	
	
	public void handleAddSauce(String content, MessageChannel channel) {
		int codeInt;
		try {
	     codeInt = Integer.parseInt(content.substring(11, 17));
	     writeCode(1,codeInt, channel);     
		} catch( NumberFormatException e) {
			channel.sendMessage("Sorry, that was not a valid code").queue();
		} catch (StringIndexOutOfBoundsException e) {
			channel.sendMessage("Sorry, your command was missing a few characters" ).queue();
		}
		
	}
	

	public void writeCode(int id, int code, MessageChannel channel){		
		 String codeString = Integer.toString(code);
		 Basic_Codes.add(codeString);
	      BufferedWriter bw = null;
	      channel.sendMessage(codeString + " was successfully added!").queue();
	      try {
		 File file = new File("c:/Users/haris/eclipse-workspace/BotTest/codes.txt");

		  FileWriter fw = new FileWriter(file,true);
		  bw = new BufferedWriter(fw);
		  bw.write(codeString);
		  bw.newLine();
	      } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		}     
	}	
}
