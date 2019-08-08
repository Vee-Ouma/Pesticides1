package com.example.pesticide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Last_page extends AppCompatActivity {

    String val1,val2;

    String c1,c2,c3,c4;
    String r1,r2,r3,r4;
    String p1,p2,p3,p4;
    String s1,s2,s3,s4;

    String w1,w2,w3,w4;
    String c1_diagnosis,c1_prevention,c1_treatment;
    String c2_diagnosis,c2_prevention,c2_treatment;
    String c3_diagnosis,c3_prevention,c3_treatment;
    String c4_diagnosis,c4_prevention,c4_treatment;
    String r1_diagnosis,r1_prevention,r1_treatment;
    String r2_diagnosis,r2_prevention,r2_treatment;
    String r3_diagnosis,r3_prevention,r3_treatment;
    String r4_diagnosis,r4_prevention,r4_treatment;
    String s1_diagnosis,s1_prevention,s1_treatment;
    String s2_diagnosis,s2_prevention,s2_treatment;
    String s3_diagnosis,s3_prevention,s3_treatment;
    String s4_diagnosis,s4_prevention,s4_treatment;

    String p1_diagnosis,p1_prevention,p1_treatment;
    String p2_diagnosis,p2_prevention,p2_treatment;
    String p3_diagnosis,p3_prevention,p3_treatment;
    String p4_diagnosis,p4_prevention,p4_treatment;

    String w1_diagnosis,w1_prevention,w1_treatment;
    String w2_diagnosis,w2_prevention,w2_treatment;
    String w3_diagnosis,w3_prevention,w3_treatment;
    String w4_diagnosis,w4_prevention,w4_treatment;


    ImageView d1_pic;

    TextView origin,disease_name,diagnosis,preventive_measures,treatment;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);

        c1="Rotten Rot of Cotton";
        c2="Bacterial Blight of Cotton";
        c3="Cotton Aphids";
        c4="Soreshin";

        r1="Rice Hispa";
        r2="Rice case worm";
        r3="Demerara Froghopper";
        r4="Rice Leaf Mite";

        p1="Peanut Aphids";
        p2="White Grub";
        p3="Peanut Termites";
        p4="Phyllosticta leaf spot";

        s1="Wilt disease of sugarcane";
        s2="Bacterial Blight of sugarcane";
        s3="Sugarcane Aphids";
        s4="Root borer";



        w1="Yellow stripe Rust";
        w2="Powdery mildew of cereals";
        w3="Root and foot rot";
        w4="wheat Aphids";


        d1_pic=findViewById(R.id.disease_picture);

        c1_diagnosis="Wilting and defoliation of plants.plants my lodge.yellowish discoloration of roots bark.";
        c1_prevention="1.plant varieties with stronger stems that will not lodge.\n" +
                "2.use wider spacing between the plants.\n" +
                "3.Maintain good soil moisture throughout the irrigation\n" +
                "4.Harvest early to avoid major yield losses.\n" +
                "5.Plow deep to bury crop residues\n" +
                "6.Solarization of soil residues after tillage may also be effective\n" +
                "7.Grow varieties tolerant to the fungus or to drought.";
        c1_treatment="The promising fungicide for the control of the root rot of cottnpon are(carbendazim, carboxin, MEMC, captafol, mancozeb, copper\n" +
                "oxychloride, captan, thiophanate-M, sulphur, dodine, kitazin and celest. The\n" +
                "carbendazium, MEMC and thiophanate M proved toxic to biocontrol cultures also. Other\n" +
                "fungicides however, reacted differently to bioagents. For instance, captafol and mancozeb when\n" +
                "used upto 100 ppm did not inhibit any of the biocontrol cultures tested whereas these fungicides\n" +
                "were highly toxic to R.solani at this concentration. Similarly captafol at 500 and 1000 ppm did not\n" +
                "inhibit T. viride but was toxic to R. bataticola. Further it was noted that captan at 100 ppm was not\n" +
                "toxic to G.virens but showed 75% and 100% inhibition of R.solani and R.bataticola respectively.\n" +
                "Kitazin at 50 ppm did not inhibit T.harzianum and G.virens whereas R.solani and R.bataticola\n" +
                "were inhibited to the extent of 43% and 65% respectively at this concentration. This shows a\n" +
                "distinct possibility of integrating lower concentration of fungicides alongwith biocontrol agents for\n" +
                "the management of root rot of cotton.";

        c2_diagnosis="1.Premature defoliation\n" +
                "2.Black cankers on stem and branches\n" +
                "3.Spots become brown.\n" +
                "4.Waxy,water soaked spots with red to brown borders";
        c2_prevention="1.Plant high-quality, disease free, acid delinted seed.\n" +
                "2.Plant blight-resistant varieties where available.\n" +
                "3.Scout fields and identify infected plants and varieties.\n" +
                "4.Shred stalks and incorporate cotton debris.\n" +
                "5.Do not cultivate or move equipment through fields when foliage is wet.";
        c2_treatment="Biological Control: \n" +
                "1: Application of talc-based powder.\n" +
                "2.Extracts of Azadirachta indica(neem extract)\n" +
                "Chemical Control:\n" +
                "1.Seed Treatment with authorized antibiotics and foliar spray with cupravit are very efiicient.\n" +
                "2.Cleaning of seeds with an acid treatment followed by seed dressing with copper oxychloride also shows good results.";
        c3_diagnosis="1.Curled and deformed leaves\n" +
                "2.Little insects under the leaves and shoots.\n" +
                "3.Stunted growth.\n";
        c3_prevention="1.For fruit or shade trees, spray dormant horticultural oil to kill overwintering aphid eggs.\n" +
                "2.Beneficial insects, such as lady beetles, lacewings, and parasitic wasps, will feed on aphids. Supplemental populations of these insects can be ordered online and should help keep the aphid populations controlled from the start.\n" +
                "3.Companion planting can be very helpful to keep aphids away from your plants in the first place. ";
        c3_treatment="Recommended Products:\n" +
                "1.Azadirachtin 0.03% EC\n" +
                "2.Azadirachtin 5.0%EC\n" +
                "3.Deltamethrin 1.8% Ec";
        c4_diagnosis="1.Plants may die.\n" +
                "2.Gridled stems.\n" +
                "3.Irregular shaped black to reddish brown lesion on the stem of the seedling";
        c4_prevention="1.Chose resistant or resilient varieties.\n" +
                "2.Use desease free seedling material.\n" +
                "3.Do not plant in wet soil.\n" +
                "4.Do not irrigate during cool weather\n" +
                "5.Crop rotation with sorghum and small grains is recommended.\n" +
                "6.Plant when soil temperature are greater the 20 degree celcius.";
        c4_treatment="Chemical Control:\n" +
                "1.Fungicides treatment with etridiaole, copper,oxychloride,tiram and captan significantly.";
        r1_diagnosis="1.White,parallel streaks or patches along the main axis of leaves.\n" +
                "2.Irregular white patches.\n" +
                "3.Withering of leaves.\n" +
                "4.Dark blue or blackish somewhat square shaped,spined beetles.";
        r1_prevention="1.No effective resistance trait to this pest is available in rice.\n" +
                "2.Use narrower plant spacing with greater leaf densities that can tolerate higher hispa numbers.\n" +
                "3.Grow crops early in the season to avoid peak populations.\n" +
                "4.Cut the shoot tip to prevent egg laying.\n" +
                "5.Collect adult bugs with a sweeping net,preferably early in the morning when they are less mobile.\n" +
                "6.Remove any kind of wwed from the rice field during the crop-free season.\n" +
                "7.Infested leaves and shoots should be clipped and burned,or buried deep in the mud.\n" +
                "8.Avoid excessive nitrogen fertilization in infested fields\n" +
                "8.Apply a crop rotation to break the lifecycle of the pest.";
        r1_treatment="1.Insecticides containing Quinalphos 25.0% EC\n" +
                "2.Insecticides containing Lambda-cyhalothrin 2.5% EC\n" +
                "3.Biological control by the release of Eulophus femoralis";
        r2_diagnosis="1.Leaves cut at right angles.\n" +
                "2.Ladder-like structures.\n" +
                "3.Larvae is green with yellow head.\n" +
                "4.Adults are white moths";
        r2_prevention="1.Early planting reduces the incidence.\n" +
                "2.Use wider spacing(30*20cm) when planting.\n" +
                "3.Transplant older seedlings and destroy possible remaining eggs.\n" +
                "4.Drain the field and use filters to catch worms when re-irrigating after 2-3 days.\n" +
                "5.Use recommended fertilizer applications,avoiding excess application.\n" +
                "6.Remove weedes and weedy rice in the field and nearby areas to remove alternate hosts.\n" +
                "7.Make sure that adequate pottasium is used.";
        r2_treatment="1.Biological control agents such as snails,spiders.\n" +
                "2.Apply ash or spray neem extracts to the place where insects are found.\n" +
                "3.Use foliar treatments of authorized carbamate insecticides and avoid pyrethroids.";
        r3_diagnosis="1.Yellowing and wilting of leaves.\n" +
                "2.Dying of young plants.\n" +
                "3.White foamy liquid-\"spittle mass\".\n" +
                "4.Dark brown froghopper with light brown pattern on its back.";
        r3_prevention="1.Monitor the field for the presence of white foamy liquid on leaves(spittle mass).\n" +
                "2.Control alternative hosts in and around the field.";
        r3_treatment="1.Time for  hatching significantly decreases in overnight temperature.\n" +
                "2.Integrated pest control program with preventive measures.";
        r4_diagnosis="1.Powdery web substance on lower leaf side.\n" +
                "2.Yellowish and brown specks on the upper side.\n" +
                "3.Leaves turn grayish and dry up.\n" +
                "4.Mite is very small,hard to see without hand lense.";
        r4_prevention="1.Regular monitor on the field for symptoms of the mite.\n" +
                "2.Keep the rice bunds free from weeds,which can serve as alternative hosts to the mite.\n" +
                "3.Create rice-free periods by rotating crops or ploughing down rice stubbles deeply,immediately after harvesting.\n" +
                "4.Avoid excessive nitrogen fertilization,which favours the pest.";
        r4_treatment="1.Biological control includes the treatment of seeds with bacteria of the pseudomonasas type at 10g/1kg of seeds.\n" +
                "2.Application of urea mixed with neem cake to the rice plants.\n" +
                "3.Spray wettable sulphur @3g after detection of symptoms.\n" +
                "4.Miticides containing spiromesifen are highly effective.";


        s1_diagnosis="1.Pale plant discoloration.\n" +
                "2.Stunted growth.\n" +
                "3.Dark red to purple nodes.\n" +
                "4.Hollow and dry cane stalks.";
        s1_prevention="1.Make sure to get seeds or transplants from certified sources.\n" +
                "2.Crop rotation with non host plants is recommended.\n" +
                "3.Avoid inguires on plants while working.\n" +
                "4.Provide good drainage to fields and avoid overwatering.";
        s1_treatment="1.Treat the seeds with moist hot air at 54 degree celsius for 150 minutes.\n" +
                "2.Then dip the seeds in 0.1% bleach solution for 10 to 15 minutes\n" +
                "3.No chemical treatment is effective against wilt disease in sugarcane.\n";
        s2_diagnosis="1.Watery-green stripes along midrib and base of leaf.\n" +
                "2.Striped spreading across the whole leaf,becoming reddish.\n" +
                "3.Wilting and rotting of leaves.\n" +
                "4.Reduced root system.\n" +
                "5.Stunted growth.";
        s2_prevention="1.Grow resistant varieties.\n" +
                "2.Collect healthy planting material from the seed nursery.\n" +
                "3.Implement wide crop rotation with green manure crops.\n" +
                "4.Improve your drainage system to reduce the incidence of the disease.\n" +
                "5.Fertilize moderately with nitrogen.";
        s2_treatment="1.Integrative approach with preventive measures.\n" +
                "2.Seeds can be treated with appropriate fungicide for 15 to 20 minutes.";
        s3_diagnosis="1.Curled and deformed leaves.\n" +
                "2.Little insects under the leaves and shoots.\n" +
                "3.Stunted growth.";
        s3_prevention="1.Maintain a high number of different varieties of plants around the field.\n" +
                "2.Use reflective mulches to repel invading populations of aphids.\n" +
                "3.Remove infected plant parts.\n" +
                "4.Do not over-water or over-fertilize.\n" +
                "5.Control insecticide use in order not to affect beneficial insects.\n" +
                "6.Remove plant debris from the previous culture.";
        s3_treatment="1.Beneficial insects such as predatory ladybugs,lacewings,soldier beetles and parasitoid wasps as biocontrol agents.\n" +
                "2.Use a simple soft insecticidal soap solution or solution based on plant oils.\n" +
                "3.Simple spray of water.\n" +
                "4.Stem application with flonicamid and water @1:20 ratio at 30,45,60 days after sowing.\n" +
                "5.Fipronil 2ml or acetampride @0.2g can also be used.";
        s4_diagnosis="1.Eggs are laid in groups under litter or in the ground.\n" +
                "2.The eggs are hatched after two or three weeks and they tunnel downward into the ground where they feed on the roots of trees and shrubs.\n" +
                "3.Plants shows stunted growth and can be blown over during adverse weather.";
        s4_prevention="1.Use resistant varieties if available.\n" +
                "2.Cut some stem or root logs in two parts and bury them below the soil surface to attract females.\n" +
                "3.Crop rotation is recommended in fields infested with this pest.\n" +
                "4.Stimulate beneficial insect predators like ants and beetles.\n" +
                "5.Use a fallow with cover crops of a minimum two yeats before planting again.";
        s4_treatment="1.Predators such as Plasesius javanus and Dactylosternus hydrophiloides can be used.\n" +
                "2.Hot water treatment of suckers(at 43 degree celsius for 20 mins) can be effective.\n" +
                "3.Dipping suckers in 20% azadirachta indica at planting also protects the young plants.\n" +
                "4.Imidacloprid 40.0% WDG,Fipronil 40.0% WDG";

        p1_diagnosis="1.Curled and deformed leaves.\n" +
                "2.Little insects under the leaves and shoots.\n" +
                "3.Stunted growth.";
        p1_prevention="1.Maintain a high number of different varieties of plants around the field.\n" +
                "2.Use reflective mulches to repel invading populations of aphids.\n" +
                "3.Remove infected plant parts.\n" +
                "4.Do not over-water or over-fertilize.\n" +
                "5.Control insecticide use in order not to affect beneficial insects.\n" +
                "6.Remove plant debris from the previous culture.";
        p1_treatment="1.Beneficial insects such as predatory ladybugs,lacewings,soldier beetles and parasitoid wasps as biocontrol agents.\n" +
                "2.Use a simple soft insecticidal soap solution or solution based on plant oils.\n" +
                "3.Simple spray of water.\n" +
                "4.Stem application with flonicamid and water @1:20 ratio at 30,45,60 days after sowing.\n" +
                "5.Fipronil 2ml or acetampride @0.2g can also be used. ";
        p2_diagnosis="1.Wilting and yellowing of the canopy.\n" +
                "2.Plants die, can be easily pulled out form the soil.\n" +
                "3.Reduction of yields.\n" +
                "4.Adults are dark brown,about 20mm long and 8mm wide.";
        p2_prevention="1.Plant resilient varieties available in your market.\n" +
                "2.Sow early might avoid peaks of grub damage.\n" +
                "3.Sow trap crops like sorghum,maize or onion in between peanut plants.\n" +
                "4.Collect and destroy white grubs around the field,preferrably in the morning.\n" +
                "5.Apply potassium as base fertilizer to strengthen root systems and increase tolerance to grub damage.\n" +
                "6.Install light traps.";
        p2_treatment="1.Use extracts of Solanum surattense or neem leaves as a seed treatment.\n" +
                "2.Treat the kernels with kerosene(one litre per 75kg/seeds) before sowing.\n" +
                "3.Seed treatment with chlorpyripos 20% EC @ 6.5 ml/kg seed is also a good way t\n" +
                "the development of insects.";
        p3_diagnosis="1.Wilting of young or older plants and often lodging.\n" +
                "2.Presence of termites and tunnels around and in the roots.\n" +
                "3.Roots and the base of the stem are hallowed out";
        p3_prevention="1.Harvest early if possible,as termites often attack the crops left over in the field after the maturity.\n" +
                "2.Promote conditions for healthy plant growth.\n" +
                "3.Remove plant residues and other debris after harvest.\n" +
                "4.Plow fields to destroy termites nests and tunnels and to expose them to predators,such as ants,birds,chicken.\n" +
                "5.Inspect plants regularly,early in the morning or late in the afternoon.";
        p3_treatment="1.Preparations based on nematodes that attack termites are effective against ths pest.\n" +
                "2.Solutions containing the fungi Beauveria bassiana or some species of Metarhizum are effective when applied to the termite hill.\n" +
                "3.Insectides containing Thiamethoxaam 75.0% SG";
        p4_diagnosis="1.Light tan lesions with darker argins on leaves.\n" +
                "2.Lesions becomes grayish,dry up,fall off.\n" +
                "3.Leaves with holes.";
        p4_prevention="1.Use resistant varieties if available.\n" +
                "2.Be careful not to injure plants during field work.\n" +
                "3.Irrigate in the morning,to avoid wet soil conditions during the night.\n" +
                "4.Remove crop debris after harvest and burn it.\n" +
                "5.Spread lime in fields to increase the soil pH values.";
        p4_treatment="1.Fungicides are recommended.\n" +
                "2.Integrative approach with the preventive measures.";


        w1_diagnosis="1.Tiny,rusty pustules arranged in stripes.\n" +
                "2.Stems and heads can also be affected.1.Tiny,rusty pustules arranged in stripes.\n" +
                "2.Stems and heads can also be affected.";
        w1_prevention="1.Cultivate disease resistant varieties if available.\n" +
                "2.Ensure adequate nitrogen fertilizartion,avoid excess nitrogen use.\n" +
                "3.Screen fields regularly for volunteer plants and remove them.\n" +
                "4.Plow and dig crop residues deep in the soil after harvest.\n";
        w1_treatment="1.Use of biofungicides and products based on Bacillus pumilus applied at 7 to 14 days intervals are effective.\n" +
                "2.Fungicides containing propiconazole 11.7% SC and Azoxystrobin 7.0% SC\n" +
                "3.Fungicides containing difenoconazole 11.4% SC and Azoxystrobin 18.2% SC\n" +
                "Powdery mildew of cereals";
        w2_diagnosis="1.White,fluffy patches appear on leaves,stems and ears.\n" +
                "2.In some crops,the patches can appear as large,raised pustules instead.\n" +
                "3.These powdery zones turn gray-tan as the disease progresses.\n" +
                "4.Late in the season,conspicuous black specks may appear amidst the white patches.";
        w2_prevention="1.Chose resistant varieties if available.\n" +
                "2.Modify field regularly for first signs of the diseases.\n" +
                "3.Plan a crop rotation with non host plants.\n" +
                "4.Eliminate volunteer plants and weeds from the field to disrupt the lifecycle.\n" +
                "5.Complement the fertilization program with silicon or calcium silicate to strenghthen the resistance of plants.";
        w2_treatment="1.Milk solutions can be used.\n" +
                "2.Fungicide containing propiconazole 11.7% SC and azoxystrobin 7.0% SC.";
        w3_diagnosis="1.Brown areas at the base of the stem and roots.\n" +
                "2.Elongated,brown-black spots on lower leaves.\n" +
                "3.Premature bleaching of spikelets or entire head.\n" +
                "4.Yellow coloured and stunted plants.";
        w3_prevention="1.Be aware of quarantine regulation fro this pathogen.\n" +
                "2.Select certified diesease free seeds.\n" +
                "3.Have a proper fertilization program with split application of nitrogen.\n" +
                "4.Make sure to add micronutrient to fortify your crop.";
        w3_treatment="1.The fungus of Sporobolomyces roseus is used to reduce the severity of the disease.\n" +
                "2.Fungicide containing propiconazole 11.7% SC and azoxystrobin 7.0% SC.\n";
        w4_diagnosis="1.Curled and deformed leaves.\n" +
                "2.Little insects under the leaves and shoots.\n" +
                "3.Stunted growth.";
        w4_prevention="1.Maintain a high number of different varieties of plants around the field.\n" +
                "2.Use reflective mulches to repel invading populations of aphids.\n" +
                "3.Remove infected plant parts.\n" +
                "4.Do not over-water or over-fertilize.\n" +
                "5.Control insecticide use in order not to affect beneficial insects.\n" +
                "6.Remove plant debris from the previous culture.";
        w4_treatment="1.Beneficial insects such as predatory ladybugs,lacewings,soldier beetles and parasitoid wasps as biocontrol agents.\n" +
                "2.Use a simple soft insecticidal soap solution or solution based on plant oils.\n" +
                "3.Simple spray of water.\n" +
                "4.Stem application with flonicamid and water @1:20 ratio at 30,45,60 days after sowing.\n" +
                "5.Fipronil 2ml or acetampride @0.2g can also be used. ";




        origin=findViewById(R.id.origin);
        disease_name=findViewById(R.id.name);
        diagnosis=findViewById(R.id.diagnosis);
        preventive_measures=findViewById(R.id.prevention);
        treatment=findViewById(R.id.treat_now);
        picture=findViewById(R.id.disease_picture);

        Intent getValue = getIntent();
        val1 = getValue.getStringExtra("parent");
        val2=getValue.getStringExtra("child");


        origin.setText(val1);
        disease_name.setText(val2);

        if(val2.equalsIgnoreCase(c1)){
            diagnosis.setText(c1_diagnosis);
            preventive_measures.setText(c1_prevention);
            treatment.setText(c1_treatment);
            d1_pic.setImageResource(R.drawable.root_rot_cotton);
        }

        if(val2.equalsIgnoreCase(c2)){
            diagnosis.setText(c2_diagnosis);
            preventive_measures.setText(c2_prevention);
            treatment.setText(c2_treatment);
            d1_pic.setImageResource(R.drawable.bacterial_blight_of_cotton);
        }
        if(val2.equalsIgnoreCase(c3)){
            diagnosis.setText(c3_diagnosis);
            preventive_measures.setText(c3_prevention);
            treatment.setText(c3_treatment);
            d1_pic.setImageResource(R.drawable.cotton_aphid);
        }
        if(val2.equalsIgnoreCase(c4)){
            diagnosis.setText(c4_diagnosis);
            preventive_measures.setText(c4_prevention);
            treatment.setText(c4_treatment);
            d1_pic.setImageResource(R.drawable.shoreshin_cotton);
        }

        if(val2.equalsIgnoreCase(r1)){
            diagnosis.setText(r1_diagnosis);
            preventive_measures.setText(r1_prevention);
            treatment.setText(r1_treatment);
            d1_pic.setImageResource(R.drawable.rice_hispa);
        }

        if(val2.equalsIgnoreCase(r2)){
            diagnosis.setText(r2_diagnosis);
            preventive_measures.setText(r2_prevention);
            treatment.setText(r2_treatment);
            d1_pic.setImageResource(R.drawable.rice_case_worm1);
        }
        if(val2.equalsIgnoreCase(r3)){
            diagnosis.setText(r3_diagnosis);
            preventive_measures.setText(r3_prevention);
            treatment.setText(r3_treatment);
            d1_pic.setImageResource(R.drawable.frog_hopper);
        }
        if(val2.equalsIgnoreCase(r4)){
            diagnosis.setText(r4_diagnosis);
            preventive_measures.setText(r4_prevention);
            treatment.setText(r4_treatment);
            d1_pic.setImageResource(R.drawable.rice_leaf_mite);
        }

        if(val2.equalsIgnoreCase(s1)){
            diagnosis.setText(s1_diagnosis);
            preventive_measures.setText(s1_prevention);
            treatment.setText(s1_treatment);
            d1_pic.setImageResource(R.drawable.sugarcane_wilt);
        }

        if(val2.equalsIgnoreCase(s2)){
            diagnosis.setText(s2_diagnosis);
            preventive_measures.setText(s2_prevention);
            treatment.setText(s2_treatment);
            d1_pic.setImageResource(R.drawable.bacterial_bacterial_of_bacteria);
        }
        if(val2.equalsIgnoreCase(s3)){
            diagnosis.setText(s3_diagnosis);
            preventive_measures.setText(s3_prevention);
            treatment.setText(s3_treatment);
            d1_pic.setImageResource(R.drawable.sugarcane_aphids);
        }
        if(val2.equalsIgnoreCase(s4)){
            diagnosis.setText(s4_diagnosis);
            preventive_measures.setText(s4_prevention);
            treatment.setText(s4_treatment);
            d1_pic.setImageResource(R.drawable.root_borer);
        }
        if(val2.equalsIgnoreCase(p1)){
            diagnosis.setText(p1_diagnosis);
            preventive_measures.setText(p1_prevention);
            treatment.setText(p1_treatment);
            d1_pic.setImageResource(R.drawable.peanut_aphids);
        }

        if(val2.equalsIgnoreCase(p2)){
            diagnosis.setText(p2_diagnosis);
            preventive_measures.setText(p2_prevention);
            treatment.setText(p2_treatment);
            d1_pic.setImageResource(R.drawable.peanut_white_grub);
        }
        if(val2.equalsIgnoreCase(p3)){
            diagnosis.setText(p3_diagnosis);
            preventive_measures.setText(p3_prevention);
            treatment.setText(p3_treatment);
            d1_pic.setImageResource(R.drawable.peanut_termites);
        }
        if(val2.equalsIgnoreCase(p4)){
            diagnosis.setText(p4_diagnosis);
            preventive_measures.setText(p4_prevention);
            treatment.setText(p4_treatment);
            d1_pic.setImageResource(R.drawable.peanut_leaf_spot);
        }
        if(val2.equalsIgnoreCase(w1)){
            diagnosis.setText(w1_diagnosis);
            preventive_measures.setText(w1_prevention);
            treatment.setText(w1_treatment);
            d1_pic.setImageResource(R.drawable.wheat_yellow_rust);
        }

        if(val2.equalsIgnoreCase(w2)){
            diagnosis.setText(w2_diagnosis);
            preventive_measures.setText(w2_prevention);
            treatment.setText(w2_treatment);
            d1_pic.setImageResource(R.drawable.wheat_powdery);
        }
        if(val2.equalsIgnoreCase(w3)){
            diagnosis.setText(w3_diagnosis);
            preventive_measures.setText(w3_prevention);
            treatment.setText(w3_treatment);
            d1_pic.setImageResource(R.drawable.wheat_root);
        }
        if(val2.equalsIgnoreCase(w4)){
            diagnosis.setText(w4_diagnosis);
            preventive_measures.setText(w4_prevention);
            treatment.setText(w4_treatment);
            d1_pic.setImageResource(R.drawable.wheat_aphid);
        }





    }
}
