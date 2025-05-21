-- Insert a default client
INSERT INTO client ( name) VALUES ( 'Default Client');

-- Insert a default panier for the client
INSERT INTO panier (panier_id, client_id) VALUES (1, 1);