SRC_DIR=src
BIN_DIR=bin

all: $(BIN_DIR)/ecommerce

$(BIN_DIR)/ecommerce: $(SRC_DIR)/ecommerce/*.java
	mkdir -p $(BIN_DIR)
	javac -d $(BIN_DIR) $(SRC_DIR)/ecommerce/*.java

clean:
	rm -rf $(BIN_DIR)
