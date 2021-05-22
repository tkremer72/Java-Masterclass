# Locations.java static method using try with resources, removed the scanner in the read exits
try block because don't need it anymore. 

static {//This block of code gets initialized once
//Read the locations
try(Scanner scanner = new Scanner(new FileReader("locations_big.txt"))) {
scanner.useDelimiter(",");
while(scanner.hasNextLine()) {
int loc = scanner.nextInt();
scanner.skip(scanner.delimiter());
String description = scanner.nextLine();
System.out.println("Imported location: " + loc + ": " + description);
Map<String, Integer> tempExit = new HashMap<>();
locations.put(loc, new Location(loc, description, tempExit));
}
} catch(IOException e) {
e.printStackTrace();
}
//Read the exits
try (BufferedReader directionsFile = new BufferedReader(new FileReader("directions_big.txt"))) {
String input;
while((input = directionsFile.readLine()) != null) {
String[] data = input.split(",");
int loc = Integer.parseInt(data[0]);
String direction = data[1];
int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
