package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomsList {
//	Rooms Room1 = new Rooms("A1, Staircase Sector", "Using only the flickering lights​ ​from​ ​the​ ​LED’s​ ​in​ ​your​ ​suit,​ ​you​ ​carefully make​ ​your​ ​way​ ​up​ ​the​ ​stairs​ ​holding​ ​onto​ ​the​ ​railing​ ​as​ ​your​ ​boots​ ​grip​ ​the bloody​ ​floor.​ ​At​ ​the​ ​top,​ ​there​ ​are​ ​two​ ​large​ ​automatic​ ​double​ ​doors​ ​to​ ​the east​ ​opening​ ​and​ ​closing​ ​as​ ​if​ ​being​ ​blocked​ ​by​ ​something.", "E1", "", "", "");
//	Rooms Room2 = new Rooms("A2, Lounge 1", "As you enter the dimly​ ​lit​ ​room,​ ​a​ ​feeling​ ​of​ ​normalcy​ ​overcomes​ ​you.​ ​This was​ ​once​ ​a​ ​social​ ​place​ ​full​ ​of​ ​life​ ​as​ ​you​ ​see​ ​a​ ​tv​ ​flickering​ ​and​ ​half​ ​eaten dishes​ ​on​ ​the​ ​table.​ ​Whoever​ ​was​ ​present​ ​left​ ​this​ ​place​ ​with​ ​urgency", "E1, E2", "", "", "");
//	Rooms Room3 = new Rooms("A3, Intensive Care 3", "A vast room full of raggedy​ ​beds​ ​and​ ​worn​ ​blood-stained​ ​medical​ ​rags. Most​ ​of​ ​the​ ​beds​ ​are​ ​occupied​ ​by​ ​what​ ​seems​ ​to​ ​be​ ​empty​ ​vessels​ ​of​ ​the crew.​ ​To​ ​the​ ​west​ ​is​ ​a​ ​supply​ ​closet​ ​that​ ​could​ ​contain​ ​useful​ ​supplies", "E2, E3, E11, E12", "", "", "");
//	Rooms Room4 = new Rooms("A4, Operating Viewing Room", "A very long room​ ​filled​ ​with​ ​mostly​ ​shattered​ ​windows.​ ​Peering​ ​through the​ ​broken​ ​glass,​ ​you​ ​witness​ ​an​ ​automated​ ​operating​ ​machine​ ​on​ ​the​ ​fritz. Perhaps​ ​the​ ​room​ ​contains​ ​details​ ​on​ ​what​ ​happened​ ​to​ ​the​ ​crew", "E3, E4, E5", "", "", "");
//	Rooms Room5 = new Rooms("A5, Operating Room", "Entering the oddly​ ​shaped​ ​room,​ ​the​ ​self​ ​operating​ ​robot​ ​seems​ ​to​ ​be attempting​ ​to​ ​examine​ ​the​ ​remains​ ​of​ ​what​ ​appears​ ​to​ ​be​ ​a​ ​skeleton​ ​with​ ​a perfectly​ ​intact​ ​plastic​ ​cafeteria​ ​tray​ ​still​ ​being​ ​clenched.", "E4", "", "", "");
//	Rooms Room6 = new Rooms("A6, A surprisingly lit​ ​corridor.​ ​Illuminated​ ​on​ ​the​ ​wall​ ​is​ ​a​ ​medi-ki", "E5 E6", "", "", "", "");
//	Rooms Room7 = new Rooms("A7, Lobby 1", "A​ ​massive​ ​room​ ​with​ ​the​ ​floors​ ​covered​ ​in​ ​ceiling​ ​tiles​ ​from​ ​where​ ​part​ ​of the​ ​ceiling​ ​caved​ ​in.​ ​The​ ​tables​ ​and​ ​chairs​ ​are​ ​scattered​ ​along​ ​the​ ​room.", "E6, E7", "", "", "");
//	Rooms Room8 = new Rooms("A8, Hallway 1", "You​ ​walk​ ​this​ ​long​ ​hallway​ ​until​ ​you​ ​intersect​ ​a​ ​large​ ​slimy​ ​substance​ ​that appears​ ​to​ ​awaken.", "E7, E8", "", "", "");
//	Rooms Room9 = new Rooms("A9, Intensive Care Overflow 1", "After defeating​ ​the​ ​grotesque​ ​being,​ ​you​ ​gain​ ​access​ ​to​ ​a​ ​seemingly untouched​ ​room​ ​with​ ​beds​ ​that​ ​still​ ​seem​ ​to​ ​be​ ​made.", "E8, E9", "", "", "");
//	Rooms Room10 = new Rooms("A10, Intensive Care Overflow 2", "Unlike​ ​its​ ​adjoined​ ​room,​ ​this​ ​room​ ​seems​ ​as​ ​if​ ​a​ ​struggle​ ​broke​ ​out.​ ​There are​ ​claw​ ​marks​ ​running​ ​across​ ​the​ ​thick​ ​metal​ ​walls​ ​and​ ​a​ ​stench​ ​of​ ​sewage in​ ​the​ ​air.​ ​The​ ​bathroom​ ​to​ ​the​ ​right​ ​could​ ​be​ ​contributing​ ​to​ ​the​ ​smell", "E9, E10, E11", "", "", "");
//	Rooms Room11 = new Rooms("A11, Medical Wing Bathroom", "The​ ​showers​ ​appear​ ​to​ ​still​ ​be​ ​running,​ ​and​ ​the​ ​flooded​ ​bathroom​ ​makes​ ​it hard​ ​to​ ​shift​ ​through​ ​the​ ​stalls.​ ​There​ ​seems​ ​to​ ​be​ ​a​ ​noise​ ​coming​ ​from​ ​one of​ ​the​ ​stalls.", "E10", "", "", "");
//	Rooms Room12 = new Rooms("A12, Medical Laboratory", "A​ ​high-tech​ ​facility​ ​that​ ​has​ ​chemistry​ ​sets​ ​with​ ​strange substances​ ​in​ ​them.​ ​A​ ​set​ ​of​ ​notes​ ​are​ ​laying​ ​on​ ​the​ ​desk​ ​with​ ​a​ ​video​ ​log acting​ ​as​ ​a​ ​paper​ ​holder.​ ​In​ ​the​ ​corner​ ​of​ ​the​ ​room​ ​is​ ​a​ ​broken​ ​glass​ ​case with​ ​a​ ​piece​ ​of​ ​an​ ​earthy​ ​material​ ​still​ ​occupying​ ​the​ ​case.", "E12", "", "", "");
//	Rooms Room13 = new Rooms("B1, Hallway", "Upon​ ​arrival,​ ​there​ ​appears​ ​to​ ​be​ ​an​ ​unwanted​ ​guest​ ​lurking​ ​at​ ​a​ ​distance. The​ ​lights​ ​above​ ​the​ ​ceiling​ ​keeps​ ​flickering​ ​in​ ​and​ ​out​ ​so​ ​you’re​ ​not perhaps​ ​sure​ ​what​ ​it​ ​maybe​ ​until​ ​it​ ​approaches​ ​closer​ ​towards​ ​your direction.", "E1, E2, E3, E4, E5, E6, E7", "", "", "");
//	Rooms Room14 = new Rooms("B2, Bathroom", "The​ ​bathroom​ ​was​ ​public​ ​to​ ​all​ ​crew​ ​members​ ​and​ ​is​ ​automated​ ​for​ ​the most​ ​part.", "E2", "", "", "");
//	Rooms Room15 = new Rooms("B3, Bedroom", "This​ ​was​ ​where​ ​crew​ ​members​ ​used​ ​sleeping​ ​pods​ ​whenever​ ​it​ ​was appropriate​ ​to​ ​go​ ​rest.", "E3", "", "", "");
//	Rooms Room16 = new Rooms("B4, Bedroom", "This​ ​was​ ​the​ ​captain's​ ​main​ ​office​ ​where​ ​very​ ​important​ ​documents/files​ ​are kept​ ​concealed​ ​in​ ​the​ ​closet​ ​and​ ​desk​ ​drawers. ", "", "", "", "");
//	Rooms Room17 = new Rooms("B5, Planning Room", "This room is where meetings and operations from​ ​a​ ​select​ ​group​ ​of​ ​people were​ ​held.​ ​No​ ​one​ ​is​ ​allowed​ ​in​ ​here​ ​unless​ ​given/obtaining​ ​proper permission.", "", "", "", "");
//	Rooms Room18 = new Rooms("B6, Kitchen", "The kitchen was only​ ​available​ ​for​ ​use​ ​by​ ​cooking​ ​staff.​ ​Apparently,that’s not​ ​the​ ​case​ ​at​ ​this​ ​point.​ ​Seemingly,​ ​food​ ​wasn’t​ ​the​ ​only​ ​thing​ ​being prepared​ ​here.​ ​By​ ​observing​ ​certain​ ​ingredients,​ ​the​ ​virus​ ​may​ ​have​ ​been mixed​ ​in​ ​with​ ​meals​ ​being​ ​served.", "", "", "", "");
//	Rooms Room19 = new Rooms("B7, Cafeteria", "The cafeteria was available to all crew​ ​members​ ​during​ ​open​ ​hours​ ​unless otherwise.​ ​Now​ ​it’s​ ​just​ ​open​ ​to​ ​any​ ​and​ ​everything.​ ​Due​ ​to​ ​the​ ​lack visibility​ ​there​ ​is​ ​in​ ​the​ ​dark,​ ​it’s​ ​fairly​ ​difficult​ ​to​ ​recognize​ ​anything around.", "", "", "", "");
//	Rooms Room20 = new Rooms("C1, Short Hallway", "You​ ​enter​ ​a​ ​small,​ ​dimly​ ​lit​ ​hallway.​ ​The​ ​low​ ​ceiling​ ​feels​ ​like​ ​a​ ​weight​ ​on the​ ​top​ ​of​ ​your​ ​head.​ ​There​ ​are​ ​two​ ​doors​ ​on​ ​opposite​ ​sides​ ​of​ ​the​ ​hallway, but​ ​you​ ​can't​ ​see​ ​anything​ ​beyond​ ​that. ", "", "", "", "");
//	Rooms Room21 = new Rooms("C2, Lounge", "A spacious, comfortble looking room. Couches​ ​and​ ​chairs​ ​line​ ​one​ ​wall, facing​ ​a​ ​large​ ​screen.​ ​There​ ​are​ ​tables​ ​scattered​ ​throughout​ ​the​ ​room​ ​that look​ ​like​ ​they​ ​can​ ​be​ ​used​ ​for​ ​a​ ​variety​ ​of​ ​things:​ ​card​ ​games,​ ​eating, meetings,​ ​or​ ​whatever​ ​else​ ​these​ ​people​ ​did​ ​in​ ​their​ ​free​ ​time. ", "", "", "", "");
//	Rooms Room22 = new Rooms("C3, Bathroom", "A​ ​long,​ ​narrow​ ​bathroom​ ​with​ ​a​ ​few​ ​stalls​ ​and​ ​sinks.​ ​One​ ​of​ ​the​ ​sinks appears​ ​to​ ​have​ ​been​ ​broken,​ ​and​ ​the​ ​slow​ ​drip​ ​of​ ​water​ ​from​ ​the​ ​pipe echoes​ ​in​ ​the​ ​quiet​ ​room.", "", "", "", "");
//	Rooms Room23 = new Rooms("C4, Showers", "Darkness​ ​is​ ​the​ ​only​ ​thing​ ​you​ ​register​ ​when​ ​walking​ ​into​ ​this​ ​room.​ ​You take​ ​out​ ​your​ ​flashlight​ ​and​ ​turn​ ​it​ ​on.​ ​You​ ​sweep​ ​the​ ​white​ ​cone​ ​of​ ​light across​ ​the​ ​room​ ​and​ ​notice​ ​a​ ​human-shaped​ ​form​ ​lying​ ​facedown​ ​below​ ​one of​ ​the​ ​showerheads.", "", "", "", "");
//	Rooms Room24 = new Rooms("C5, North Hall", "This​ ​long,​ ​twisted​ ​hallway​ ​has​ ​several​ ​signs​ ​posted​ ​on​ ​the​ ​walls​ ​with​ ​arrows accompanied​ ​by​ ​some​ ​foreign​ ​language.​ ​These​ ​directions​ ​are​ ​useless​ ​to​ ​you, but​ ​you​ ​keep​ ​calm​ ​and​ ​move​ ​on. ", "", "", "", "");
//	Rooms Room25 = new Rooms("C6, Recreation Room", "You open the doors to a​ ​huge​ ​room​ ​with​ ​firm​ ​rubber​ ​floors.​ ​The​ ​walls​ ​are lined​ ​with​ ​all​ ​types​ ​of​ ​exercise​ ​equipment,​ ​from​ ​stationary​ ​bikes​ ​to​ ​weight lifting​ ​benches. ", "", "", "", "");
//	Rooms Room26 = new Rooms("C7, Locker Room", "A standard locker room, complete with walls of personal lockers​ ​and​ ​a​ ​row of​ ​benches​ ​in​ ​front​ ​of​ ​them.​ ​The​ ​room​ ​has​ ​the​ ​overwhelming​ ​smell​ ​of​ ​bad body​ ​odor", "", "", "", "");
//	Rooms Room27 = new Rooms("C8, Laboratory", "A large, rectangular​ ​room​ ​that​ ​is​ ​loaded​ ​with​ ​all​ ​types​ ​of​ ​research​ ​and experimentation​ ​equipment.​ ​Several​ ​flasks​ ​and​ ​beakers​ ​with​ ​unknown liquids​ ​in​ ​them​ ​are​ ​left​ ​on​ ​some​ ​tables​ ​by​ ​one​ ​wall. ", "", "", "", "");
//	Rooms Room28 = new Rooms("C9, Storage Room", "This room has 6 fairly large storage compartments,​ ​almost​ ​like mini-garages.​ ​4​ ​of​ ​them​ ​are​ ​open,​ ​but​ ​2​ ​are​ ​closed​ ​and​ ​appear​ ​to​ ​be​ ​locked. There​ ​is​ ​a​ ​small​ ​electronic​ ​keypad​ ​in​ ​the​ ​middle​ ​of​ ​the​ ​2​ ​locked​ ​doors.", "", "", "", "");
//	Rooms Room29 = new Rooms("C10, Captain's Hallway", "A long, L-shaped hallway with a couple​ ​of​ ​flickering​ ​lights​ ​on​ ​the​ ​ceiling and​ ​solid​ ​metal​ ​floors​ ​covered​ ​in​ ​debris.​ ​A​ ​4-foot​ ​wide​ ​hole​ ​in​ ​the​ ​southern wall​ ​shows​ ​a​ ​glimpse​ ​of​ ​a​ ​room​ ​with​ ​similar​ ​debris​ ​and​ ​destruction. ", "", "", "", "");
//	Rooms Room30 = new Rooms("C11, Command Room", "You enter a large room ​filled​ ​with​ ​darkness.​ ​From​ ​what​ ​you​ ​can​ ​see,​ ​the whole​ ​of​ ​the​ ​room​ ​is​ ​mostly​ ​destroyed,​ ​it​ ​looks​ ​like​ ​a​ ​big​ ​skirmish happened.​ ​The​ ​far​ ​wall​ ​is​ ​filled​ ​with​ ​knobs,​ ​dials,​ ​switches,​ ​and​ ​buttons, like​ ​it​ ​was​ ​the​ ​control​ ​room​ ​for​ ​this​ ​sector​ ​of​ ​the​ ​ship.​ ​Everything​ ​looks unusable​ ​at​ ​this​ ​point,​ ​however. ", "", "", "", "");
//	Rooms Room31 = new Rooms("D1, Cryo-Storage", "You​ ​enter​ ​a​ ​massive​ ​chamber​ ​and​ ​instantly​ ​notice​ ​how​ ​cold​ ​it​ ​is.​ ​Looking around​ ​you​ ​see​ ​many​ ​drawers​ ​and​ ​compartments​ ​with​ ​control​ ​panels,​ ​all​ ​the compartments​ ​are​ ​kept​ ​at​ ​extremely​ ​low​ ​precise​ ​temperatures​ ​to​ ​preserve bio-materials ", "", "", "", "");
//	Rooms Room32 = new Rooms("D2, Incubation", "You see 3 large​ ​machines​ ​with​ ​large​ ​round​ ​glass​ ​tanks​ ​stretching​ ​from​ ​the floor​ ​to​ ​the​ ​ceiling,​ ​one​ ​of​ ​them​ ​is​ ​completely​ ​demolished,​ ​another​ ​looks beyond​ ​repair​ ​and​ ​oozing​ ​some​ ​unidentifiable​ ​bio-waste,​ ​and​ ​the​ ​third appears​ ​like​ ​it​ ​hasn’t​ ​been​ ​used​ ​in​ ​ages.​ ​Looking​ ​at​ ​the​ ​large​ ​tanks,​ ​it​ ​looks like​ ​something​ ​might​ ​have​ ​been​ ​grown​ ​in​ ​these… ", "", "", "", "");
//	Rooms Room33 = new Rooms("D3, Lobby", "An area used more​ ​to​ ​connect​ ​important​ ​rooms​ ​to​ ​each​ ​other,​ ​you​ ​feel​ ​very disoriented​ ​by​ ​the​ ​excessive​ ​flickering​ ​lights", "", "", "", "");
//	Rooms Room34 = new Rooms("D4, DNA Library", "A surprisingly well lit and seemingly well maintained​ ​area,​ ​you​ ​see​ ​a​ ​huge grid​ ​of​ ​glowing​ ​blue​ ​light​ ​along​ ​the​ ​walls​ ​going​ ​from​ ​the​ ​floor​ ​to​ ​the ceiling.​ ​The​ ​light​ ​outlining​ ​compartments​ ​in​ ​the​ ​wall,​ ​they​ ​seem​ ​very​ ​secure and​ ​functional​ ​even​ ​now​ ​until​ ​you​ ​find​ ​one​ ​that​ ​has​ ​malfunctioned,​ ​you​ ​are able​ ​to​ ​make​ ​it​ ​extend​ ​fully​ ​and​ ​you​ ​examine​ ​the​ ​hundreds​ ​of​ ​tiny​ ​vials​ ​in this​ ​compartment​ ​alone,​ ​and​ ​looking​ ​at​ ​the​ ​labels,​ ​they​ ​must​ ​contain​ ​DNA of​ ​various​ ​organisms.​ ​If​ ​there’s​ ​this​ ​many​ ​in​ ​just​ ​one​ ​compartment,​ ​how many​ ​could​ ​there​ ​be​ ​in​ ​the​ ​dozens​ ​of​ ​other​ ​compartments? ", "", "", "", "");
//	Rooms Room35 = new Rooms("D5, Arboretum", "You​ ​are​ ​amazed​ ​by​ ​what​ ​you​ ​see​ ​when​ ​you​ ​finally​ ​enter​ ​this​ ​massive​ ​room. Here​ ​in​ ​deep​ ​space​ ​is​ ​a​ ​thriving​ ​eco-system​ ​like​ ​a​ ​huge​ ​terrarium.​ ​What​ ​was likely​ ​originally​ ​meant​ ​to​ ​grow​ ​and​ ​care​ ​for​ ​plant​ ​and​ ​maybe​ ​even​ ​animal life​ ​that​ ​could​ ​be​ ​useful​ ​to​ ​the​ ​crew​ ​and​ ​was​ ​once​ ​likely​ ​a​ ​neatly​ ​maintained garden​ ​has​ ​been​ ​completely​ ​reclaimed​ ​by​ ​the​ ​nature​ ​which​ ​the​ ​crew attempted​ ​to​ ​tame.​ ​Looking​ ​around​ ​you​ ​see​ ​what​ ​looks​ ​like​ ​many​ ​familiar plants,​ ​as​ ​well​ ​as​ ​other​ ​more​ ​exotic​ ​or…alien​ ​varieties ", "", "", "", "");
//	Rooms Room36 = new Rooms("D6, Suspension Chambers", "You enter a long room​ ​and​ ​along​ ​the​ ​wall​ ​are​ ​dozens​ ​of​ ​pods​ ​which​ ​seem​ ​to be​ ​used​ ​to​ ​place​ ​living​ ​things​ ​in​ ​a​ ​state​ ​of​ ​suspended​ ​animation​ ​so​ ​that​ ​they can​ ​be​ ​preserved​ ​and​ ​reawoken​ ​at​ ​a​ ​much​ ​later​ ​date,​ ​unfortunately​ ​they​ ​do not​ ​appear​ ​to​ ​be​ ​functional​ ​thanks​ ​to​ ​the​ ​state​ ​of​ ​the​ ​ship ", "", "", "", "");
//	Rooms Room37 = new Rooms("D7, Arboretum Control", "You enter a large room with many control pannels and screens,​ ​you​ ​can​ ​see out​ ​a​ ​window​ ​into​ ​the​ ​lush​ ​terrarium​ ​like​ ​forest​ ​in​ ​the​ ​Arboretum", "", "", "", "");
//	Rooms Room38 = new Rooms("D8, Hallway", "The hallway almost​ ​completely​ ​dark​ ​other​ ​than​ ​the​ ​still​ ​functioning​ ​lights along​ ​the​ ​floor,​ ​it​ ​may​ ​be​ ​wise​ ​to​ ​proceed​ ​with​ ​caution", "", "", "", "");
//	Rooms Room39 = new Rooms("D9, Clean Room", "The room was once quite prestine, there are huge vents in the ceiling, this was​ ​originally​ ​a​ ​room​ ​used​ ​to​ ​sanitize​ ​crew​ ​members​ ​but​ ​is​ ​now​ ​no​ ​longer functional", "", "", "", "");
//	Rooms Room40 = new Rooms("D10, Lobby", "You enter a lounge-like lobby are introducing​ ​you​ ​to​ ​this​ ​secluded​ ​section of​ ​the​ ​ship,​ ​what​ ​was​ ​once​ ​a​ ​place​ ​of​ ​relaxation​ ​for​ ​the​ ​members​ ​of​ ​the​ ​crew who​ ​worked​ ​here​ ​is​ ​now​ ​in​ ​disarray ", "", "", "", "");
//	Rooms Room41 = new Rooms("D11, Bathroom", "Not​ ​much​ ​to​ ​see,​ ​simply​ ​a​ ​bathroom​ ​for​ ​the​ ​people​ ​working​ ​in​ ​this​ ​sector ", "", "", "", "");
//	Rooms Room42 = new Rooms("D12, Head of Bioengineering", "You enter what appears to be a very high tech office​ ​or​ ​workspace,​ ​it​ ​looks like​ ​it’s​ ​gone​ ​almost​ ​untouched​ ​until​ ​you​ ​arrived,​ ​this​ ​must​ ​have​ ​been where​ ​whoever​ ​managed​ ​this​ ​sector​ ​must​ ​have​ ​done​ ​their​ ​job", "", "", "", "");

	
	
	
	public ArrayList<Rooms> readFile() {
		ArrayList<Rooms> roomsList = new ArrayList<Rooms>();
		
		try {
			Scanner fileReader = new Scanner(new File("Rooms.txt"));
			String line = "";
			while (fileReader.hasNextLine()) {
				line = fileReader.nextLine();
				String[] lineList = line.split(",");
				Rooms rooms = new Rooms(lineList[0], lineList[1],lineList[2],lineList[3],lineList[4],lineList[5],lineList[6]);
				roomsList.add(rooms);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return roomsList;
		
	}
	

}
/** Change room# to room ID **/
