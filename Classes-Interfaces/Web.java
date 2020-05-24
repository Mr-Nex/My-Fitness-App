package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.rexx.completefitness.R;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent in = getIntent();

        WebView webView0 = (WebView)findViewById(R.id.webView0);
        webView0.getSettings().setJavaScriptEnabled(true);
        webView0.setWebViewClient(new WebViewClient());

        String ht = "<!DOCTYPE Html>\n" +
                "<html>\n" +
                "<head>\n" +
                "     \n" +
                "<title>YourFitnessBuddies: Complete Fitness Guide</title>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<meta name=\"keywords\" content=\"Fitness, Workout, Exercise\">    \n" +
                "<meta name=\"description\" content=\"Achieve your Fitness Goals with us, get to know Everything about Workout/Exercises, Diet & get your dream physique. Because we are Your Fitness Buddies.\">\n" +
                "    \n" +
                "    \n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\n" +
                "<link href=\"bootstrap.min.css\" rel=\"stylesheet\">   \n" +
                "\n" +
                "<link href=\"https://fonts.googleapis.com/css?family=Concert+One|Cookie|Courgette|Kaushan+Script|Permanent+Marker|Satisfy\" rel=\"stylesheet\">    \n" +
                "    \n" +
                "<link href=\"StyleSheet.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "    \n" +
                "<!-- footer -->\n" +
                "    <link rel=\"stylesheet\" href=\"footer-dimensions.css\">\n" +
                "\t<link rel=\"stylesheet\" href=\"footer-distributed-with-address-and-phones.css\">\n" +
                "\t\n" +
                "\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n" +
                "    \n" +
                "<!-- social media icons -->\n" +
                "     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                "\n" +
                "    \n" +
                "<style>\n" +
                "\n" +
                ".fa-facebook {\n" +
                "  color: white;\n" +
                "  \n" +
                "}\n" +
                ".fa-facebook:hover {\n" +
                "  color: #3B5998;\n" +
                "}\n" +
                "\n" +
                ".fa-google {\n" +
                "  color: white;\n" +
                "}\n" +
                ".fa-google:hover {\n" +
                "  color: #dd4b39;\n" +
                "}\n" +
                "\n" +
                ".fa-youtube {\n" +
                "  color: white;\n" +
                "}\n" +
                ".fa-youtube:hover {\n" +
                "  color: #dd4b39;\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".fa-instagram {\n" +
                "  color: white;\n" +
                "}\n" +
                ".fa-instagram:hover {\n" +
                "  color: #fc1e7a;\n" +
                "}\n" +
                "\n" +
                "</style>    \n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                " \n" +
                "\n" +
                " \n" +
                "    <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n" +
                "    \n" +
                "      <div class=\"container\">\n" +
                "              <a href=\"#\" class=\"navbar-brand\"><img src=\"images/gr.png\" width=\"50px\" height=\"50px\"/></a>\n" +
                "             \n" +
                "             <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                "                  \n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "                    <span class=\"icon-bar\"></span>\n" +
                "             </button>\n" +
                "        <div class=\"collapse navbar-collapse navbar-collapse\" >    \n" +
                "             <ul class=\"nav navbar-nav navbar-right\">\n" +
                "       <li class=\"active\"><a href=\"index.html\">Home</a></li>\n" +
                "       <li><a href=\"about.htm\">About Us</a></li>\n" +
                "\t   <li><a href=\"tips.htm\">Workout Tips</a></li>\n" +
                "\t   <li><a href=\"diet.htm\">Workout Diet</a></li>\n" +
                "\t   <li><a href=\"contact.htm\">Contact Us</a></li>\n" +
                "\t         </ul>\n" +
                "        </div>       \n" +
                "      </div>\n" +
                "    \n" +
                "    </div>\n" +
                "\n" +
                "        <div class=\"jumbotron\">\n" +
                "          <img src=\"images\\home5.jpg\" width=\"100%\" height=\"500px\"/> \n" +
                "       \n" +
                "       </div>    \n" +
                "\n" +
                "<div class=\"container\">\n" +
                "    \n" +
                "     \n" +
                "     <div class=\"row\">\n" +
                "           <div class=\"col-md-3\">\n" +
                "               <h3>Tone Up on the Treadmill-</h3>\n" +
                "               <p>\"Save time at the gym with this 10-minute cardio/sculpt session: Hop on a treadmill holding a three- to five-pound dumbbell in each hand,<br> \n" +
                "                   <a href=\"#read1\" data-toggle=\"modal\" class=\"btn btn-default\" >Read More</a>\n" +
                "                   </p>\n" +
                "         </div>\n" +
                "     <div class=\"col-md-3\">\n" +
                "               <h3>Power Up Your Runs-</h3>\n" +
                "               <p>\"Adding wall sits to the end of every run will strengthen your quads, hamstrings and glutes, improving your speed and endurance.<a href=\"#read2\" data-toggle=\"modal\"  class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "         <div class=\"col-md-3\">\n" +
                "               <h3>Chart Your Progress-</h3>\n" +
                "               <p>\"Stay motivated using a fitness report card. Jot down these subjects: Cardio, Muscle Conditioning, Flexibility and Attitude.<br> <a href=\"#read3\" data-toggle=\"modal\" class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "         <div class=\"col-md-3\">\n" +
                "               <h3>Work Out During Your Workday-</h3>\n" +
                "               <p>\"Sit on a stability ball to strengthen your core, and keep dumbbells or exercise tubing at your desk. Squeeze in 12 to 15 reps of<a href=\"#read4\" data-toggle=\"modal\" class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"row\">\n" +
                "          <div class=\"col-md-3\">\n" +
                "               <h3>Give Yourself a Break-</h3>\n" +
                "               <p>\"You don't have to be a fitness saint to get results. Follow the 80/20 plan: Eighty percent of the year, you'll exercise regularly<a href=\"#read5\" data-toggle=\"modal\" class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "               <h3>Get a Jump on Weight Loss-</h3>\n" +
                "               <p>\"Add plyometric box jumps to your workout to improve your cardiovascular stamina and leg strength -<br> <a href=\"#read6\" data-toggle=\"modal\" class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "               <h3>Don't Skimp on Carbs-</h3>\n" +
                "               <p>\"Your body needs them to fuel a workout, so reach for fruit or high-fiber crackers an hour beforehand. If you'e exercising for 90 minutes <a href=\"#read7\" data-toggle=\"modal\" class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "               <h3>Make Over Your Running Routine-</h3>\n" +
                "               <p>\"Unless you're training for a marathon, skip long, slow, distance running - sprinting builds more muscle.<br><a href=\"#read8\" data-toggle=\"modal\"  class=\"btn btn-default\">Read More</a></p>\n" +
                "         </div>\n" +
                "    </div>\n" +
                "  \n" +
                "\t\t\t\n" +
                "\t\t\t<hgroup class=\"h\">\n" +
                "\t\t\t    <h1>Healthy Diet Tips</h1>\n" +
                "\t\t\t\t\n" +
                "\t\t    </hgroup>\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\t<img src=\"images/image.jpg\" alt=\"say no to these\" id=\"unhealthy\"/><br>\n" +
                "    <p class=\"p11\">How does poor nutrition affect us? <br></p>\n" +
                "             <ul>        <li>being overweight or obese.</li>\n" +
                "                         <li>tooth decay.</li>\n" +
                "                         <li>high blood pressure.</li>\n" +
                "                         <li>high cholesterol.</li>\n" +
                "                         <li>heart disease and stroke.</li>\n" +
                "                         <li>type-2 diabetes.</li>\n" +
                "                         <li>osteoporosis.</li>\n" +
                "                         <li>some cancers.</li>\n" +
                "\t\t\t  </ul>\t\t\t \n" +
                "    \n" +
                "\t\t\t <hr />\n" +
                "\t\t\t <br />\n" +
                "\t\t\t \n" +
                "\t\t\t <p class=\"p12\">So after excluding unnecessary elements from your diet, you just need to add all the healthy elements in your diet i.e.,<br />\n" +
                "                            protein, vitamins, fibre, sodium, potassium, calcium, and few more important elements of nutrition.\t<br><br>\n" +
                "                 Let's get started...\n" +
                "             </p>\n" +
                "    <div class=\"btn-group\">\n" +
                "        <button type=\"button\" class=\"btn btn-default\"><a href=\"tips.htm\">Workout</a></button>\n" +
                "        <button type=\"button\" class=\"btn btn-default\"><a href=\"diet.htm\">Diet</a></button>\n" +
                "    </div>\n" +
                "        \n" +
                "\t\t\t\t\t\n" +
                "    </div>     <!-- End container -->\n" +
                "    \n" +
                "<!-- footer -->\n" +
                "    \n" +
                "    <footer class=\"footer-distributed\">\n" +
                "\n" +
                "\t\t\t<div class=\"footer-left\">\n" +
                "\n" +
                "\t\t\t\t<h3><span>Complete</span>Fitness</h3>\n" +
                "\n" +
                "\t\t\t\t<p class=\"footer-links\">\n" +
                "\t\t\t\t\t<a href=\"index.php\">Home</a>\n" +
                "\t\t\t\t\t·\n" +
                "\t\t\t\t\t<a href=\"about.php\">About</a>\n" +
                "\t\t\t\t\t·\n" +
                "\t\t\t\t\t<a href=\"tips.php\">Workout</a>\n" +
                "\t\t\t\t\t·\n" +
                "\t\t\t\t\t<a href=\"diet.php\">Diet</a>\n" +
                "\t\t\t\t\t·\n" +
                "\t\t\t\t\t<a href=\"contact.php\">Contact</a>\n" +
                "\t\t\t\t</p>\n" +
                "\n" +
                "\t\t\t\t<p class=\"footer-company-name\">Complete Fitness &copy; 2018</p><br>\n" +
                "                <p style=\"color:white\">Developed By:   <img src=\"images/name.png\" alt=\"Nitin Kumar\" height=\"40px\" width=\"300px\" /></p>\n" +
                "                \n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div class=\"footer-center\">\n" +
                "\n" +
                "\t\t\t\t<div>\n" +
                "\t\t\t\t\t<i class=\"fa fa-map-marker\"></i>\n" +
                "\t\t\t\t\t<p><span>Complete Fitness</span> India</p>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div>\n" +
                "\t\t\t\t\t<i class=\"fa fa-phone\"></i>\n" +
                "\t\t\t\t\t<p>+1 555 123456</p>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t<div>\n" +
                "\t\t\t\t\t<i class=\"fa fa-envelope\"></i>\n" +
                "\t\t\t\t\t<p><a href=\"mailto:rexxgen@gmail.com\">something@gmail.com</a></p>\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t<div class=\"footer-right\">\n" +
                "\n" +
                "\t\t\t\t<p class=\"footer-company-about\">\n" +
                "\t\t\t\t\t<span>About Us</span>\n" +
                "                    This is my website to help you about all your fitness, workout and diet related problems and queries.<br> Here at <b>yourfitnessbuddies.com</b>, we help you to reach your fitness goals easily.\n" +
                "\t\t\t\t</p>\n" +
                "\n" +
                "\t\t\t\t<div class=\"footer-icons\">\n" +
                "\n" +
                "\t\t\t\t\t<a href=\"contact.htm\"><i class=\"fa fa-facebook\"></i></a>\n" +
                "                    <a href=\"contact.htm\"><i class=\"fa fa-google\"></i></a>\n" +
                "                    <a href=\"contact.htm\"><i class=\"fa fa-youtube\"></i></a>\n" +
                "                    <a href=\"contact.htm\"><i class=\"fa fa-instagram\"></i></a>\n" +
                "\n" +
                "\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t</footer>\n" +
                "    \n" +
                " \n" +
                "    \n" +
                "\n" +
                "    <div class=\"modal fade\" id= \"read1\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Tone Up on the Treadmill</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Save time at the gym with this 10-minute cardio/sculpt session: Hop on a treadmill holding a three- to five-pound dumbbell in each hand, and set the speed to a brisk walk. Do a one-minute set each of shoulder presses, biceps curls, triceps extensions, side laterals, front laterals and standing triceps kickbacks one after another as you walk. I's an amazing upper-body challenge that also gets your heart pumping. Do this series two or three times each week. As you improve, work up to doing four-minute sets.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read2\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Power Up Your Runs</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Adding wall sits to the end of every run will strengthen your quads, hamstrings and glutes, improving your speed and endurance. Lean against a wall with your feet shoulder-width apart, then squat until your knees are bent at 45 degrees. Hold for 30 to 60 seconds; work up to doing 10 sets. Add a challenge by including heel raises: Lift your left heel, then the right, then lift both together twice.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read3\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Chart Your Progress</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Stay motivated using a fitness report card. Jot down these subjects: Cardio, Muscle Conditioning, Flexibility and Attitude. Set goals (for example, doing 10 \"boy\" push-ups) and grade yourself A through F at least four times a year. When you see how much you improve, you'll want to stay in great shape.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read4\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Work Out During Your Workday</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Sit on a stability ball to strengthen your core, and keep dumbbells or exercise tubing at your desk. Squeeze in 12 to 15 reps of exercises like dumbbell curls, overhead presses and ab crunches; aim for two or three sets of each. This gives you more free time to fit in fun workouts like biking or tennis.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read5\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Give Yourself a Break</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"You don't have to be a fitness saint to get results. Follow the 80/20 plan: Eighty percent of the year, you'll exercise regularly and eat well. Know that you'll slip 20 percent of the time due to holidays and work deadlines. When you accept that fitness isn't an all-or-nothing proposition, you're more likely to stick with it for life.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read6\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Get a Jump on Weight Loss</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Add plyometric box jumps to your workout to improve your cardiovascular stamina and leg strength - you'll really sculpt your hamstrings, quads and glutes. Find a sturdy box that's at least one foot high . Starting from a standing position, explosively jump to the middle of the box, then jump back down. Repeat 20 times.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read7\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Don't Skimp on Carbs</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Your body needs them to fuel a workout, so reach for fruit or high-fiber crackers an hour beforehand. If you'e exercising for 90 minutes or longer, include some protein so that the carbs break down more slowly, giving you longer-lasting energy. Your best bets: low-fat cheese and crackers, trail mix or half of a peanut butter and jelly sandwich.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    <div class=\"modal fade\" id= \"read8\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4>Make Over Your Running Routine</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <p>\"Unless you're training for a marathon, skip long, slow, distance running - sprinting builds more muscle.Add a few 10- to 60-second sprints to your run, slowing down just long enough to catch your breath between them.\"</p>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "        <!-- sign up modal -->\n" +
                "    \n" +
                "        <div class=\"modal fade\" id= \"signup\" role=\"dialog\">\n" +
                "        <div class=\"modal-dialog\">\n" +
                "             <div class=\"modal-content\">\n" +
                "                <div class=\"modal-header\">\n" +
                "                     <h4><span class=\"fa fa-user-plus\" aria-hidden=\"true\"></span>     Sign Up Here</h4>\n" +
                "                 </div>\n" +
                "                 <div class=\"modal-body\">\n" +
                "                     <form class=\"supform\" action=\"signup.inc.php\" method=\"post\" enctype=\"multipart/form-data\" autocomplete=\"off\">\n" +
                "\t\t   <div class=\"form-group\">\n" +
                "\n" +
                "           <label for=\"fn\">First Name:</label>    \n" +
                "\t\t   <input class=\"form-control\" type=\"text\" name=\"fname\" id=\"fn\" placeholder=\"First Name\" required/><br />\n" +
                "               \n" +
                "            <label for=\"ln\">Last Name:</label>   \n" +
                "\t\t   <input class=\"form-control\" type=\"text\" name=\"lname\" id=\"ln\" placeholder=\"Last Name\"required /><br />\n" +
                "               \n" +
                "            <label for=\"email\">Email :</label>   \n" +
                "\t\t   <input class=\"form-control\" type=\"text\" name=\"email\" id=\"email\" placeholder=\"Email\" required/><br />\n" +
                "            \n" +
                "            <label for=\"un\">Username:</label>   \n" +
                "\t\t   <input class=\"form-control\" type=\"text\" name=\"uid\" id=\"un\" placeholder=\"Username\" required/><br />\n" +
                "               \n" +
                "            <label for=\"pwd\">Password:</label>   \n" +
                "\t\t   <input class=\"form-control\" type=\"password\" name=\"pwd\" id=\"pwd\" placeholder=\"Password\" required/><br />\n" +
                "            \n" +
                "            <div class=\"picture\"><label>Select Your Picture: </label>\n" +
                "            <input type=\"file\" name=\"picture_path\" accept=\"images/*\" required /></div>   \n" +
                "               \n" +
                "               <button class=\"btn btn-default\" type=\"submit\" name=\"submit\">Sign up</button>\t</div>\t   \n" +
                "\t\t   </form>                 </div>\n" +
                "                 <div class=\"modal-footer\">\n" +
                "                     <a class=\"btn btn-primary\" data-dismiss = \"modal\">Close</a>\n" +
                "                 </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    \n" +
                "    \n" +
                " <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n" +
                " <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n" +
                "    <script src=\"bootstrap.js\"></script>\n" +
                "\n" +
                " </body>\n" +
                " </html>";

        webView0.loadDataWithBaseURL("file:///android_asset/", ht, "text/html", "UTF-8", null);

    }
}
