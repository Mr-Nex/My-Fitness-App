package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.rexx.completefitness.R;

public class Exercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        Intent intentEx = getIntent();

        WebView webView6 = (WebView)findViewById(R.id.webView6);

        webView6.getSettings().setJavaScriptEnabled(true);
        webView6.setWebViewClient(new WebViewClient());

        String ex = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Exercise Charts</title>\n" +
                "    \n" +
                "    <link rel=\"shortcut icon\" href=\"images/g1.png\">      \n" +
                "<title>Chest Workout - Best Chest Exercises</title>\n" +
                "\n" +
                "<link href=\"stylesheet1.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\n" +
                "   \n" +
                "<link href=\"bootstrap.min.css\" rel=\"stylesheet\">   \n" +
                "\n" +
                "<link href=\"StyleSheet.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "<link href=\"https://fonts.googleapis.com/css?family=Concert+One|Cookie|Courgette|Kaushan+Script|Caveat|Righteous|Sedgwick+Ave|Sriracha\" rel=\"stylesheet\">       \n" +
                "    <style>\n" +
                "       a:link{\n" +
                "           color: black;\n" +
                "       }\n" +
                "    </style>\n" +
                "    \n" +
                "    </head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#chest\"><button type=\"button\" class=\"btn btn-basic\">Chest</button></a>\n" +
                "            </div>           \n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#back\"><button type=\"button\" class=\"btn btn-default\">Back</button></a>\n" +
                "            </div>\n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#shoulder\"><button type=\"button\" class=\"btn btn-basic\"><center>Shoulders</center></button></a>\n" +
                "            </div>\n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#bicep\"><button type=\"button\" class=\"btn btn-default\">Biceps</button></a>\n" +
                "            </div>\n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#tricep\"><button type=\"button\" class=\"btn btn-basic\">Triceps</button></a>\n" +
                "            </div>\n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#forearm\"><button type=\"button\" class=\"btn btn-default\"><center>Forearms</center></button></a>\n" +
                "            </div>\n" +
                "            <div class=\"btn-group\">\n" +
                "                <a href=\"#legs\"><button type=\"button\" class=\"btn btn-basic\">Legs</button></a>\n" +
                "            </div>\n" +
                "        \n" +
                "        </div><br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>CHEST</center></div>\n" +
                "        \n" +
                "    <section id=\"chest\">\n" +
                "       <p><b>1. <u>Barbell Bench Press</u></b><br /><br />\n" +
                "\n" +
                "<b>Importance:</b> You can generate the most power with barbell lifts, so the standard barbell bench allows you to move the most weight. It's also an easier lift to control than pressing with heavy dumbbells. The exercise is easy to spot and relatively easy to learn (if not master).<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "        <thead>   \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Plane Barbell Press</strong></th>\n" +
                "\t       <th><strong>Incline Barbell Press</strong></th>\n" +
                "\t       <th><strong>Decline Barbell Press</strong></th>\n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>  \n" +
                "       <tr>\n" +
                "\t        <td id=\"chest1\"><img src=\"images\\gif\\planebarbellpress.gif\"  width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        <td id=\"chest2\"><img src=\"images\\gif\\inclinebarbell.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        <td id=\"chest3\"><img src=\"images\\gif\\declinebarbellpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t   \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "\t   </table>\n" +
                "    </div>\n" +
                "    <br />\n" +
                "\t   \n" +
                "\t   <p><b>2. <u>Bench Dumbbell Press</u></b><br><br>\n" +
                "\n" +
                "<b>Importance:</b> With dumbbells, each side of your body must work independently, which recruits more stabilizer muscles; dumbbells are harder to control than a barbell. Dumbbells also allow for a longer range of motion than the barbell bench press, both at the bottom and top of the movement. <br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Plane Dumbbell Press</strong></th>\n" +
                "\t       <th><strong>Incline Dumbbell Press</strong></th>\n" +
                "\t       <th><strong>Decline Dumbbell Press</strong></th>\n" +
                "\t\t</tr>\n" +
                "       </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\dumbellpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        <td><img src=\"images\\gif\\incdumbellpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        <td><img src=\"images\\gif\\decdumbbell.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t   \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "    </table></div><br>\n" +
                "\t   \n" +
                "\t   <p><b>3. <u>Dumbbell Fly</u></b><br /><br />\n" +
                "\n" +
                "The dumbbell fly is one of the best chest exercises for shaping and developing the inner chest. By varying the weight of each dumbbell and the repetition range, you can also make this exercise more mass building. If you are using a lower weight, you can lower the weight farther without risking injury, getting a better stretch of the chest muscle. You can still get a good stretch when using a higher weight, but be careful not to lower the weigh too far or it may cause discomfort in the shoulder. If the exercise can not be performed without at least lowering the upper arm perpendicular to your body, then lower weight should be used.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Plane Dumbbell fly</strong></th>\n" +
                "\t       <th><strong>Incline Dumbbell fly</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\planefly.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        <td><img src=\"images\\gif\\incfly.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t        \t   \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "    </table></div><br>\n" +
                "\t   \n" +
                "\t   \n" +
                "\t   <p><b>4. <u>Push Up</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "The push up is one of the most versatile chest exercises. It can be performed almost anywhere and at anytime, making it ideal for those with limited time or access to gym equipment. Because it is a body weight exercise, this exercise allows you track your progress by seeing how your repetitions increase. The push up can also be varied based on hand and leg positioning. The greater the distance between the hands, the more the exercise works the outer chest. Moving the hands inward to shoulder-width makes this exercise an inner chest exercise. Any position further together than shoulder-width makes it a more of a tricep exercise.<br /><br />\n" +
                "</p>\n" +
                "        <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Push ups</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody> \n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pushups.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "            </table></div><br>\n" +
                "\t   \n" +
                "\t   \n" +
                "\t   <p><b>5. <u>Seated Machine Chest Press</u></b><br /><br />  \n" +
                "\n" +
                "Importance: Free-weight pressing moves on a flat bench are great, but the machine press has some unique benefits. For one, it's easier to slow down the repetition, both in the concentric and eccentric phases. Stack-loaded machines are also great for quickly doing dropsets.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Seated Machine Chest Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\chestpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "        <p><b>6. <u>Dips For Chest</u></b><br /><br />\n" +
                "\n" +
                "Importance: First off, make sure you're doing dips that emphasize the pecs: Put your feet up behind you, lean forward as far as possible, and allow your elbows to flare out as you dip. Chest dips are a great spotter-free alternative to the decline press.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dips</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\dips.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "        <p><b>7. <u>Incline Dumbbell Pull-Over</u></b><br /><br />\n" +
                "\n" +
                "Importance: Forget flat-bench pull-overs; the incline version puts your chest fibers under tension for a longer range of motion! Just sit back against a bench inclined to about 45 degrees and make sure the dumbbell clears the top. Make sure you keep this a single-joint movement; don't bend or extend at the elbows.<br /><br />\n" +
                "</p>\n" +
                "    <div class=\"table-responsive\">\n" +
                "         <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Pull-Over</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pullover.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "             </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "         <p><b>8. <u>Pec-Deck Machine</u></b><br /><br /> \n" +
                "\n" +
                "Importance: Chest flyes are hard for many trainees to learn with dumbbells or cables because the arms need to be locked in a slightly bent position for the duration of the exercise. Luckily, the pec deck simplifies things because it allows you to work in only one pathway. So, this exercise is a great movement teacher, and you can go for a great pump without having to balance any weights.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "        <thead> \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Pec-Deck Machine</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead> \n" +
                "        <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pecdec.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        \n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>Back</center></div>\n" +
                "        \n" +
                "        <section id=\"back\">\n" +
                "\n" +
                "\n" +
                "<p><b>1. <u>Barbell Deadlift</u></b><br /><br />\n" +
                "\n" +
                "Importance: This is technically more than a back exercise-it hits the entire posterior chain from your calves to your upper traps-but it's the absolute best for overall backside development. Technique is uber-important with the deadlift, but once you nail it, you can progress to lifting monster weights that will recruit maximum muscle, release muscle-building hormones, and help you get big.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "     <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dead-Lift</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "         </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\deadlift.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "<p><b>2. <u>Bent-Over Barbell Deadlift</u></b><br /><br />\n" +
                "\n" +
                "Importance: This is probably the second-best back movement in terms of sheer weight you can lift. EMG research has suggested that hitting bent-over barbell rows will work the larger muscle groups of the upper and lower back equally, making this a great overall back builder.Like the deadlift, this is another technical move that requires excellent form but rewards you with a ton of muscle.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "     <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Bent-Over Barbell Dead-Lift</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\bentlift.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "         </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "<p><b>3. <u>Wide-Grip Pull-Up</u></b><br /><br />\n" +
                "\n" +
                "Importance: It's always a good idea to have an overhead pulling movement in your back routine, and the pull-up is one of the best. Wide-grip pull-ups are excellent for putting emphasis on the upper lats. A closer grip may allow for a longer range of motion, but it may be possible to load the wide-grip pull-up to a greater degree because of an optimized starting joint position. The biggest challenge here for most trainers is training to failure in the right rep range for growth, which is 8-12.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "      <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Wide-Grip Pull-Up</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "         <tbody>    \n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pullup.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "          </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "<p><b>4. <u>Standing T-Bar Row</u></b><br /><br />\n" +
                "\n" +
                "Importance: We selected the T-bar row over a chest-supported version because you can pile on much more weight here, even though that typically translates into a bit of cheating through the knees and hips. For some, maintaining a flat back can be challenging, in which case the supported version is a better choice.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "      <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>T-Bar Row</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\tbar.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "          </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "<p><b>5. <u>Seated Cable Row</u></b><br /><br />\n" +
                "\n" +
                "Importance: The seated cable row is an isolated exercise that targets the middle and upper back. This movement also improves shoulder muscle balance and corrects posture. Sit at a low-pulley cable station with a V-handle attachment. Place the feet securely on the platform and grab the handle with both hands using an overhand grip.<br /><br />\n" +
                "</p>     \n" +
                "<div class=\"table-responsive\">\n" +
                "      <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Seated Cable Row</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\seatedcablerow.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "          </tbody>\n" +
                "    </table></div><br>       \n" +
                "\n" +
                "<p><b>6. <u>Close-Grip Pull-Down</u></b><br /><br />\n" +
                "Importance: Since we've already covered the wide-grip pull-up, the wide-grip pull-down is too similar, so we opted for the close-grip handle for our pull-down selection. EMG research suggests that use of a close neutral grip activates the lats similarly to a regular grip, so you're not missing out on any muscle fibres. As mentioned earlier with pull-ups, a closer grip does allow for a longer range of motion and increased time under tension for the lats, which is great for building muscle.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Close-Grip Pull-Down</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pulldown.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "    </table></div><br>\n" +
                "\t   \n" +
                "<p><b>7. <u>Single-Arm Dumbbell Row</u></b><br /><br />\n" +
                "\n" +
                "Importance: This is a great unilateral exercise—each side works independently—that allows you to move a lot of weight. You'll get greater range of motion when training unilaterally, and you won't be restrained if your weaker side fails first. You may also be better able to support your lower back—which may have taken plenty of punishment by now—when placing one hand on a bench. Allowing a slight degree of rotation of the trunk may engage a greater degree of \"core\" musculature, as well.<br /><br />\n" +
                "</p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Single-Arm Dumbbell Row</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead>\n" +
                "         <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\dumbbellrow.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "<p><b>8. <u>Single-Arm Cable Row</u></b><br /><br />\n" +
                "\n" +
                "Importance: Single-arm cable rows target each side of your body independently, which corrects any imbalances in strength, activates your stabilizers to prevent injuries, and increases your core work.\n" +
                "\n" +
                "Set a cable handle to chest-height. Grab the handle, take a step back, and stand facing the cable. Start the movement by pulling your shoulder blade toward your midline and row without twisting your torso. Once you finish all your reps, switch sides.\n" +
                "\n" +
                "For a different stability challenge, get into a split stance with one foot about three feet ahead of the other one—whichever leg is behind, hold the handle with that side.<br /><br />\n" +
                "</p>\n" +
                "            <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>        \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Single-Arm Cable Row</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "       <tbody>        \n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\singlearmrow.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "                </table></div><br>\n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>SHOULDERS</center></div>\n" +
                "        \n" +
                "        <section id=\"shoulder\">\n" +
                "\n" +
                "<p><b>1. <u>Barbell Push Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: This press allows you to load up the most weight (or do more reps) above all other overhead pressing moves. It's considered a bit more of a whole-body movement for developing explosiveness, so you lose some of the isolation effect if you do this same movement seated.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Barbell Push Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "           </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\barbellpushpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>2. <u>Machine Military Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: This is essentially a push press without the extra bit of body English generated through your legs. That makes it a better isolation movement, but this movement still isn't considered an isolation exercise. In fact, it's a highly demanding multijoint overhead press that, still allows for a bit of momentum as well as increased muscle activation.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Military Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "        </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\seatedpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>3. <u>Dumbbell Incline Row</u></b><br /><br />\n" +
                "\n" +
                "    Importance: What the heck is a multijoint rowing exercise doing in an article about shoulder exercises? Remember, rowing movements don't just work the \"back\" they also involve the rear delts to a significant degree as well.<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "         <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Incline Row</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\inclinerow.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "             </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>4. <u>Overhead Dumbbell Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Switching out the barbell for dumbbells on overhead presses works each side independently, making the move more challenging and requiring more input from stabilizer muscles. Moreover, the range of motion is a bit longer as you press the weights together overhead. (In order to perform this exercise perfectly, don't allow them to touch.)<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Overhead Dumbbell Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\overheadpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>5. <u>Seated Overhead Barbell Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Sitting not only makes it hard to use momentum, it also creates a nice base from which to push the weight. A barbell recruits a greater degree of triceps musculature than dumbbells can. If you've got sore shoulders, stick to keeping the bar in front of you.<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Seated Overhead Barbell Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\barbellpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>6. <u>Arnold Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Start with the dumbbells in front of your shoulders with your palms facing you. Press the weights overhead while simultaneously rotating your wrists, so that, in the top position, your palms face forward. Rotate your wrists in the opposite direction when lowering the weights.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Arnold Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\arnoldpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>7. <u>Dumbbell Lateral Raise</u></b><br /><br />\n" +
                "\n" +
                "    Importance: This is a great single-joint movement for the middle delts, but they're tougher to master than they seem. Beginners often have trouble learning how to lead with their elbows. They also tend to rest at the bottom of the motion, when in fact it's better to stop the downward arc when their arms are about 30 degrees out to their sides.<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Lateral Raise</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\latraise.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>8. <u>Front Dumbbell Raise</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Raising your straight arm directly in front of you emphasizes the anterior head of your deltoids. We put this one last because the front delts tend to be disproportionately large among individuals who overdo chest training relative to backside muscles. So the front delts tend to already be well-developed.<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "         <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Front Dumbbell Raise</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "           <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\frontraise.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "             </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>9. <u>Standing Dumbbell Shrug</u></b><br /><br />\n" +
                "    Importance: When it comes to building a great, all around, balanced physique, it can’t be denied that a set of great traps (trapezius) can really help to add the finishing touches to a great body, and really help create a powerful and muscular looking body. However, many people actually neglect their traps because there aren’t that many exercises available for stimulating these muscles, as well as the fact that some people tend to consider the exercises boring. Shrugs are generally considered to best trap exercises, particularly dumbbell shrugs. Dumbbell shrugs are carried out basically exactly as their name suggests, by shrugging whilst holding a set of dumbbells. It gets slightly more technical than that though, so here’s how to perform them correctly.<br /><br /></p>\n" +
                "\n" +
                "    <div class=\"table-responsive\">\n" +
                "     <table class=\"table table-bordered\">\n" +
                "       <thead>         \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Standing Dumbbell Shrug</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "       <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\shrug.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "        </table></div><br>\n" +
                "            \n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        \n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>BICEPS</center></div>\n" +
                "        \n" +
                "        <section id=\"bicep\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>1. <u>WIDE-GRIP STANDING BARBELL CURL</u></b><br /><br />\n" +
                "    Taking a wider-than-normal grip will cause you to externally rotate at the shoulder, so your humerus changes its position. This prompts more involvement from the short head of the biceps. For this and all barbell curls, avoid cheating reps by leaning back. If you want to overload the top, use bands, chains, or a partner for forced reps.<br /><br /></p>\n" +
                "\n" +
                "            <div class=\"table-responsive\">\n" +
                "      <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>WIDE-GRIP STANDING BARBELL CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "          </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\widecurl.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "          </tbody>\n" +
                "                </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>2. <u>EZ BAR CURL</u></b><br /><br />\n" +
                "    Many find the EZ bar significantly more comfortable than a straight bar. It shifts a little bit of the load from the biceps brachii to your other elbow flexors, so an argument could be made that the EZ bar curl is the best all-around biceps builder.<br /><br /></p>\n" +
                "   <div class=\"table-responsive\">\n" +
                "      <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>EZ BAR CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\ez.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "          </tbody>\n" +
                "       </table></div><br>\n" +
                "   \n" +
                "\n" +
                "<p><b>3. <u>BARBELL CURL</u></b><br /><br />\n" +
                "The classic! If you did only this movement for biceps, you would still come out ahead. Since the amount of wrist rotation helps determine how much work our biceps brachii work, it makes sense to maximize supination in a movement where we can load fairly heavy.\n" +
                "\n" +
                "Play around with your grip width. It may reduce discomfort that some experience with a barbell, as well as emphasize a different part of the biceps. A narrower grip will emphasize the long head; a wider grip, the short head.\n" +
                "    <br /><br /></p>\n" +
                "      \n" +
                "\n" +
                "<p><b>4. <u>DUMBBELL BICEPS CURL</u></b><br /><br />\n" +
                "A dumbbell curl is a basic movement that seems to be the icon of fitness. Dumbbells allow the wrists to move freely. And this exercise isolates the bicep area for desired gains. You can also try close and wide grips separately, because it helps to target different bicep areas.\n" +
                "\n" +
                "    Most people will adopt at least a little bit of wrist rotation as they curl—just try to keep as much supination as is comfortable.<br /><br /></p>\n" +
                "      <div class=\"table-responsive\">\n" +
                "\t <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>DUMBBELL BICEPS CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\dumbbellcurl.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "         </tbody>\n" +
                "          </table></div><br>\n" +
                "\t  \n" +
                "\n" +
                "<p><b>5. <u>HAMMER CURL</u></b><br /><br />\n" +
                "    The \"hammer\" or neutral wrist position will typically be our strongest curl. This is because all of our elbow flexors are actively involved, the brachialis is worked the hardest. I would recommend doing this movement like a concentration curl or on a preacher bench. This should minimize cheating and maximize recruitment.<br /><br /></p>\n" +
                "       <div class=\"table-responsive\">\n" +
                "\t   <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>HAMMER CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\hammercurl.gif\" width=\"400px\" height=\"400px\" /></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "           </table></div><br>\n" +
                "\t   \n" +
                "\n" +
                "<p><b>6. <u>CONCENTRATION CURL</u></b><br /><br />\n" +
                "In contrast, concentration curls place the arm in front of the body with a rotation in the shoulder. While this decreases recruitment of the long head, it potentially increases biceps thickness and peak by better short head and brachialis recruitment.\n" +
                "\n" +
                "    I recommend placing your free hand on your off leg to support your body weight. When you hit failure using a supinated grip, switch over to a hammer grip and burn out a few extra reps.<br /><br /></p>\n" +
                "\n" +
                "            <div class=\"table-responsive\">\n" +
                "       <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>CONCENTRATION CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\conccurl.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "           </tbody>\n" +
                "                </table></div><br>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "<p><b>7. <u>OVERHEAD CABLE CURL</u></b><br /><br />\n" +
                "This movement is a great way to practice your front double biceps pose as you train. With our arms in this position, brachialis recruitment is maximized. The higher your elbow, the more isolated the brachialis is from the biceps brachii.\n" +
                "\n" +
                "    A good variation is to do one arm at a time, getting the arm straight up (against the head), curling behind your head.<br /><br /></p>\n" +
                "\n" +
                "            <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>OVERHEAD CABLE CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\overheadcurl.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "                </table></div><br> \n" +
                "\n" +
                "\n" +
                "<p><b>8. <u>PREACHER CURLS</u></b><br /><br />\n" +
                "    Preacher curls do not take it easy on your biceps! It’s one of the best mass building exercises you can include in your arm workout. This variation puts all of the stress directly on the biceps and eliminates any swinging or help with momentum that you might get from a ground based movement like standing barbell curls. When you lift this curved bar using a preacher curl bench, it's all biceps and nothing else. Many lifters use this exercise to develop the peak in their biceps and it’s also great for getting an amazing stretch in the muscle at the bottom of the movement.<br /><br /></p>\n" +
                "       <div class=\"table-responsive\"> \n" +
                "\t\t<table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>PREACHER CURLS</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "          <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\preacher.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t\t    \n" +
                "\t   </tr>\t\t\n" +
                "            </tbody>\n" +
                "           </table></div><br>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "<p><b>9. <u>INCLINE INNER-BICEPS CURL</u></b><br /><br />\n" +
                "The biceps brachii actually consists of two portions or \"heads,\" with differing attachment points. The \"long\" head actually attaches above the shoulder joint, which means that the position of the upper arm relative to the body can determine how much each head of the biceps helps during a curl.\n" +
                "\n" +
                "    This exercise gets your humerus behind your body, stretching the long head to the max. The more horizontal the bench, the more the long head will be stretched.<br /><br /></p>\n" +
                "\n" +
                "            <div class=\"table-responsive\">\n" +
                "    <table class=\"table table-bordered\">\n" +
                "      <thead>    \n" +
                "\t   <tr>\n" +
                "\t       <th><strong>INCLINE INNER-BICEPS CURL</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "       <tbody>    \n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\inccurl.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "                </table></div><br>\n" +
                "          \n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        \n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>TRICEPS</center></div>\n" +
                "        \n" +
                "        <section id=\"tricep\">\n" +
                "\n" +
                "<p>\n" +
                "<b>1. <u>Tricep Pressdown with Cable</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The tricep pressdown with cable is one of the primary mass-building tricep exercises. This exercise can be performed using a variety of bars attached to the cable. If using a straight bar, the wider the grip, the more the outside of the tricep is exercised. Going with too close of a grip may cause wrist or forearm pain. If this occurs, widen the grip. Tricep cable pressdowns can also be performed using a v-bar. The v-bar angles the hands, allowing for a close grip, while limiting wrist or forearm discomfort.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Tricep Pressdown with Cable</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\pressdown.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>2. <u>Back Dips</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    Back dips are one of the more versatile tricep exercises for size and strength. Back dips are a body weight exercise that develops the triceps in the same manner as a close grip press. Back dips can be preferred because they can be done almost anywhere in the gym (or out of the gym). A shoulder-width or slightly-less-than-shoulder-width grip should be used. Putting the hands too close together behind the back will put stress on the wrists and elbows without any added triceps benefit.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Back Dips</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\backdips.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>3. <u>EZ Bar Tricep Extension</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The EZ bar tricep extension is one of the simple tricep exercises that builds size and strength. Tricep extensions work the whole triceps muscle though they are especially effective at training the upper triceps. Due to the position of the elbow during the movement, using too high a weight or using improper form can result in an elbow injury. If the user experiences elbow pain when performing a tricep extension, the upper arms should be angled away from the upper body, rather than perpendicular to it. <br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>EZ Bar Tricep Extension</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\eztricep.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>4. <u>Close Grip Bench Press</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The close grip bench press is one of the fundamental tricep exercises for building tricep size. The chest also receives a secondary workout and this should be factored in when adding this exercise to any routine. This exercise should be performed with your hands as close together as possible, but this can be an uncomfortable position. Any grip position with the hands less than shoulder-width apart will be sufficient. The closer the hands are together, the more the exercise hits the triceps and not the chest.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Close Grip Bench Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "      </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\closebench.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "\t   </table><br />\n" +
                "\n" +
                "\n" +
                "<p><b>5. <u>Dumbbell Extension</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The dumbbell extension is one of the simple tricep exercises that is best performed at a low weight. Dumbbell extensions work the whole triceps muscle, though they are especially effective at training the upper triceps. Due to the position of the elbow during the movement, using too high a weight or using improper form can result in an elbow injury. Because dumbbell extensions are a shaping exercise, they should be performed slowly and deliberately, making sure to go through the full range of motion. <br /><br /></p>\n" +
                "\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Extension</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\botharm.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>6. <u>Dumbbell Kickbacks</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    Dumbbell kickbacks are a good exercise for developing the upper triceps. They should be performed with lower weight, making sure to keep the upper arm in a set position throughout the exercise. Though commonly performed one arm at a time with the other arm acting as support, they may be performed using both arms at the same time. Men with low back pain should be careful when performing them and should not perform them in this two-arm manner. By bracing the body weight with the free hand, low back pressure will be relieved.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Kickbacks</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\kickback.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>7. <u>Dumbbell Tricep Press</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The dumbbell tricep press is one of the fundamental tricep exercises for building mass. It can  be performed either seated or standing. Seated is preferable to standing for those with lower back problems. This exercise works the entire tricep. By performing the press with a dumbbell, you are forced to use a close-grip and isolate the tricep. If this exercise can not be performed without the flaring of the elbows, lower the weight and perform the exercise again.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Tricep Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\triceppress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>8. <u>One Arm Dumbbell Tricep Extension</u></b><br /><br />\n" +
                "\n" +
                "\n" +
                "    The one arm dumbbell tricep extension is a variation on the dumbbell tricep extension. Whereas the dumbbell tricep extension is usually used for size and strength, the one arm version is one of the better tricep exercises for shaping and developing the muscle. Performing the exercise with one arm provides two distinct benefits. The first is the longer range of motion. The user is pulling the dumbbell from almost above the opposite shoulder. The second benefit is that the arms are worked independently.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "    <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>One Arm Dumbbell Tricep Extension</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\singlearm.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody> \n" +
                "    </table></div><br>\n" +
                "\n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        \n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>FOREARMS</center></div>\n" +
                "        \n" +
                "        <section id=\"forearm\">\n" +
                "\n" +
                "<p>\n" +
                "\n" +
                "<b>1. <u>THE WRIST EXTENSORS</u></b><br /><br />\n" +
                "As their name suggests, the extensors enable the hand to extend backward. The extensors are comprised of eight heads: the extensor digitorum, extensor carpi radialis longus, extensor carpi radialis brevis, extensor carpi ulnaris, extensor indicis, extensor digiti minimi, extensor pollicis longus, and the extensor pollicis brevis. These muscles run the outside length of the forearm and to develop them effectively a number of reverse grip movements need to be employed<br /><br /></p>\n" +
                "    <div class=\"table-responsive\">\n" +
                "    <table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Wrist Extensors</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\we.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>2. <u>THE WRIST FLEXORS</u></b><br /><br />\n" +
                "The flexors run the length of the inner forearm and are their most notable muscle in terms of size conveyance. The wrist flexors have six heads: the flexor digitorum superficialis, flexor digitorum profundus, flexor carpi radialis, flexor carpi ulnaris, palmaris longus, and the flexor pollicis longus. <br /><br /></p>\n" +
                "    <div class=\"table-responsive\">\n" +
                "    <table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Wrist Flexors</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\wf.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "        </table></div><br>\n" +
                "\n" +
                "<p>\n" +
                "<b>3. <u>FARMER'S CARRY</u></b><br /><br />\n" +
                "The Strongman Total-Body, Circuit Workout\n" +
                "The farmer’s carry is an essential exercise to build a vice-like grip and powerful forearms. It also develops a stronger core and improves your shoulder stability.\n" +
                "\n" +
                "Grab a heavy dumbbell or kettlebell in each hand, stand tall, and start walking. Keep your abs braced, your chest tall and your shoulders pulled back at all times.\n" +
                "\n" +
                "To use this as a warmup drill to stimulate total-body stability, do 2-3 sets for 20 yards. Or save it until the end as a brutal finisher and carry the weights as far as you can for 10 minutes. <br /><br />\n" +
                "\n" +
                "\n" +
                "<b>4. <u>TRAP BAR CARRY</u></b><br /><br />\n" +
                "Best Moves for Building Big, Nasty Traps\n" +
                "A trap bar carry lets you to carry much more weight than a farmer’s carry, which increases your forearm strength and total-body stability.\n" +
                "\n" +
                "Load a trap bar with a heavy weight, stand inside, lift it up, and start walking. Stay as tall as you can and keep your abs tight and your shoulders pulled back.\n" +
                "\n" +
                "To maximize your grip strength, do 2-3 sets for 15 yards. Or save it until the end as a brutal finisher and carry the weights as far as you can for 10 minutes. <br /><br />\n" +
                "\n" +
                "\n" +
                "<b>5. <u>TOWEL PULLUPS</u></b><br /><br />\n" +
                "\n" +
                "Pullups already build a strong grip and thick arms. Gripping a towel instead of the bar, however, skyrockets the work on your forearms—now, you have to crush the towels just to stay up and squeeze even tighter to pull yourself up. Don’t be surprised if you can only do one or two on your first try.\n" +
                "\n" +
                "Wrap two towels around a pullup bar. Grabbing a towel in each hand, perform your pullups, keeping your chest up and your shoulders down as you rise. If this is too hard, however, start with just one hand grabbing a towel and the other hand grabbing the pullup bar. Then, alternate sides. <br /><br />\n" +
                "\n" +
                "<b>6. <u>Hand Gripper</u></b><br /><br />\n" +
                "\n" +
                "Last but not the least, hand grip or hand gripper is one of the best exercises for the overall muscle and strength development of your forearms. It increases the strength of hand's grip and all the stress affects directly on the wrist and upper forearm muscles.<br />\n" +
                "    Try it 2-3 times a day 2-3 sets every-time you exercise. Number of reps can vary according to the strength of individual's hands. But regular practice definitely results in increased strength of muscles and hence increased number of reps.<br /><br /></p>\n" +
                "    <div class=\"table-responsive\">\n" +
                "        <table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Muscles Worked</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\hg.jpg\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "        </table></div><br>\n" +
                "            \n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div>\n" +
                "        \n" +
                "        <br><br>\n" +
                "        \n" +
                "        <div class=\"well well-sm\"><center>LEGS</center></div>\n" +
                "        \n" +
                "        <section id=\"legs\">\n" +
                "\n" +
                "<p>\n" +
                "<p><b>1. <u>Front Squat</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Some individuals find that squats build their butts well, but they really need help building their quads. If that's you, try front squats! By shifting the bar from the back to the front of the body, an amazing exercise to target the quads. Front squats emphasize the quads over the glutes and hams, which means you'll sacrifice some of the load.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Front Squat</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" +
                "\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\front.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "     </tbody>\t   \n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>2. <u>Squat (High And Low Bar)</u></b><br /><br />\n" +
                "\n" +
                "    Importance: Squats are king because they're simply the most challenging leg movement you can do, especially when loaded appropriately. They work all the lower-body musculature (we're counting glutes), and have been shown to spike muscle-building hormone release. In fact, we even know that squatting before doing curls has been shown to significantly improve arm strength.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Squat (High And Low Bar)</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\barsquat.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p><b>3. <u>Deadlift</u></b><br /><br />\n" +
                "\n" +
                "Importance: Deadlifts and deadlift variations like sumo are considered whole-body exercises, specifically for the posterior chain, which includes the hamstrings and glutes. But there is quad activation in this movement as well, mainly observed in the sumo deadlift.\n" +
                "\n" +
                "    Because you can use a tremendous amount of weight, you'll see strength improvements in all these areas. And because of the amount of muscle mass that's engaged in the movement, this exercise can incur a nice hormonal response as well.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Deadlift</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\deadlift.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><p><b>4. <u>Bulgarian Split Squat</u></b><br /><br />\n" +
                "    Importance: This one is deceptively difficult, partly because of balance and partly because you're training one side at a time. The Bulgarian split squat is essentially a split squat, but your rear leg is elevated, which forces the front leg to pick up more of the workload. Try it on a Smith machine if you find it difficult to balance the weight.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Bulgarian Split Squat</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\bsplit.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>5. <u>Dumbbell Lunge</u></b><br /><br />\n" +
                "\n" +
                "Importance: Like all the movements listed thus far, multijoint lunges require hip and knee extension, which gives you the stimulus for the thighs and glutes. They can be done standing in place, or stepping forward or backward—decide for yourself which subtle variation you prefer. You can also choose between a barbell and dumbbells.\n" +
                "\n" +
                "    We slightly prefer the latter because of the ease of getting into and out of the start position and the decreased likelihood of knocking something down when doing the walking version down the weight-room floor.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Dumbbell Lunge</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\lunge.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>6. <u>Leg Press</u></b><br /><br />\n" +
                "\n" +
                "    Importance: For those of you hoping leg presses could replace squats in your leg workout, the divide between the two movements can't be overstated. Because the leg press recruits less muscle mass than squats, it simply doesn't generate the same degree of testosterone release. Nor is the body position here particularly functional, unless your log cabin collapses and your only way out is pushing the timber forward.<br /><br /></p>\n" +
                "<div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Leg Press</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\legpress.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "    </table></div><br>\n" +
                "\n" +
                "\n" +
                "<p><b>7. <u>Romanian Deadlift</u></b><br /><br />\n" +
                "\n" +
                "Importance: This upper hamstrings/glute exercise is unlike most others because you can really overload it. Plus, most hamstring routines focus on leg-curl movements, which center around the knee joint, but this one works from the hip joint. It's vastly underutilized in most trainees' workouts, another reason we believe it's a good fit.<br /><br />\n" +
                "\n" +
                "    The Romanian deadlift is probably one of the trickiest exercises you'll ever learn to do, and learning good form is imperative. More often than not, we see this done incorrectly, so keep practicing. You never want to allow your lower back to round.<br /><br /></p>\n" +
                "    <div class=\"table-responsive\">\n" +
                "<table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>Romanian Deadlift</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "    <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\romanian.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "    </tbody>\n" +
                "        </table></div><br>\n" +
                "    \n" +
                "<p><b>8. <u>One Leg Squat</u></b><br /><br />\n" +
                "\n" +
                "Importance: Single leg squats are an excellent functional bodyweight training exercise that will develop leg strength, flexibility, improve balance and increase your vertical jump. \n" +
                "\n" +
                "    The pistol squat is a very impressive exercise that few can do without dedicated training. It requires huge effort from the core to keep the back straight whilst lowering into a deep squat position.<br /><br />  </p>  \n" +
                "<div class=\"table-responsive\">\n" +
                "   <table class=\"table table-bordered\">\n" +
                "       <thead>\n" +
                "\t   <tr>\n" +
                "\t       <th><strong>One Leg Squat</strong></th>\n" +
                "\t       \n" +
                "\t\t</tr>\n" +
                "       </thead>\n" +
                "       <tbody>\n" +
                "       <tr>\n" +
                "\t        <td ><img src=\"images\\gif\\oneleg.gif\" width=\"400px\" height=\"400px\"/></td>\n" +
                "\t          \n" +
                "\t   </tr>\t\t\n" +
                "\t   </tbody>\n" +
                "    </table></div><br>\n" +
                "            \n" +
                "</section>\n" +
                "        \n" +
                "        <div class=\"btn-group btn-group-justified\">\n" +
                "           <div class=\"btn-group\">\n" +
                "               <a href=\"#\"><button type=\"button\" class=\"btn btn-basic\">Back To Top</button></a>\n" +
                "            </div> </div><br>\n" +
                "        \n" +
                "    </div>\n" +
                "    \n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>    \n" +
                "  <script src=\"bootstrap.js\"></script>\n" +
                "    \n" +
                "    </body>    \n" +
                "</html>";

        webView6.loadDataWithBaseURL("file:///android_asset/", ex, "text/html", "UTF-8", null);
    }
}
