package mikera.matrixx.algo.decompose.bidiagonal;

import mikera.matrixx.AMatrix;

/**
 * @author prasant
 */
public interface BidiagonalResult {

	/**
     * Returns the bidiagonal matrix.
     *
     * @param B If not null the results are stored here, if null a new matrix is created.
     * @return The bidiagonal matrix.
     */
    public AMatrix getB( boolean compact );
    
    /**
     * Returns the orthogonal U matrix.
     *
     * @param U If not null then the results will be stored here.  Otherwise a new matrix will be created.
     * @return The extracted Q matrix.
     */
    public AMatrix getU( boolean transpose , boolean compact );
    
    /**
     * Returns the orthogonal V matrix.
     *
     * @param V If not null then the results will be stored here.  Otherwise a new matrix will be created.
     * @return The extracted Q matrix.
     */
    public AMatrix getV( boolean transpose , boolean compact );
    
}
