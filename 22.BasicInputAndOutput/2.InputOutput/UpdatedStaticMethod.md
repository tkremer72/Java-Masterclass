# Updated static method that reads from the file

static {//This block of code gets initialized once
//Read the locations
Scanner scanner = null;
try {
scanner = new Scanner(new FileReader("locations.txt"));
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
} finally {
if(scanner != null) {
scanner.close();
}
}

        //Read the exits
   try {
            scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                //int loc = scanner.nextInt();
                //scanner.skip(scanner.delimiter());
                //String direction = scanner.next();
                //scanner.skip(scanner.delimiter());
                //String dest = scanner.nextLine();
                //int destination = Integer.parseInt(dest);

String input = scanner.nextLine();
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
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
   
