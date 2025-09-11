class SalesCore {
	public:
		SalesScore (string title) {
			setStoreTitle (title);
		}
		
		void setStoreTitle (string title) {
			storeTitle = title;
		}
		
		string getStoreTitle() {
			return storeTitle;
		}
		
		void bootSystem (string storeTitle) {
			cout << "Score de Vendas!\n" << storeTitle << endl;
		}
		
	private:
		string storeTitle;
};